package ch6.ex3;

public class Ex3 {
    public static void main(String[] args) {
        int x = 1;
        int y = 3;

        System.out.printf("absolute value of x - %d%n" +
                "rounds x to the smallest integer not less than x - %f%n" +
                "trigonometric cosine of x (x in radians) - %f%n" +
                "exponential method - %f%n" +
                "rounds x to the largest integer not reater than x - %f%n" +
                "natural logarithm of x (base e) - %,2f%n" +
                "larger value of x and y - %d%n" +
                "smaller value of x and y - %d%n" +
                "x raised to the power y - %f%n" +
                "trigonometric sine of x (x in radians) - %f%n" +
                "square root of x - %f%n" +
                "trigonometric tangent of x (x in radians) - %f%n",
                Math.abs(x), Math.ceil(x), Math.cos(x),
                Math.exp(x), Math.floor(x),Math.log(y),
                Math.max(x, y), Math.min(x, y), Math.pow(x, y),
                Math.sin(x), Math.sqrt(x), Math.tan(x));
    }
}
