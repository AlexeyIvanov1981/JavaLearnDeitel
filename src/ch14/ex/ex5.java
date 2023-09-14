package ch14.ex;

import java.util.Random;

public class ex5 {
    public static void main(String[] args) {
        String[] article = {"the", "a", "one", "some", "anny"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drive", "jump", "run", "walk", "skip"};
        String[] preposition = {"to", "from", "over", "under", "on"};

        for (int i = 0; i < 20; i++) {
            String articleWord = article[randomNumber(article.length)];
            String nounWord = noun[randomNumber(article.length)];
            String verbWord = verb[randomNumber(article.length)];
            String prepositionWord = preposition[randomNumber(article.length)];
            StringBuilder sb = new StringBuilder();
            String result = sb.
                    append(articleWord).
                    append(" ").
                    append(nounWord).
                    append(" ").
                    append(verbWord).
                    append(" ").
                    append(prepositionWord).
                    append(".").toString();

            System.out.println(result.substring(0, 1).toUpperCase() + result.substring(1));
        }


    }

    public static int randomNumber(int endNumber) {
        Random random = new Random();
        return random.nextInt(endNumber);
    }
}
