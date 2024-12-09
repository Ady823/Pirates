public class Player{
    private static int playerCount = 0;
    private int cardCount;
    private int[] cards;

    public  Player() {
        cards = new int[8];
        playerCount++;
        cardCount = 0;
    }

    public static int playerCount() {
        return playerCount;
    }
    public int cardCount() {
        return cardCount;
    }
    public void setCard(int cardNum) {
        cards[cardCount] = cardNum;
    }
    public int[] showCards(){
        return cards;
    }


}