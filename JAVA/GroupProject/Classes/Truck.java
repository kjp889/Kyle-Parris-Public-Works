/**
 * @author Kyle Parris
 */
public class Truck extends Vehicle {
    private String interiorType;
    private double towingCapacity;

    public Truck() {
        super();
        this.interiorType = "Fabric";
        this.towingCapacity = 0.00;
    }

    public Truck(
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
        String interiorType,
        double towingCapacity
    ) throws IllegalArgumentException {
        super(licensePlateNumber, brand, model, color, engineSize, fuelType, transmissionType, year, seatingCapacity, mileage, ratePerDay, rentalStatus);
        this.setInteriorType(interiorType);
        this.setTowingCapacity(towingCapacity);
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

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) throws IllegalArgumentException {
        if (towingCapacity < 0) {
            throw new IllegalArgumentException("Invalid towing capacity. The towing capacity must be greater than 0.");
        }

        this.towingCapacity = towingCapacity;
    }

    @Override
    public String toString() {
        return String.format(
            "%s\n%s: %s\n%s: %s",
            super.toString(),
            "Interior Type:",
            interiorType,
            "Towing Capacity:",
            towingCapacity
        );
    }
}
