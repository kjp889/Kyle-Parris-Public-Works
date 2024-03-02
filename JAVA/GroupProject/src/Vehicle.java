/**
 * Parent for all vehicle types
 * @author Kyle Parris
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;

public abstract class Vehicle {
    protected String licensePlateNumber;
    protected String brand;
    protected String model;
    protected String color;
    protected String engineSize;
    protected String fuelType;
    protected String transmissionType;
    protected int year;
    protected int seatingCapacity;
    protected double mileage;
    protected double ratePerDay;
    protected String rentalStatus;

    public static final String DATA_FILE = "Cars4Rent Vehicles" + App.DATASTORE_TXT_EXT;
    
    public Vehicle() {
        this.licensePlateNumber = "";
        this.brand = "";
        this.model = "";
        this.year = 0;
        this.color = "";
        this.engineSize = "";
        this.fuelType = "Gas";
        this.transmissionType = "A";
        this.mileage = 0;
        this.seatingCapacity = 0;
        this.rentalStatus = "NOT RENTED";
        this.ratePerDay = 0;
    }

    public Vehicle(
        String licensePlateNumber,
        String brand,
        String model,
        String color,
        String engineSize,
        String fuelType,
        String transmissionType,
        int year,
        int seatingCapacity,
        double mileage,
        double ratePerDay,
        String rentalStatus
    ) throws IllegalArgumentException {
        this.licensePlateNumber = licensePlateNumber;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engineSize = engineSize;
        this.setFuelType(fuelType);
        this.setTransmissionType(transmissionType);
        this.mileage = mileage;
        this.setSeatingCapacity(seatingCapacity);
        this.rentalStatus = rentalStatus;
        this.ratePerDay = ratePerDay;
    }

    /**
     * This is factory method accepts a row from the dataset and creates a Vehicle instance depending on the type column. 
     * i.e. type "Car" creates Car instances, "Truck" creates Truck instances, etc.
     * 
     * @param vehicleRecord
     * @return Vehicle
     */
    public static Vehicle create(String vehicleRecord[]) {
        int typeColumn = 1, towingCapacityColumn = 12, helmetColumn = 13;
        Vehicle vehicle;
        NumberFormat numberFormatter = NumberFormat.getInstance(Locale.US);
        String[] interiorTypes = {"Fabric", "Leather"};

        switch (vehicleRecord[typeColumn].toLowerCase()) {
            case "car":
                Car car = new Car();
                // assign a random interior by generating random 0 or 1
                car.setInteriorType(interiorTypes[(int) (Math.random() * 2)]);
                vehicle = car;
                break;
            case "truck":
                Truck truck = new Truck();
                truck.setTowingCapacity(Double.parseDouble(vehicleRecord[towingCapacityColumn].trim()));
                truck.setInteriorType(interiorTypes[(int) (Math.random() * 2)]);
                vehicle = truck;
                break;
            case "bike":
                Bike bike = new Bike();
                bike.setNumberOfHelmets(Integer.parseInt(vehicleRecord[helmetColumn].trim()));
                vehicle = bike;
                break;
            default:
                vehicle = null;
                break;
        }

        try {
            if (vehicle != null) {
                vehicle.setLicensePlateNumber(vehicleRecord[0].trim());
                vehicle.setBrand(vehicleRecord[2].trim());
                vehicle.setModel(vehicleRecord[3].trim());
                vehicle.setColor(vehicleRecord[5].trim());
                vehicle.setEngineSize(vehicleRecord[6].trim());
                vehicle.setFuelType(vehicleRecord[7].trim());
                vehicle.setTransmissionType(vehicleRecord[8].trim());
                vehicle.setYear(Integer.parseInt(vehicleRecord[4].trim()));
                vehicle.setSeatingCapacity(Integer.parseInt(vehicleRecord[10].trim()));
                vehicle.setMileage(numberFormatter.parse(vehicleRecord[9].trim()).doubleValue());
                vehicle.setRatePerDay(numberFormatter.parse(vehicleRecord[11].trim().replace("$ ", "")).doubleValue());
                vehicle.setRentalStatus(App.rentedPlates.containsKey(vehicle.getLicensePlateNumber()) ? "RENTED" : "NOT RENTED");
            }
        } catch (ParseException parseException) {
            System.err.println(parseException.getMessage());
        }

        return vehicle;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) throws IllegalArgumentException {
        if (fuelType.equalsIgnoreCase("gas") || fuelType.equalsIgnoreCase("diesel")) {
            this.fuelType = fuelType;
        } else {
            throw new IllegalArgumentException("Invalid fuel type '" + fuelType + "'. Fuel type must be either Gas or Diesel.");
        }
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) throws IllegalArgumentException {
        if (transmissionType.equalsIgnoreCase("a") || transmissionType.equalsIgnoreCase("m") || transmissionType.equalsIgnoreCase("cvt")) {
            this.transmissionType = transmissionType;
        } else {
            throw new IllegalArgumentException("Invalid transmission type '" 
                + transmissionType 
                + "'. Transmission type must be either A, M, or CVT."
            );
        }
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) throws IllegalArgumentException {
        if (seatingCapacity < 0) {
            throw new IllegalArgumentException("Seating capacity must be greater than 0.");
        }

        this.seatingCapacity = seatingCapacity;
    }

    public String getRentalStatus() {
        return rentalStatus;
    }

    public void setRentalStatus(String rentalStatus) {
        this.rentalStatus = rentalStatus;
    }

    public double getRatePerDay() {
        return ratePerDay;
    }

    public void setRatePerDay(double ratePerDay) {
        this.ratePerDay = ratePerDay;
    }

    /**
     * Searches the vehicle file for rows where the column value matches the given search term.
     * 
     * @param searchColumn - The 0 based column to search by
     * @param searchTerm - The value to search for in the given column
     * 
     * @return A list of rows for the file where the value of searchColumn matches the search term
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static ArrayList<String[]> searchVehicles(int searchColumn, String searchTerm) throws FileNotFoundException, IOException {
        ArrayList<String[]> matchedRows = new ArrayList<String[]>();
        BufferedReader fileReader = new BufferedReader(new FileReader(DATA_FILE));
        String line;

        matchedRows.add(fileReader.readLine().split("\t")); // read header row, it is always returned with the search results

        while ((line = fileReader.readLine()) != null) { // read each remaining row until end of file
            String row[] = line.split("\t"); // create a row by splitting the line into columns

            // if the value at row index of searchColumn matches the search term or if search term is empty
            // then add the row to the list of matched rows;
            if (searchTerm.equalsIgnoreCase(row[searchColumn].trim()) || searchTerm.isEmpty()) {
                matchedRows.add(row);

                if (searchColumn == 0 && searchTerm.isEmpty() == false) { // if the search column was lic plate stop the search
                    break;
                }
            }
        }

        fileReader.close();
        
        return matchedRows;
    }

    /**
     * Returns all vehicles in the data file
     * 
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static ArrayList<String[]> searchVehicles() throws FileNotFoundException, IOException {
        return searchVehicles(0, "");
    }

    @Override
    public String toString() {
        return "License Plate Number: " + licensePlateNumber + "\nBrand: " + brand + "\nModel: " + model + "\nYear: "
            + year + "\nColor: " + color + "\nEngine Size: " + engineSize + "\nFuel Type: " + fuelType
            + "\nTransmission Type: " + transmissionType + "\nMileage: " + mileage + "\nSeating Capacity: "
            + seatingCapacity + "\nRate Per Day: " + ratePerDay + "\nRental Status: " + rentalStatus;
    }
}
