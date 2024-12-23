import java.util.Arrays;

public class Deck {
    int[] deckArray = new int[55];
    int productFactor = 56;
    int[] discardArray = new int[55];

    public int[] discard() {
        return discardArray;
    }

    public void addToDiscard(int[] deck) {
        for (int i = 0; i < discardArray.length; i++) {
            if (i != 0) {
                discardArray[i] = deck[i];
            }
        }

        discardArray = deck;
    }

    public Deck() {
        int deckVal = 1;

        for (int i = 0; i < deckArray.length;) {
            for (int j = deckVal; j > 0; j--) {
                deckArray[i] = deckVal;
                i++;
            }
            deckVal++;
        }
    }

    public int[] getArray() {
        return deckArray;
    }

    public int[] shuffledDeck() {
        for (int i = deckArray.length - 1; i > 0; i--) {
            int randomIndex = (int) (Math.random() * deckArray.length);
            int temp = deckArray[randomIndex];
            deckArray[randomIndex] = deckArray[i];
            deckArray[i] = temp;
        }
        return deckArray;
    }

    public int getNextCard() {
        int lastCard = deckArray[deckArray.length - 1];
        int[] tempArray = new int[deckArray.length - 1];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = deckArray[i];
        }
        deckArray = tempArray;
        return lastCard;
    }
}
