package ch14;

public class StringConcatenation {
    public static void main(String[] args) {


        String s1 = "Happy ";
        String s2 = "helle";

        System.out.printf("s1 = %s%ns2 = %s%n", s1, s2);

        System.out.printf("Result of s1.concat(s2) = %s%n", s1.concat(s2));

        System.out.printf("s1 after concat = %s%n", s1);

        StringBuilder sb = new StringBuilder(s2);
        sb.reverse();

        String s3 = sb.toString();

        System.out.println(s3);

        if (s3.equals(s2)) System.out.println("It's OK");
        else System.out.println("It's not OK");


    }
}
