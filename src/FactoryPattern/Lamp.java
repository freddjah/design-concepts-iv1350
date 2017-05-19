package FactoryPattern;

/**
 * The Lamp extends the abstract class Product.
 */
public class Lamp extends Product {

    /**
     * Creates an instance of the Lamp, with hardcoded name and cost.
     */
    public Lamp(){
        this.setName("Lamp");
        this.setCost(15);
    }

}
