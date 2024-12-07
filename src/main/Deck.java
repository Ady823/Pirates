public class Deck{ 
    int[] deckArray = new int[55];

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
    public int[] shuffleDeck(){
        int[] shuffledDeck = new int[55];

        for (int i = 0; i < deckArray.length; i++) {

            if(deckArray[i] != -1) {
                shuffledDeck[(int)(Math.random() * 56)];
                deckArray[i] = -1;
            }
            
        }
    }
}
