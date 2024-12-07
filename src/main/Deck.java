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
}
