package ch10.makingADifference;

public class Building implements CarbonFootprint {
    private String buildAddress; //название строения
    private int peopleCount; //количество жильцов
    private final int carbonDioxideFromPersonInYear = 528 * 365;

    public Building(String buildAddress, int peopleCount) {
        this.buildAddress = buildAddress;
        this.peopleCount = peopleCount;
    }

    public String getBuildAddress() {
        return buildAddress;
    }

    public void setBuildAddress(String buildAddress) {
        this.buildAddress = buildAddress;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    @Override
    public double getCarbonFootprint() {
        return getPeopleCount() * carbonDioxideFromPersonInYear;
    }

    @Override
    public String toString() {
        return String.format("Building with name %s and with %d people carbon: %.2f",
                getBuildAddress(), getPeopleCount(), getCarbonFootprint());
    }
}
