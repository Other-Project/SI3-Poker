package poker;

/**
 * Card patterns
 *
 * @author Team B
 */
public enum Patterns {
    /**
     * Four cards of the same value
     */
    FOUR_OF_A_KIND,

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
