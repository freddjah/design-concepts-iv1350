package StrategyPattern;

/**
 * This is an implementation of MathStrategy
 */
public class ProgrammingPro implements ProgrammingStrategy {

    /**
     * Prints out the message.
     */
    @Override
    public void doSomeProgramming() {
        System.out.println("God damnit, my code looks great. High encapsulation, low coupling and high cohesion. Ka-ching!");
    }
}
