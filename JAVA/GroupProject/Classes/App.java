
/**
 * Main program
 * @author Kyle Parris
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class App {
    /**
     * System wide standard input scanner.
     */
    static Scanner scanner = new Scanner(System.in);

    /**
     * Maximum length of strings accepted by the system.
     * Stings that go beyond this length will be rejected.
     */
    static final int MAX_STRING_LENGTH = 60;

    /**
     * Memory size required for a string in the system.
     */
    static final int SIZE_OF_STRING = MAX_STRING_LENGTH + Short.BYTES;

    /**
     * Base path for files created and used by the system
     */
    static final String DATASTORE_PATH = "datastore" + File.separator;

    /**
     * Extension for text files created by the app
     */
    static final String DATASTORE_TXT_EXT = ".tsv";

    /**
     * Extension for binary files created by the app
     */
    static final String DATASTORE_BIN_EXT = ".dat";

    public static String RENTED_PLATES_FILE = DATASTORE_PATH + "rented" + DATASTORE_TXT_EXT;

    public static Map<String, String> rentedPlates;

    public static void main(String[] args) throws Exception {
        User user = new User();
        int menuChoice = -1;

        System.out.println("\n\nWELCOME TO CARS4RENT");

        do {
            try {
                System.out.println("\n\nSelect an option from the menu");
                System.out.println("1. Register");
                System.out.println("2. Log In");
                System.out.println("0. Exit");
                System.out.print("\nEnter your choice: ");
                menuChoice = scanner.nextInt();

                switch (menuChoice) {
                    case 1:
                        user.register();
                        break;
                    case 2: // log in
                        System.out.print("\nEnter your ID number: ");
                        user = User.get(scanner.nextLong());
                        break;
                    case 0: // exit
                        // do nothing, the loop will end and cause an exit
                        break;
                    default:
                        System.out.print(menuChoice + " is not a valid option. ");
                        pause(User.TRY_AGAIN_MSG);
                        break;
                }
            } catch (InputMismatchException inputMismatchException) {
                System.out.print("\nThe system did not understand your input. ");
                pause(User.TRY_AGAIN_MSG);
            } catch (FileNotFoundException fileNotFoundException) {
                System.out.print("\nSomething went wrong while connecting to the database. Try again later.");
                pause();
            } catch (IOException ioException) {
                System.out.print("\nSomething went wrong while processing your request. Did you enter a valid ID?");
                pause();
            }
            // continue the loop as long as the user didn't choose exit and there wasn't a
            // successful registration/log in
        } while (menuChoice != 0 && user.getId() == 0);

        if (user.getId() != 0) { // if there was a successful registration/login then start the system
            startApp(user);
        }

        scanner.close();
    }

    public static void startApp(User customer) {
        int menuChoice = -1;
        loadRentedPlates();

        do {
            try {
                System.out.println("\n\nSelect an option from the menu");
                System.out.println("1. View Vehicles");
                System.out.println("2. Search Vehicles");
                System.out.println("3. My Rentals");
                System.out.println("4. Return Vehicle");
                System.out.println("0. Exit");
                System.out.print("\nEnter your choice: ");
                menuChoice = scanner.nextInt();

                switch (menuChoice) {
                    case 1: // view vehicles
                        customer.viewVehicles(Vehicle.searchVehicles());
                        break;
                    case 2: // search vehicles
                        customer.searchVehicles();
                        break;
                    case 3: // My rentals
                        customer.viewRentals();
                        break;
                    case 4: // return vehicle
                        customer.returnVehicle();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.print(menuChoice + " is not a valid option. ");
                        pause(User.TRY_AGAIN_MSG);
                        break;
                }
            } catch (InputMismatchException inputMismatchException) {
                System.out.print("\nYou did not select a number from the menu. ");
                pause(User.TRY_AGAIN_MSG);
            } catch (FileNotFoundException fileNotFoundException) {
                System.out.print("\nSomething went wrong while connecting to the vehicles database. Try again later.");
                pause();
            } catch (IOException ioException) {
                System.out.print("\nSomething went wrong while processing your request.");
                pause();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (menuChoice != 0);
    }

    /**
     * Block I/O until the user hits the ENTER key.
     * 
     * @param message - A message to display to the user while the system is paused
     */
    public static void pause(String message) {
        try {
            System.out.print(message);
            System.in.read();
            scanner.nextLine();
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }

    /**
     * An overloaded version of the pause(String) method that invokes pause with a
     * default message
     */
    public static void pause() {
        pause("\nPress ENTER to continue...");
    }

    public static String getStringFromUser(String prompt) throws IOException {
        BufferedReader inputBuffer = new BufferedReader(new InputStreamReader(System.in));
        boolean isStringValid = false;
        String userInput = "";

        while (isStringValid == false) {
            System.out.print(prompt);
            userInput = inputBuffer.readLine().trim();
            isStringValid = userInput.length() <= MAX_STRING_LENGTH;

            if (!isStringValid) {
                System.err.println("\nThe value entered is too long. Try a value with less than " + MAX_STRING_LENGTH
                        + " character.");
                pause();
            }
        }

        return userInput;
    }

    /**
     * Pad a string with empty spaces so that its length is MAX_STRING_LENGTH
     * 
     * @param string
     * @return The given string expanded to a length of MAX_STRING_LENGTH
     */
    public static String padString(String string) {
        return String.format("%1$" + MAX_STRING_LENGTH + "s", string);
    }

    /**
     * Caches the license plate number of all rented vehicles
     * this is used to keep track of which vehicles are rented
     */
    public static void loadRentedPlates() {
        File datastore = new File(App.DATASTORE_PATH);
        File filesInDatastore[] = datastore.listFiles();
        Scanner rentalFile = null;
        rentedPlates = new HashMap<>();

        try {
            for (File file : filesInDatastore) {
                if (file.getPath().startsWith(User.RENTALS_DATA_FILE + "-")) { // read files that start with "rentals-" e.g. rentals-1.tsv
                    rentalFile = new Scanner(file);

                    while (rentalFile.hasNext()) {
                        String plateNo = rentalFile.nextLine().split("\t")[0];
                        rentedPlates.put(plateNo, plateNo);
                    }
                }
            }
        } catch (IOException ioException) {
            System.err.println("The system was unable to load rented vehicles.");
            pause();
        }

        if (rentalFile != null) {
            rentalFile.close();
        }
    }
}
