package ch11.ex17;

public class ExceptionA extends Exception{
    @Override
    public String toString() {
        return "Exception A! " + getMessage();
    }
}
