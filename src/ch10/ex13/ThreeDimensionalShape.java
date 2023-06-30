package ch10.ex13;

public abstract class ThreeDimensionalShape extends Share implements Area, Volume {
    private boolean isThreeDimensionalShape;

    public ThreeDimensionalShape() {
        isThreeDimensionalShape = true;
    }

    public boolean isThreeDimensionalShape() {
        return isThreeDimensionalShape;
    }
}
