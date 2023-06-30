package ch10.ex13;

public abstract class TwoDimensionalShape extends Share implements Area{
    private boolean isTwoDimensionalShape;
    public TwoDimensionalShape() {
        isTwoDimensionalShape = true;
    }

    public boolean isTwoDimensionalShape() {
        return isTwoDimensionalShape;
    }
}
