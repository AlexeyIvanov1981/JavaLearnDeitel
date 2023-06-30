package ch10.ex13;

public abstract class ThreeDimensionalShape extends Shape implements Area, Volume {

    public abstract double getArea();

    public abstract double getVolume();

    @Override
    public String toString() {
        return "Three Dimensional Shape";
    }

}
