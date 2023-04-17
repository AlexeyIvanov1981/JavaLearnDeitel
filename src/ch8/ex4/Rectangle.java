package ch8.ex4;

public class Rectangle {
    private static double length = 1;
    private static double width = 1;


    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (length > 0.0 && length < 20.0) {
            this.width = width;
        }
    }

    public double perimeter(Rectangle rectangle) {
        return (this.length + this.width) * 2;
    }

    public double area(Rectangle rectangle) {
        return this.length * this.width;
    }
}
