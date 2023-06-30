package ch10.ex13;

public abstract class ThreeDimensionalShape extends Share implements Area, Volume {
    private double height;

    public ThreeDimensionalShape(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0.0) {
            throw new IllegalArgumentException("Height must be more 0.0");
        } else {
            this.height = height;
        }
    }
}
