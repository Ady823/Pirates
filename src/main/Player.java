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

    private void playerTurn(){
        if (cardCount == 0) {
            takeCard();
        }
    }
    private void takeCard(){
        boolean search = true;
        while(search){
            for (int i = 0; i < cards.length; i++){
                if (cards[i] == 0) {
                    cards[i] = topCard(); 
                    search = false;
                }
            }
        }
    }
    private int topCard(int[] deck){
        int topCard = 0;
        while(topCard == 0) {
            for(int i = deck.length; i >= 0; i++){
                if (deck[i] != 0) {
                    topCard = deck[i];
                }
            }
        }
        return topCard;
    }

}