/**
 * @author Kyle Parris
 */
public class Bike extends Vehicle {
    private int numberOfHelmets;

    public Bike() {
        super();
        this.numberOfHelmets = 1;
    }

    public Bike(
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
        String rentalStatus,
        int numberOfHelmets
    ) throws IllegalArgumentException {
        super(licensePlateNumber, brand, model, color, engineSize, fuelType, transmissionType, year, seatingCapacity, mileage, ratePerDay, rentalStatus);
        this.setNumberOfHelmets(numberOfHelmets);
    }

    public int getNumberOfHelmets() {
        return numberOfHelmets;
    }

    public void setNumberOfHelmets(int numberOfHelmets) throws IllegalArgumentException {
        if (numberOfHelmets < 1 || numberOfHelmets > 2) {
            throw new IllegalArgumentException("Invalid number of helmets. Number of helmets must be either 1 or 2.");
        }

        this.numberOfHelmets = numberOfHelmets;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s %s", super.toString(), "No. Of Helmets:", numberOfHelmets);
    }
}
