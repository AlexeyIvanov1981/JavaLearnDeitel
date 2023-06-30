package ch10.ex13;

public class Triangle extends TwoDimensionalShape {
    private double sizeA;
    private double sizeB;

    public Triangle(double sizeA, double sizeB) {
        if (sizeA <= 0.0) {
            throw new IllegalArgumentException("Size A must be more 0.0");
        } else this.sizeA = sizeA;
        if (sizeB <= 0.0) {
            throw new IllegalArgumentException("Size B must be more 0.0");
        } else this.sizeB = sizeB;
    }

    public double getSizeA() {
        return sizeA;
    }

    public void setSizeA(double sizeA) {
        if (sizeA <= 0.0) {
            throw new IllegalArgumentException("Size A must be more 0.0");
        } else this.sizeA = sizeA;
    }

    public double getSizeB() {
        return sizeB;
    }

    public void setSizeB(double sizeB) {
        if (sizeB <= 0.0) {
            throw new IllegalArgumentException("Size B must be more 0.0");
        } else this.sizeB = sizeB;
    }

    @Override
    public double getArea() {
        return sizeA * sizeB / 2;
    }

    @Override
    public String toString() {
        return super.toString() + " 'Triangle' " + " Area: " + getArea();
    }
}
