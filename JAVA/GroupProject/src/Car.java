/**
 * @author Kyle Parris
 */
public class Car extends Vehicle {
    private String interiorType;

    public Car() {
        super();
        this.interiorType = "Fabric";
    }

    public Car(
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
        String interiorType
    ) throws IllegalArgumentException {
        super(licensePlateNumber, brand, model, color, engineSize, fuelType, transmissionType, year, seatingCapacity, mileage, ratePerDay, rentalStatus);
        this.setInteriorType(interiorType);
    }

    public String getInteriorType() {
        return interiorType;
    }

    public void setInteriorType(String interiorType) throws IllegalArgumentException {
        if (interiorType.equalsIgnoreCase("leather") || interiorType.equalsIgnoreCase("fabric")) {
            this.interiorType = interiorType;
        } else {
            throw new IllegalArgumentException("Invalid interior type. Interior type can only be 'Fabric' or 'Leather'.");
        }
    }

    @Override
    public String toString() {
        return String.format("%s\n%s %s", super.toString(), "Interior Type:", interiorType);
    }

    
}
