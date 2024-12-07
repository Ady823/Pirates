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

    /*pick a random value from deckArray, put it first in the shuffled Deck. Then remove that value from the first array 
    using two loops
    */
    public int[] shuffledDeck(){
        int[] shuffledDeck = new int[55];

        for (int i = 0; i < deckArray.length - 1; i++) {

            int randomCard = deckArray[(int)(Math.random() * productFactor)];
            shuffledDeck[i] = deckArray[randomCard];
            productFactor--;

            for(int j = 0; j < i; j++){
                deckArray[j] = deckArray[j]; 
            }
            for(int j = i + 1; j < deckArray.length - 1; j++){
                deckArray[j] = deckArray[j + 1];
            }
        }
        return shuffledDeck;
    }
}
