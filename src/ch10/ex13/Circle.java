package ch10.ex13;

public class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0.0) {
            throw new IllegalArgumentException("Radius must be more 0.0");
        } else this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0.0) {
            throw new IllegalArgumentException("Radius must be more 0.0");
        } else this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + " 'Circle' ";
    }
}
