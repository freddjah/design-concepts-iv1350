package PolymorphismExtends;

/**
 * The PizzaMaker is the one that bakes the pizza.
 */
public class PizzaMaker {

    /**
     * Prints out every topping on the Pizza instance (no matter if it's an extension or the original Pizza class).
     * This is possible due to every type of Pizza inheriting from Pizza.
     * @param pizza A pizza given as <code>Pizza</code> or as an implementation of the superclass.
     */
    public void makePizza(Pizza pizza){
        System.out.println("Making a pizza with the following ingredients:");
        for (String topping : pizza.getToppings())
            System.out.println(topping);
        System.out.println("");
    }
}
