package ch8.time;


public class Time1Test {

    public static void main(String[] args) {


        Time1 time = new Time1();


        displayTime("After time object is created", time);
        System.out.println();

        time.setTime(13, 26, 18);
        displayTime("After calling setTime", time);
        System.out.println();

        try {
            time.setTime(99, 99, 99);
        } catch (IllegalArgumentException e) {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }

        displayTime("After calling satTime with invalid value", time);


    }

    private static void displayTime(String header, Time1 t) {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
                header, t.toUniversalString(), t.toString());
    }
}
