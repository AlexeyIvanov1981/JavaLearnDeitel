package ch11.ex16;

public class CalculateClass {
    private int a;
    private int b;

    public CalculateClass(int a, int b) throws ExceptionC {
        if (a <= 0 || b <= 0) {
            throw new ExceptionC();
        }

        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) throws ExceptionC {
        if (a <= 0) {
            throw new ExceptionC();
        }
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) throws ExceptionC {
        if (b <= 0) {
            throw new ExceptionC();
        }
        this.b = b;
    }

    public int calculate() {
        return a / b;
    }

    ;
}
