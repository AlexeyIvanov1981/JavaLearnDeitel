package ch10.ex13;

public class Square extends TwoDimensionalShape{

    private double size;


    public Square(double size) {
        if (size <= 0.0) {
            throw new IllegalArgumentException("Size must be more 0.0");
        } else this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if (size <= 0.0) {
            throw new IllegalArgumentException("Size must be more 0.0");
        } else this.size = size;
    }

    @Override
    public double getArea() {
        return Math.pow(size, 2);
    }
}
