package StrategyPattern;

/**
 * This is the StudentContext, it is built up with implementations of the different Strategy interfaces.
 */
public class StudentContext {
    private MathStrategy mathStrategy;
    private ProgrammingStrategy programmingStrategy;
    private BiologyStrategy biologyStrategy;

    /**
     * The constructor makes use of the implementations of the different interfaces.
     * @param mathStrategy An implementation of the MathStrategy interface is needed.
     * @param programmingStrategy An implementation of the ProgrammingStrategy interface is needed.
     * @param biologyStrategy An implementation of the BiologyStrategy interface is needed.
     */
    public StudentContext(MathStrategy mathStrategy, ProgrammingStrategy programmingStrategy, BiologyStrategy biologyStrategy){
        this.mathStrategy = mathStrategy;
        this.programmingStrategy = programmingStrategy;
        this.biologyStrategy = biologyStrategy;
    }

    /**
     * This prints out a message from an implementation of the MathStrategy. It does not care about what implementation
     * it is, as long as it implements the interface. Therefore we can use different implementations without having to
     * change the code in the StudentContext.
     */
    public void doSomeMath(){
        this.mathStrategy.doSomeMath();
    }

    /**
     * This prints out a message from an implementation of the ProgrammingStrategy. It does not care about what implementation
     * it is, as long as it implements the interface. Therefore we can use different implementations without having to
     * change the code in the StudentContext.
     */
    public void doSomeProgramming(){
        this.programmingStrategy.doSomeProgramming();
    }

    /**
     * This prints out a message from an implementation of the BiologyStrategy. It does not care about what implementation
     * it is, as long as it implements the interface. Therefore we can use different implementations without having to
     * change the code in the StudentContext.
     */
    public void doSomeBiology(){
        this.biologyStrategy.doSomeBiology();
    }
}
