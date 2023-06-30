package ch10.ex13;

public abstract class TwoDimensionalShape extends Shape implements Area {


    public abstract double getArea();
    @Override
    public String toString() {
        return "Two Dimensional Shape";
    }

}
