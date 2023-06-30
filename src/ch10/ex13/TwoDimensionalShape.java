package ch10.ex13;

public abstract class TwoDimensionalShape extends Shape implements Area{
    private boolean isTwoDimensionalShape;
    public TwoDimensionalShape() {
        isTwoDimensionalShape = true;
    }

    public boolean getIsTwoDimensionalShape() {
        return isTwoDimensionalShape;
    }


    public abstract  double getArea();

}
