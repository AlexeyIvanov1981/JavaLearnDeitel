package ch5;

import java.util.ArrayList;
import java.util.Arrays;

public class Letters {
    public static void main(String[] args) {
        String word = "tata";
        char[] character = word.toCharArray();
        int index = character.length;
        char[] reverse = new char[index];
        int index1 = 0;

        for(int i = index - 1; i >= 0; i--) {
            reverse[index1] = character[i];
            ++index1;
        }

        Boolean result = Arrays.equals(character, reverse);

        if (result) {
            System.out.println("it's OK");
        } else {
            System.out.println("it's bad");
        }
        System.out.println(Arrays.toString(reverse));
        System.out.println(Arrays.toString(character));

    }
}
