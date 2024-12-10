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

        
    }

} 