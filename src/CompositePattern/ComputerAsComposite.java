package CompositePattern;

import java.util.ArrayList;

/**
 * The Computer of this example is the Composite of this example. Think of it like a parent that has several children,
 * a branch that has several leaves etc. It implements the Component interface, which is important for the composite pattern.
 */
public class ComputerAsComposite implements Component{
    private ArrayList<Component> computerParts;

    /**
     * Constructs the ComputerAsComposite.
     * @param computerParts Just some computerparts given as an <code>ArrayList</code>
     */
    ComputerAsComposite(ArrayList<Component> computerParts){
        this.computerParts = computerParts;
    }

    /**
     * This is where the magic happens. Since we know that our children (or leaves) will also have to implement the same
     * interface, Component, we use the interface as our type when iterating. This means that we can iterate over several
     * different implementations and still be certain that we can call getCost and get the type of return that we want.
     *
     * This just iterates through the computer parts and calls getCost on each Component implementation, and sums it up.
     * @return The sum of all the parts of the computer.
     */
    public float getCost() {
        System.out.println("I'm gonna go into the computer and get the costs of the different parts.");
        float calculatedCost = 0;
        for (Component component : computerParts)
            calculatedCost += component.getCost();
        return calculatedCost;
    }
}
