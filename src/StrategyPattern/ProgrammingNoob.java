package StrategyPattern;

/**
 * This is an implementation of MathStrategy
 */
public class ProgrammingNoob implements ProgrammingStrategy{

    /**
     * Prints out the message.
     */
    @Override
    public void doSomeProgramming() {
        System.out.println("What the hell is a variable?");
    }
}
