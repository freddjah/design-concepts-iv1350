package FactoryPattern;

/**
 * The abstract class that the User states as a return in the "view". This way you can extend several implementation based
 * on the Product class and easily return any kind of implementation during runtime.
 */
abstract class Product {

    private String name;
    private double cost;

    /**
     * Returns the name.
     * @return Name as <code>String</code>
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name.
     * @param name Name as <code>String</code>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the cost.
     * @return Cost as <code>double</code>.
     */
    public double getCost() {
        return this.cost;
    }

    /**
     * Sets the cost.
     * @param cost Cost as <code>double</code>.
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * Prints out the name and cost of the product.
     */
    public void printProductSpecification(){
        System.out.println(this.name + " costs " + this.cost + " $.");
    }
}
