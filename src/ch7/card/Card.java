package ch7.card;

public class Card {

    private final String FACE;
    private final String SUIT;

    public Card(String faceCard, String suitCard) {
        this.FACE = faceCard;
        this.SUIT = suitCard;
    }

    public String toString() {
        return FACE + " of " + SUIT;
    }
}
