package ch10.ex13;

public class TestShape {
    public static void main(String[] args) {
        TwoDimensionalShape[] shapes = new TwoDimensionalShape[3];

        shapes[0] = new Circle(2.2);
        shapes[1] = new Square(5.6);
        shapes[2] = new Triangle(2.5, 3.6);

        for (TwoDimensionalShape shape : shapes) {
            System.out.printf("%s - %.2f%n", shape, shape.getArea());

        }

    }
}
