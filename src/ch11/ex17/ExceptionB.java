package ch11.ex17;

public class ExceptionB extends ExceptionA{
    @Override
    public String toString() {
        return "Exception B! " + getMessage();
    }
}
