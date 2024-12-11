import java.util.Arrays;

public class PiratePairs {

    public static void main(String[] args) {
        // player constructors
        boolean gameEnd = false;
        Player player1 = new Player();

        Player player2 = new Player();
        Player[] players = { player1, player2 };

        System.out.println(players);

        Deck deck1 = new Deck();
        System.out.println(Arrays.toString(deck1.shuffledDeck()));

        while(gameEnd != false) {
        int card = deck1.getNextCard();
        
            if (player1.has(card)){
                gameEnd = true;
            } else {
                player1.takeCard(card);
            }
        }

        int card = deck1.getNextCard();
       
        player1.takeCard(card);
        card = deck1.getNextCard();
        System.out.println(card);
        player2.takeCard(card);
        card = deck1.getNextCard();
        System.out.println(card);
        player1.takeCard(card);
        player2.takeCard(deck1.getNextCard());

        System.out.println(Arrays.toString(player1.showCards()));
        System.out.println(Arrays.toString(player2.showCards()));

        boolean loss = false;
    }
}

// public int checkPoints(Player player) {
// int points = 0;
// while(!loss) {
// for (int i = 0; i < player.showCards().length; i++) {
// points += //the next
// }
// return points;
// }
