package StrategyPattern;

/**
 * This is an implementation of MathStrategy
 */
public class MathPro implements MathStrategy {

    /**
     * Prints out the message.
     */
    @Override
    public void doSomeMath() {
        System.out.println("I know the answer. It's 4.");
    }
}
