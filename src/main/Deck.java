import java.util.Arrays;
public class Deck{ 
    int[] deckArray = new int[55];
    int productFactor = 56;

    public Deck(){

        int deckVal = 1; 

        for(int i = 0; i < deckArray.length;){
            for(int j = deckVal; j > 0; j--){
                deckArray[i] = deckVal;
                i++;
            }  
            deckVal++;
        }

    }
    public int[] getArray(){
        return deckArray;
    }

    /*picks a random value from deckArray, puts it first in the shuffled Deck. Then removes that value from the first array 
    using two loops
    */
    public int[] shuffledDeck(){
        int[] shuffledDeck = new int[55];

        for (int i = 0; i < deckArray.length - 1; i++) {
            
            int[] newArray = new int[productFactor - 1];

            System.out.println(Arrays.toString(newArray));
            int randomCard = newArray[(int)(Math.random() * productFactor)];
            shuffledDeck[i] = newArray[randomCard];
            productFactor--;

            for(int j = 0; j < i; j++){
                newArray[j] = newArray[j]; 
            }
            for(int j = i + 1; j < deckArray.length - 1; j++){
                newArray[j] = newArray[j + 1];
            }
        }
        return shuffledDeck;
    }
}

