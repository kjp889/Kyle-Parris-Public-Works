/**
 * Rental class - manages rentals within the system
 * 
 * @author Brandon Franklyn
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.DateTimeException;
import java.util.ArrayList;

public class Rental {
    private Vehicle vehicle;
    private String customerName;
    private String homeAddress;
    private String phoneNumber;
    private Date dateRented;
    private Date expectedReturnDate;
    private Date actualReturnDate;
    private double depositPaid;
    private static int rentalCount = 0;

    public Rental() throws IndexOutOfBoundsException {
        incrementRentalCount();

        this.customerName = "";
        this.homeAddress = "";
        this.phoneNumber = "";
        this.dateRented = new Date();
        this.expectedReturnDate = new Date();
        this.actualReturnDate = new Date();
        this.depositPaid = 0.00;
    }

    public Rental(Vehicle vehicle, User customer) throws IndexOutOfBoundsException {
        incrementRentalCount();

        this.vehicle = vehicle;
        this.customerName = customer.getFullName();
        this.homeAddress = customer.getAddress();
        this.phoneNumber = customer.getPhoneNumber();
        this.dateRented = new Date();
        this.expectedReturnDate = new Date();
        this.actualReturnDate = new Date();
        this.depositPaid = 0.00;
    }

    public Rental(Vehicle vehicle, String customerName, String homeAddress, String phoneNumber, Date dateRented,
            Date expectedReturnDate, Date actualReturnDate, double depositPaid) throws IndexOutOfBoundsException {
        incrementRentalCount();

        this.vehicle = vehicle;
        this.customerName = customerName;
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
        this.dateRented = dateRented;
        this.expectedReturnDate = expectedReturnDate;
        this.actualReturnDate = actualReturnDate;
        this.depositPaid = depositPaid;
    }

    public Rental(Vehicle vehicle, User customer, Date dateRented, Date expectedReturnDate, Date actualReturnDate, double depositPaid) throws IndexOutOfBoundsException {
        incrementRentalCount();

        this.vehicle = vehicle;
        this.customerName = customer.getFullName();
        this.homeAddress = customer.getAddress();
        this.phoneNumber = customer.getPhoneNumber();
        this.dateRented = dateRented;
        this.expectedReturnDate = expectedReturnDate;
        this.actualReturnDate = actualReturnDate;
        this.depositPaid = depositPaid;
    }

    public boolean saveToFile(String filePath, boolean append) {
        boolean recordSaved = true;

        if (this.vehicle == null || filePath.isEmpty()) {
            return false;
        }
        
        try {
            FileWriter rentalsFile = new FileWriter(filePath, append);
            String row = String.format(
                "%s\t%s\t%s\t%s\t%s\t%s\t%.2f\n",
                getVehiclePlateNo(),
                customerName,
                homeAddress,
                phoneNumber,
                dateRented,
                expectedReturnDate,
                depositPaid
            );

            rentalsFile.write(row);
            rentalsFile.close();
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
            recordSaved = false;
        }

        return recordSaved;
    }

    public boolean saveToFile(String filePath) {
        return saveToFile(filePath, true);
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getVehiclePlateNo() {
		return vehicle.getLicensePlateNumber();
	}

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateRented() {
        return dateRented;
    }

    public void setDateRented(Date dateRented) {
        this.dateRented = dateRented;
    }

    public Date getExpectedReturnDate() {
        return expectedReturnDate;
    }

    public void setExpectedReturnDate(Date expectedReturnDate) throws DateTimeException {
        if (this.dateRented.isAfter(expectedReturnDate)) {
            throw new DateTimeException("The expected return date cannot be before the date rented (" + dateRented + ").");
        }
        
        this.expectedReturnDate = expectedReturnDate;
    }

    public Date getActualReturnDate() {
        return actualReturnDate;
    }

    public void setActualReturnDate(Date actualReturnDate) throws DateTimeException {
        if (this.dateRented.isAfter(actualReturnDate)) {
            throw new DateTimeException("The actual return date cannot be before the date rented (" + dateRented + ").");
        }

        this.actualReturnDate = actualReturnDate;
    }

    public double getDepositPaid() {
        return depositPaid;
    }

    public void setDepositPaid(double depositPaid) {
        this.depositPaid = depositPaid;
    }

    public void printReceipt() {
        int daysRented = dateRented.daysUntil(expectedReturnDate);
        boolean isLate = actualReturnDate.isAfter(expectedReturnDate);
        double deposit = daysRented * getVehicle().getRatePerDay();
        double lateFee = isLate ? expectedReturnDate.daysUntil(actualReturnDate) * 2500 : 0;
        double finalCost = deposit + lateFee;

        System.out.println("\n===============================");
        System.out.printf("%-12s%3d x %12.2f\n", "Deposit:", daysRented, getVehicle().getRatePerDay());
        System.out.printf("%-14s%16.2f\n", "Late Fee:", lateFee);
        System.out.printf("%-14s%16.2f\n", "Final Cost:", finalCost);
        System.out.println("===============================");
        
        decrementRentalCount();
        App.pause();
    }

    public static ArrayList<Rental> getRentals(File rentalsFile) throws FileNotFoundException, IOException {
        ArrayList<Rental> customerRentals = new ArrayList<Rental>(User.MAX_RENTALS);
        BufferedReader fileReader = null;

        try {
            if (rentalsFile.exists() && rentalsFile.length() > 0) {
                ArrayList<String[]> vehicleSearchResult;
                Vehicle vehicle;
                String row;
                int platNoCol = 0;

                fileReader = new BufferedReader(new FileReader(rentalsFile));
                rentalCount = 0; // reset rental count because new rental instances will be created from the rental file

                while ((row = fileReader.readLine()) != null) {  
                    String[] fields = row.split("\t");
                    Rental rental = new Rental();
                    vehicleSearchResult = Vehicle.searchVehicles(platNoCol, fields[platNoCol]);

                    if (vehicleSearchResult.size() == 2) {
                        vehicle = Vehicle.create(vehicleSearchResult.get(1));
                        rental.setVehicle(vehicle);
                    }

                    rental.setCustomerName(fields[1].trim());
                    rental.setHomeAddress(fields[2].trim());
                    rental.setPhoneNumber(fields[3].trim());
                    rental.setDateRented(Date.parse(fields[4].trim()));
                    rental.setExpectedReturnDate(Date.parse(fields[5].trim()));
                    rental.setDepositPaid(Double.parseDouble(fields[6].trim()));

                    customerRentals.add(rental);
                }
            }
        } catch (FileNotFoundException fileNotFoundException) {
            throw fileNotFoundException;    // re-thrown to be handled by caller
        } catch (IOException ioException) {
            throw ioException;
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }

        return customerRentals;
    }

    @Override
    public String toString() {
        return vehicle.toString() 
            + String.format(
                "\nCustomer Name: %s\nHome Address: %s\nPhone No.: %s\nDate Rented: %s\nExpected Return Date: %s\nDeposit: $%.2f",
                customerName,
                homeAddress,
                phoneNumber,
                dateRented,
                expectedReturnDate,
                depositPaid
            );
    }

    private static void decrementRentalCount() {
        rentalCount -= 1;

        if (rentalCount < 0) {
            rentalCount = 0;
        }
    }

    private static void incrementRentalCount() throws IndexOutOfBoundsException {
        if (rentalCount < User.MAX_RENTALS) {
            rentalCount++;
        } else {
            throw new IndexOutOfBoundsException("You have reached your rental quota. Return one or more of your rentals to be able to rent again.");
        }
    }
}
