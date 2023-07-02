package ch10.makingADifference;

public class Bicycle implements CarbonFootprint {
    private int bikeCount;

    private final int carbonDioxideFromBikeInYear = 1000 * 365;

    public Bicycle(int bikeCount) {
        this.bikeCount = bikeCount;
    }

    public int getBikeCount() {
        return bikeCount;
    }

    public void setBikeCount(int bikeCount) {
        this.bikeCount = bikeCount;
    }

    @Override
    public double getCarbonFootprint() {
        return getBikeCount() * carbonDioxideFromBikeInYear;
    }

    @Override
    public String toString() {
        return String.format("Number of bike %d allocates carbon: %.2f", getBikeCount(), getCarbonFootprint());
    }
}
