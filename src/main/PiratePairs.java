import java.util.Arrays; 
public class PiratePairs{
    public static void main(String[] args){
        System.out.println("Hello World!");
       // Player player1 = new Player();
        Deck deck1 = new Deck(); 
        System.out.println(Arrays.toString(deck1.getArray()));
        System.out.println(Arrays.toString(deck1.shuffledDeck()));
    }
} 