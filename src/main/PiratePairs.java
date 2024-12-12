import java.util.Arrays;

public class PiratePairs {

    public static void main(String[] args) {
        // player constructors
        boolean gameEnd = false;
        Player player1 = new Player();

        Player player2 = new Player();
        Player[] players = { player1, player2 };

    

        Deck deck1 = new Deck();
        deck1.shuffledDeck();

        while (gameEnd == false) {
            int card = deck1.getNextCard();
            if (player1.has(card)) {
                player1.addPoints(card);
                System.out.println("player 1 has " + player1.points());
            } else {
                player1.takeCard(card);
            }
        }
        while (gameEnd == false) {
            int card = deck1.getNextCard();
            if (player2.has(card)) {
                player1.addPoints(card);
                System.out.println("player 2 has" + player2.points());
            } else {
                player2.takeCard(card);
            }
        }

        while (gameEnd == false) {
            if player1.points(60 / player1.playerCount() + 1) {
                gameEnd = true;
                System.out.println("Player2 wins");
            }
        }
        while (gameEnd == false) {
            if (player2.points(60 / player1.playerCount() + 1) {
                gameEnd = true;
                System.out.println("Player2 wins");
        }

        while(gameEnd == false) {
            if (player1.loss() == true) {
                deck1.addToDiscard(player1.showCards());
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
 /*    public void pair(){
        while (gameEnd == false) {
            int card = deck1.getNextCard();
            if (player1.has(card)) {
                player1.addPoints(card);
                System.out.println("player 1 has " + player1.points());
                gameEnd = true;
            } else {
                player1.takeCard(card);
            }
        }
    } */
}

// public int checkPoints(Player player) {
// int points = 0;
// while(!loss) {
// for (int i = 0; i < player.showCards().length; i++) {
// points += //the next
// }
// return points;
// }
