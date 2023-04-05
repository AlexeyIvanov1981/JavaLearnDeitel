package ch7.ex8;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class Ex8 {
    public static void main(String[] args) {
        int[] g = new int[11];

        for (int i = 0; i < g.length; i++) {
            if ((i + 1) % 5 == 0) {
                g[i] = 8;
            } else g[i] = 1;
        }
//        for (int i = 0; i < g.length; i++) {
//            System.out.printf("Element %d = %d%n", i + 1, g[i]);
//        }

        double[] c = new double[100];
        for (int i = 0; i < c.length; i++){
            c[i] = (i + 1) * 2.65;
        }
        double total = 0.0;
        for (double value : c){
            total += value;
        }
        System.out.println(total);

        int[] b = new int[34];

        System.arraycopy(g, 0, b, 0, g.length);
        System.out.println(Arrays.toString(g));
        System.out.println(Arrays.toString(b));

        SecureRandom random = new SecureRandom();

        double[] w = new double[99];
        for (int i = 0; i < w.length; i++){
            w[i] = random.nextDouble(10);
        }
        System.out.println(Arrays.toString(w));

        double min = 100.0;
        double max = 0.0;

        for (double value : w){
            if (value > max)
                max = value;
            if (value < min)
                min = value;
        }
        System.out.printf("%nMin value in array w is: %.2f", min);
        System.out.printf("%nMax value in array w is: %.2f", max);



    }



}
