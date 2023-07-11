package ch11.ex16;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            CalculateClass calculateClass = new CalculateClass(1, 0);
        } catch (ExceptionA exceptionA) {
            System.out.println(exceptionA);
        }
    }
}
