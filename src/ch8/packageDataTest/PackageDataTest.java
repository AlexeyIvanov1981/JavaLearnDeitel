package ch8.packageDataTest;

public class PackageDataTest {
    public static void main(String[] args) {
        PackageData packageData = new PackageData();
        System.out.printf("%nbefore change variable: %n%s%n", packageData);

        packageData.number = 70;
        packageData.string = "Goodbye";

        System.out.printf("after change variable: %n%s%n", packageData);
    }
}

class PackageData{
    String string;
    int number;

    public PackageData (){
        string = "Hello";
        number = 0;
    }

    public String toString (){
        return String.format("Number: %d; String: %s.%n", number, string);
    }

}
