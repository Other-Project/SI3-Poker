package poker;

/**
 * Hand
 * @author Team B
 */

public class Hand {
    private final Card[] cards;

    /**
     * Hand constructor
     * @param hand a tab of cards
     */
    public Hand(Card[] hand){
        this.cards = hand;
    }

    /**
     * Gets cards
     */
    public Card[] getCards() {
        return cards;
    }

    @Override
    public String toString() {
        String string = "";
        for (Card card : cards) {
            string = string + card.toString() + " ";
        }
        return string;
    }


    /**
     * Swap method used in the sort method ; swap two cards based on their indexes
     */
    private void swap(int indexCard1, int indexCard2) {
        Card carteTest = this.cards[indexCard1];
        this.cards[indexCard1] = this.cards[indexCard2];
        this.cards[indexCard2] = carteTest;
    }

    /**
     * Sort the hand in descending order
     */
    public void sortHand(){
        for (int i = 0; i< cards.length; i++){
            int swapIndex = i;
            for (int j=i+1;j< cards.length;j++){
                if (cards[swapIndex].compareTo(cards[j]) < 0) {
                    swapIndex = j;
                }
            }
            swap(i, swapIndex);
        }
    }

    public int[] occurrences(){
        var values = new int[Value.values().length];
        for (Card card : cards){
            values[card.getValue().ordinal()]++;
        }
        return values;
    }
}
