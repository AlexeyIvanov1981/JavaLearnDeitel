package ch7.card;

public class DeckOfCardsTest {
    public static void main(String[] args) {
        DeckOfCards myDeck = new DeckOfCards();
        myDeck.shuffle();

        for (int i = 1; i <= 52; i++) {
            System.out.printf("%-23s", myDeck.dealCard());
            if (i % 4 == 0) System.out.println();
        }
    }
}
