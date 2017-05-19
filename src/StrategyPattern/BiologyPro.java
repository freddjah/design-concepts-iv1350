package StrategyPattern;

/**
 * This is an implementation of BiologyStrategy
 */
public class BiologyPro implements BiologyStrategy {

    /**
     * Prints out the message.
     */
    @Override
    public void doSomeBiology() {
        System.out.println("Ezpz. I know that water is H2O.");
    }
}
