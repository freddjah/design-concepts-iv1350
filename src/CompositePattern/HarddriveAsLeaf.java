package CompositePattern;

/**
 * Just a basic class that acts as a leaf (or child) to the composite (or parent). In this case ComputerAsComposite.
 * When I say as a child, I mean in a tree structure way, not as a subclass. It implements the Component interface.
 */
public class HarddriveAsLeaf implements Component {
    private float cost = 510;

    /**
     * Implements the getCost method of the Component.
     * @return The cost as <code>float</code>.
     */
    public float getCost() {
        System.out.println("Currently fetching the cost of Harddrive. Which is: " + this.cost);
        return this.cost;
    }
}
