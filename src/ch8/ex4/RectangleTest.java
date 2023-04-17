package ch8.ex4;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.setLength(2.3);
        rectangle.setWidth(5.6);

        System.out.printf("Area is: %.2f%n", rectangle.area(rectangle));
        System.out.printf("Perimeter is: %.2f%n", rectangle.perimeter(rectangle));
    }
}
