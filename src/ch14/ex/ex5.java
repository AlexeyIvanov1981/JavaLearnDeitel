package ch14.ex;

import java.util.Random;

import static ch14.ex.RandomNumber.randomNumber;

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

            String result = articleWord + " " + nounWord + " " + verbWord + " " + prepositionWord + ".";

            System.out.println(result.substring(0, 1).toUpperCase() + result.substring(1));
        }
    }
}
class RandomNumber{
    public static int randomNumber(int endNumber) {
        Random random = new Random();
        return random.nextInt(endNumber);
    }
}
