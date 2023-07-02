package ch10.makingADifference;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<CarbonFootprint> carbonFootprints = new ArrayList<>();

        carbonFootprints.add(0, new Car(100));
        carbonFootprints.add(1, new Bicycle(100));
        carbonFootprints.add(2, new Building("1", 10));

        for (CarbonFootprint carbonFootprint : carbonFootprints) {
            System.out.println(carbonFootprint);
        }
    }
}
