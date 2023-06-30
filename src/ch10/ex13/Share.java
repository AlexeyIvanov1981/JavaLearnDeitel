package ch10.ex13;

public abstract class Share{
    private double numA;
    private double numB;

    public Share(double length, double width) {
        this.numA = length;
        this.numB = width;
    }

    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        if (numA <= 0.0) {
            throw new IllegalArgumentException("Length must be more 0.0");
        } else {
            this.numA = numA;
        }
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        if (numB <= 0.0) {
            throw new IllegalArgumentException("Width must be more 0.0");
        } else {
            this.numB = numB;
        }
    }
}
