package ch14;

public class StringMiscellaneous {
    public static void main(String[] args) {
        String s1 = "hello there";
        char[] charArray = new char[5];

        System.out.printf("s1: %s%n", s1);

        System.out.printf("length of s1 = %s%n", s1.length());

        System.out.printf("The string reversed is: ");

        for (int count = s1.length() - 1; count >= 0; count--){
            System.out.printf("%c", s1.charAt(count));
        }

        s1.getChars(0, 5, charArray, 0);

        System.out.printf("%nThe character array is: ");

        for (char character : charArray){
            System.out.print(character);
        }

        System.out.println();
        char[]secondCharArray = s1.toCharArray();

        System.out.println("Test for array2");
        for (char character : secondCharArray){
            System.out.printf("%c", character);
        }

        System.out.println();
    }
}
