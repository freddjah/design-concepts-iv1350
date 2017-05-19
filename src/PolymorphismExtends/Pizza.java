package PolymorphismExtends;

import java.util.ArrayList;

/**
 * Pizza is the superclass which Hawaii is based upon. All Pizzas have Tomato sauce and Cheese in this example, but every
 * type of pizza is free to add other toppings the the ArrayList toppings.
 */
public class Pizza {
    private ArrayList<String> toppings = new ArrayList<>();

    /**
     * Generic base for all Pizzas, they will all have Tomato sauce and cheese.
     */
    public Pizza(){
        this.toppings.add("Tomato sauce");
        this.toppings.add("Cheese");
    }

    /**
     * Returns the toppings of the current instance whether it's a class that extends the Pizza class or the Pizza class
     * itself.
     * @return The topping list as <code>ArrayList</code>
     */
    public ArrayList<String> getToppings(){
        return this.toppings;
    }

    /**
     * Adds a topping to of the current instance whether it's a class that extends the Pizza class or the Pizza class
     * itself.
     *
     * @param topping The topping to be added as <code>String</code>.
     */
    public void setTopping(String topping){
        this.toppings.add(topping);
    }
}
