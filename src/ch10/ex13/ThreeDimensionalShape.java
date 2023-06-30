package ch10.ex13;

public abstract class ThreeDimensionalShape extends Shape implements Area, Volume {
    private boolean isThreeDimensionalShape;

    public ThreeDimensionalShape() {
        isThreeDimensionalShape = true;
    }

    public boolean getIsThreeDimensionalShape() {
        return isThreeDimensionalShape;
    }
    public abstract double getArea();

    public abstract double getVolume();
}
