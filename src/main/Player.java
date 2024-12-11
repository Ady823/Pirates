public class Player{
    private static int playerCount = 0;
    private int cardCount;
    private int[] cards;
    private int points;

    public Player() {
        cards = new int[0];
        playerCount++;
        cardCount = 0;
        points = 0;
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

    // private void playerTurn(){ 
    //     if (cardCount == 0) {
    //         takeCard();
    //     } 
    // }
    public void takeCard(int card){ 
        int[] tempCards = new int[cards.length + 1];
        for(int i = 0; i < cards.length; i++) {
            tempCards[i] = cards[i]; 
        }
        tempCards[tempCards.length - 1] = card;
        cards = tempCards;
    } 
    public boolean has(int card){
        boolean has = false;
        for (int i = 0; i < cards.length; i++){
            if (card == cards[i]) {
                has = true;
            }   
        }
        return has;
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

    public int points(){
        return points;
    }
    public void addPoints(int card){
        points += card;
    }
} 