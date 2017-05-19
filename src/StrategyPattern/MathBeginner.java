package StrategyPattern;

/**
 * This is an implementation of MathStrategy
 */
public class MathBeginner implements MathStrategy{

    /**
     * Prints out the message.
     */
    @Override
    public void doSomeMath() {
        System.out.println("Damn, it's too hard with these equations.");
    }
}
