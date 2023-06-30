package ch10.ex13;

public class Cube extends ThreeDimensionalShape {
    private double sizeA;

    public Cube(double sizeA) {
        if (sizeA <= 0.0) {
            throw new IllegalArgumentException("Size A must be more 0.0");
        } else this.sizeA = sizeA;
    }

    public double getSizeA() {
        return sizeA;
    }

    public void setSizeA(double sizeA) {
        if (sizeA <= 0.0) {
            throw new IllegalArgumentException("Size A must be more 0.0");
        } else this.sizeA = sizeA;
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(sizeA, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(sizeA, 3);
    }

    @Override
    public String toString() {
        return super.toString() + " 'Cube' Area: " + getArea() + " Volume: " + getVolume();
    }
}
