package ch10.ex13;

public class Tetrahedron extends ThreeDimensionalShape {
    private double h;

    public Tetrahedron(double h) {
        if (h <= 0.0) {
            throw new IllegalArgumentException("Tetrahedron must be more 0.0");
        } else this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        if (h <= 0.0) {
            throw new IllegalArgumentException("Tetrahedron must be more 0.0");
        } else this.h = h;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * Math.pow(h, 2);
    }

    @Override
    public double getVolume() {
        return Math.sqrt(2) / 12 * Math.pow(h, 3);
    }

    @Override
    public String toString() {
        return super.toString() + " 'Tetrahedron' Area: " + getArea() + " Volume: " + getVolume();
    }
}
