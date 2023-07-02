package ch10.makingADifference;

public class Car implements CarbonFootprint {
    private int carCount;
    private final int carbonDioxideFromCarInYear = 4000 * 4000;

    public Car(int carCount) {
        this.carCount = carCount;
    }

    public int getCarCount() {
        return carCount;
    }

    public void setCarCount(int carCount) {
        this.carCount = carCount;
    }

    @Override
    public double getCarbonFootprint() {
        return getCarCount() * carbonDioxideFromCarInYear;
    }

    @Override
    public String toString() {
        return String.format("Number of cars %d allocates carbon: %.2f", getCarCount(), getCarbonFootprint());
    }
}
