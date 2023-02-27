package ch4.increment;

public class Increment {
    public static void main(String[] args) {

        int c = 5;

        System.out.printf("c before postincrement: %d%n", c);
        System.out.printf("         postincrement: %d%n", c++);
        System.out.printf("   after postincrement: %d%n", c);

        c = 5;

        System.out.printf("c before preincrement: %d%n", c);
        System.out.printf("         preincrement: %d%n", ++c);
        System.out.printf("   after preincrement: %d%n", c);

    }
}
