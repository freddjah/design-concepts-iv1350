package FactoryPattern;


/**
 * The Phone extends the abstract class AbstractProduct.
 */
public class Phone extends AbstractProduct {

    /**
     * Creates an instance of the Phone, with hardcoded name and cost.
     */
    public Phone(){
        this.setName("Iphone");
        this.setCost(600);
    }

}
