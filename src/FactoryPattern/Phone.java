package FactoryPattern;


/**
 * The Phone extends the abstract class Product.
 */
public class Phone extends Product {

    /**
     * Creates an instance of the Phone, with hardcoded name and cost.
     */
    public Phone(){
        this.setName("Iphone");
        this.setCost(600);
    }

}
