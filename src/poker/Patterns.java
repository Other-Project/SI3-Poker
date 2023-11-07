package poker;

/**
 * Card patterns
 *
 * @author Team B
 */
public enum Patterns {
    /**
     * 5 cards in a row with the same color
     */
    STRAIGHT_FLUSH,
    /**
     * Four cards of the same value
     */
    FOUR_OF_A_KIND,
    /**
     * Three card of the same value and two cards of the same value
     */
    FULL,
    /**
     * All the cards have the same color
     */
    FLUSH,

    /**
     * 5 cards in a row
     */
    STRAIGHT,

    /**
     * Three cards of the same value
     */
    THREE_OF_A_KIND,

    /**
     * Two sets of two cards of the same value
     */
    DOUBLE_PAIR,

    /**
     * Two cards of the same value
     */
    PAIR,

    /**
     * The highest card
     */
    HIGHER,

    /**
     * Complete equality
     */
    EQUALITY
}
