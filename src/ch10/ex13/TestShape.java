package ch10.ex13;

public class TestShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];

        shapes[0] = new Circle(2.2);
        shapes[1] = new Square(5.6);
        shapes[2] = new Triangle(2.5, 3.6);
        shapes[3] = new Cube(3.6);
        shapes[4] = new Sphere(6.0);
        shapes[5] = new Tetrahedron(3.6);

        for (Shape shape : shapes) {
            System.out.printf("%s %n", shape);
        }

    }
}
