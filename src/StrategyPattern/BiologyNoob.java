package StrategyPattern;

/**
 * This is an implementation of BiologyStrategy
 */
public class BiologyNoob implements BiologyStrategy {

    /**
     * Prints out the message.
     */
    @Override
    public void doSomeBiology() {
        System.out.println("Well, I think that humans are mammals. But that's all I really know.");
    }
}
