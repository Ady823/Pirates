import java.util.Arrays; 
public class PiratePairs{

    public static void main(String[] args){
     //player constructors 
       Player player1 = new Player(); 
      
       Player player2 = new Player();
       Player[] players = {player1, player2};
       
       System.out.println(players);

        Deck deck1 = new Deck(); 
        System.out.println(Arrays.toString(deck1.shuffledDeck())); 

        int card = deck1.getNextCard(); 
        for (int i = 0; i <= Player.playerCount(); i++) {
        }
        player1.takeCard(card); 
        card = deck1.getNextCard();
        System.out.println(deck1.getNextCard());
        player2.takeCard(card);
        card = deck1.getNextCard();
        System.out.println(deck1.getNextCard());
        player1.takeCard(card); 
        player2.takeCard(card);
        System.out.println(card);
        System.out.println(Arrays.toString(player1.showCards()));
        System.out.println(Arrays.toString(player2.showCards())); 

        boolean loss = false;



        }
    }
    public int checkPoints(Player player) {
        int points = 0;
        while(!loss) {
            for (int i = 0; i < player.showCards().length; i++) {
                points += //the next 
            }
        return points;
    }

} 