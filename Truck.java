public class Truck extends Vehicle {
    private double cargoCapacity;

    private int numberOfAxles;

    public Truck(String brand, double cargoCapacity, int numberOfAxles) {
        super(brand);
        this.cargoCapacity = cargoCapacity;
        this.numberOfAxles = numberOfAxles;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }


    @Override
    public String toString() {
        return "Truck [brand=" + getBrand() + ", cargoCapacity=" + cargoCapacity + ", numberOfAxles=" + numberOfAxles + "]";
    }

    public String displayDetails() {
        return "Truck[brand=" + getBrand() + ",cargoCapacity=" + cargoCapacity + ",numberOfAxles=" + numberOfAxles + "]";
    }
   public String getTypeSpecificData() {
        return "Truck [brand=" + getBrand() + ", cargoCapacity=" + cargoCapacity + ", numberOfAxles=" + numberOfAxles + "]";
    }

}