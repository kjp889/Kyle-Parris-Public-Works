/**
 * User class - manages user interaction wit the system
 * @author Brandon Franklyn
 * @author Kyle Parris
 */
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class User {
    private long id;
    private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
    private File rentalsFile;
    
    private static final String CUSTOMERS_FILE = App.DATASTORE_PATH + "users" + App.DATASTORE_BIN_EXT;
    static final String RENTALS_DATA_FILE = App.DATASTORE_PATH + "rentals";
    static final String TRY_AGAIN_MSG = "Press ENTER to try again.";
    static final int MAX_RENTALS = 3;
    
    public User() {
        this.firstName = "";
        this.lastName = "";
        this.address = "";
        this.phoneNumber = "";
        this.id = 0;
    }

    public User(String firstName, String lastName, String address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.id = 0;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void register() {
        try {
            System.out.print("To get started please enter your full name: ");
            this.setFirstName(App.scanner.next());
            this.setLastName(App.scanner.next());

            this.setAddress(App.getStringFromUser("Now enter your address so we know where to deliver vehicles you rent: "));
            this.setPhoneNumber(App.getStringFromUser("We'll also need your phone number so we can get in touch with you: "));

            saveToFile();

            if (this.id > 0) {
                this.rentalsFile = new File(String.format("%s-%s%s", RENTALS_DATA_FILE, this.id, App.DATASTORE_TXT_EXT));
                rentalsFile.createNewFile();

                System.out.println("\nYour ID number is :" + this.id + "\nYou'll need it to log into the system so don't forget it.");
                App.pause();
            }

            System.out.println("\n");
        } catch (IOException ioException) {
            System.err.println("Something went wrong during the registration process. The system will try again.");
        }
    }

    public void saveToFile() {
        try {
            File customersFile = new File(CUSTOMERS_FILE);
            customersFile.getParentFile().mkdirs();
            RandomAccessFile fileStream = new RandomAccessFile(customersFile, "rw");
            long fileSize = fileStream.length();
            int sizeOfUser = getSize();

            if (id == 0) { // we are saving a new record
                fileStream.seek(fileSize); // move file pointer to end of file
                
                // set the id for the new record
                // id is calculated by adding one to the number of records in the file (file size divided by the size of a user record)
                id = (fileSize / sizeOfUser) + 1;
            } else { // we are updating a record
                fileStream.seek((id - 1) * sizeOfUser); // move file pointer to the record to update
            }
			
			fileStream.writeLong(id);
			fileStream.writeUTF(App.padString(firstName));
			fileStream.writeUTF(App.padString(lastName));
			fileStream.writeUTF(App.padString(address));
			fileStream.writeUTF(App.padString(phoneNumber));
			fileStream.close();
        } catch (IOException ioException) {
            System.err.println("The system is down at the moment. Please try again later.");
            App.pause();
        }
    }

    public static User get(long userId) throws FileNotFoundException, IOException {
        RandomAccessFile file = null;
        User user = new User();

        try {
            file = new RandomAccessFile(CUSTOMERS_FILE, "r");
            long recordId = 0;

            file.seek((userId - 1) * getSize());
            recordId = file.readLong(); // read ID
            
            user = new User(
                file.readUTF().trim(), // read first name
                file.readUTF().trim(), // read last name
                file.readUTF().trim(), // read address
                file.readUTF().trim()  // phone number
            );

            user.id = recordId;
            // link the user to their rentals
            user.rentalsFile = new File(String.format("%s-%s%s", RENTALS_DATA_FILE, user.id, App.DATASTORE_TXT_EXT));
        } catch (FileNotFoundException fileNotFoundException) {
            throw fileNotFoundException;
        } catch (EOFException eofException) {
            System.err.print("\nA user with id of " + userId + " was not found in the system.");
            App.pause();
        } catch (IOException ioException) {
            throw ioException; 
        } finally {
            if (file != null) {
                file.close();
            }
        }

        return user;
    }

    /**
     * This method prints a tab delimited table of all cars contained in the vehicles file
     * 
     * @param rows - An array containing the rows to display
     * 
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void viewVehicles(ArrayList<String[]> rows) throws FileNotFoundException, IOException {
        for (String row[] : rows) {
            System.out.printf("%-18s", row[0].trim()); // license plate
            System.out.printf("%-8s", row[1].trim()); // type
            System.out.printf("%-15s",row[2].trim()); // brand
            System.out.printf("%-15s",row[3].trim()); // model
            System.out.printf("%-6s", row[4].trim()); // year
            System.out.printf("%-8s", row[5].trim()); // color
            System.out.printf("%-12s", row[6].trim()); // Engine
            System.out.printf("%-10s", row[7].trim()); // fuel
            System.out.printf("%-15s", row[8].trim()); // transmission
            System.out.printf("%-12s", row[9].trim()); // mileage
            System.out.printf("%-18s", row[10].trim()); // seating
            System.out.printf("%-15s", row[11].trim()); // rate
            System.out.printf("%-20s", row[12].trim()); // towing
            System.out.printf("%-10s\n", row[13].trim()); // helmet
        }

        App.pause();
    }

    public void searchVehicles() {
        int searchBy = 0;
        String searchTerm = "", rentVehicle = "n", plateNo = "";
        String columns[] = {"License plate #", "Brand", "Model", "Year"};
        ArrayList<String[]> matchedRows;
        Vehicle vehicle = null;

        do {
            System.out.println("\n\nSearch By:");

            for (int i = 0; i < columns.length; i++) {
                System.out.printf("%d. %s\n", i + 1, columns[i]);
            }

            System.out.println("0. Return to Main Menu");
            System.out.print("\nEnter your choice: ");

            try {
                searchBy = App.scanner.nextInt();

                if (searchBy >= 1 && searchBy <= 4) {
                    int searchColumn = (searchBy == 1) ? 0 : searchBy; // if lic plate is selected offset search column by 1

                    System.out.printf("\nEnter the %s to search for: ", columns[--searchBy]); // offset searchBy by 1 since the columns array starts at 0
                    searchTerm = App.scanner.next();

                    matchedRows = Vehicle.searchVehicles(searchColumn, searchTerm.trim());
                    viewVehicles(matchedRows);

                    if (matchedRows.size() == 2) { // if two rows were returned (total 2 including header row) vehicle was found
                        System.out.print("\nWould you like to rent the vehicle [Y/N]? ");
                        rentVehicle = App.scanner.next();

                        if (rentVehicle.equalsIgnoreCase("y")) {
                            vehicle = Vehicle.create(matchedRows.get(1));
                        } else {
                            // reset search by so the loop goes through another iteration
                            // to give the user a chance to search again
                            searchBy = -1;  
                        }
                    } else if (matchedRows.size() > 2) {
                        System.out.print("\nEnter the license plate number of the vehicle you would like to rent: ");
                        plateNo = App.scanner.next();
                        matchedRows.remove(0); // remove header row because we are now going to search the result set for the give plate#

                        for (String[] row : matchedRows) {
                            if (row[0].equalsIgnoreCase(plateNo.trim())) {
                                vehicle = Vehicle.create(row);
                                break;
                            }
                        }

                        if (vehicle == null) {
                            System.out.println("\nThe plate number " + plateNo + " wasn't found in the search results.");
                            App.pause();
                            searchBy = -1;
                        }
                    }

                    if (vehicle != null) {
                        if (vehicle.rentalStatus.equalsIgnoreCase("rented")) {
                            System.out.print("\nuh-oh, the vehicle is already rented.");
                            App.pause();
                            searchBy = -1;
                        } else {
                            rentVehicle(vehicle);
                        }
                    }
                }
            } catch (InputMismatchException inputMismatchException) {
                System.out.print("\nYou did not select a number from the menu. ");
                App.pause(User.TRY_AGAIN_MSG);
            } catch (IOException ioException) {
                System.err.println(ioException.getMessage());
            }
        } while (searchBy != 0 || searchBy > 4);
    }

    public void rentVehicle(Vehicle vehicle) {
        boolean vehicleRented = false;

        while (!vehicleRented) {
            try {
                Rental rental = new Rental(vehicle, this);
                rental.setExpectedReturnDate(getDateFromUser("Enter the expected return date"));

                System.out.print("\nEnter the amount you have for the deposit: ");
                rental.setDepositPaid(App.scanner.nextDouble());

                vehicleRented = rental.saveToFile(rentalsFile.getPath());

                if (vehicleRented) { // add lic no to the cache
                    App.rentedPlates.put(rental.getVehiclePlateNo(), rental.getVehiclePlateNo());
                    System.out.printf(
                        "\nCongrats you rented the %s %s %s with plate# %s\n",
                        vehicle.getColor(), vehicle.getBrand(), vehicle.getModel(), vehicle.getLicensePlateNumber()
                    );
                } else {
                    System.out.println("Something went wrong while saving the information for your rental.");
                }

                App.pause();
            } catch (IndexOutOfBoundsException iOfBoundsException) { // handle exception thrown when user tries to rent more vehicles than allowed
                System.err.println(iOfBoundsException.getMessage());
                return; // return to main
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("\nYour input doesn't seem to be correct. Please try again.");
            } catch (DateTimeException dateTimeException) {
                System.err.println(dateTimeException.getMessage());
            }
        }
    }

    public void viewRentals() {
        try {
            if (!rentalsFile.exists() || rentalsFile.length() == 0) {
                System.out.print("\nYou have not rented any vehicles yet. ");
                App.pause();
                return;
            }

            // print header row
            System.out.printf(
                "\n%-8s%-20s%-18s%-15s%-15s%-18s%-8s",
                "Plate#",
                "Customer Name",
                "Address",
                "Phone#",
                "Date Rented",
                "Exp. Return Date",
                "Deposit"
            );

            BufferedReader fileReader = new BufferedReader(new FileReader(rentalsFile));
            String row;

            while ((row = fileReader.readLine()) != null) {  
                String[] columns = row.split("\t");

                System.out.printf("\n%-8s",columns[0].trim()); // print license #
                System.out.printf("%-20s", columns[1].trim()); // print customer name
                System.out.printf("%-18s", columns[2].trim()); // print customer address
                System.out.printf("%-15s", columns[3].trim()); // print customer phone #
                System.out.printf("%-15s", columns[4].trim()); // print date rented
                System.out.printf("%-18s", columns[5].trim()); // print print expected return date
                System.out.printf("%-8s", columns[6].trim()); // print deposit paid
            }

            fileReader.close();
            App.pause();
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.print("\nThe system is unavailable at this time. Try again later.");
            App.pause();
        } catch (IOException ioException) {
            System.err.print("\nSomething went wrong while fetching your rentals. Try again later.");
            App.pause();
        }
    }

    public void returnVehicle() {
        String licenseNumber = "";
        ArrayList<Rental> rentals = new ArrayList<Rental>(User.MAX_RENTALS);
        boolean rentalFound = false;
        int rentalIndex = -1;
        
        System.out.print("\nEnter the license plate number of the vehicle you are returning: ");
        licenseNumber = App.scanner.next();

        try {
            rentals = Rental.getRentals(rentalsFile);
        } catch (IOException ioException) {
            System.err.print("Something went wrong while connecting to the vehicles database. ");
            App.pause(TRY_AGAIN_MSG);
        }

        for (Rental rental : rentals) {
            if (rental.getVehiclePlateNo().equalsIgnoreCase(licenseNumber.trim())) {
                rentalFound = true;
                rentalIndex = rentals.indexOf(rental);
                break;
            }
        }

        if (rentalFound) {
            Rental rental = rentals.get(rentalIndex);
            Date returnDate = null;
            double currentMileage = 0;

            while (currentMileage == 0) {
                try {
                    System.out.print("\nEnter the current mileage of the vehicle e.g. 4000: ");
                    currentMileage = App.scanner.nextDouble();

                    if (currentMileage < rental.getVehicle().getMileage()) {
                        System.out.println("\nThe current mileage cannot be less than the mileage when the vehicle was rented (" + rental.getVehicle().getMileage() + "KM).");
                        App.pause(TRY_AGAIN_MSG);
                        currentMileage = 0;
                    }
                } catch (InputMismatchException inputMismatchException) {
                    System.err.print("\nWe did not understand your input. ");
                    App.pause(TRY_AGAIN_MSG);
                    currentMileage = 0;
                }
            }

            while (returnDate == null) {
                try {
                    returnDate = getDateFromUser("Enter the return date");
                    rental.setActualReturnDate(returnDate);
                } catch (DateTimeException dateTimeException) {
                    System.err.println(dateTimeException.getMessage());
                    App.pause(TRY_AGAIN_MSG);
                    returnDate = null;
                }
            }

            rental.getVehicle().setMileage(currentMileage);
            rental.printReceipt();

            App.rentedPlates.remove(rental.getVehiclePlateNo()); // remove from cache
            rentals.remove(rentalIndex); // delete from the list of rentals for this user
            rentalsFile.delete(); // delete this users rental file, it will be recreated with the remaining rentals if any

            for (Rental r : rentals) {
                r.saveToFile(rentalsFile.getPath());
            }

            System.out.println("Thank you for returning the vehicle.");
        } else {
            System.out.println("A vehicle with license plate number " + licenseNumber + " was not found in your rentals.");
        }

        App.pause();
    }

    /**
     * This method accepts a valid date from the user and returns a date object
     * @return date - A Date object representing the date entered by the user
     */
    private Date getDateFromUser(String prompt) {
        BufferedReader inputBuffer = new BufferedReader(new InputStreamReader(System.in));
        String dateString = "", dateParts[];
        Date date = null;

        
        while (date == null) {
            try {
                System.out.print("\n" + prompt + " (D/MM/YYYY) e.g. 8/04/2022: ");
                dateString = inputBuffer.readLine();
                dateParts = dateString.split("/");

                if (dateParts.length != 3) {
                    System.out.println("\nA correct date was not given.");
                } else {
                    int day = Integer.parseInt(dateParts[0]),
                    month = Integer.parseInt(dateParts[1]), 
                    year = Integer.parseInt(dateParts[2]);

                    date = new Date(day, month, year);
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("\nA correct date was not given.");
            } catch (DateTimeException dateTimeException) {
                System.err.println(dateTimeException.getMessage());
                App.pause();
            } catch (IOException ioException) {
                System.err.println(ioException.getMessage());
                App.pause();
            }
        }

        return date;
    }

    /**
     * Calculate and return the size an object of this class occupies on disk.
     * @return space required for storing a user object.
     */
    public static int getSize() {
        // this class has 4 strings (firstName, lastName, address, phoneNumber)
        int sizeOfStrings =  4 * App.SIZE_OF_STRING;
        int sizeOfId = Long.BYTES;

        return sizeOfId + sizeOfStrings;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n"
            + "First Name: " + firstName + "\n"
            + "Last Name: " + lastName + "\n"
            + "Address: " + address + "\n"
            + "Telephone: " + phoneNumber + "\n";
    }
}
