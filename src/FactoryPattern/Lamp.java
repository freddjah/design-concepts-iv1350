package FactoryPattern;

/**
 * The Lamp extends the abstract class AbstractProduct.
 */
public class Lamp extends AbstractProduct {

    /**
     * Creates an instance of the Lamp, with hardcoded name and cost.
     */
    public Lamp(){
        this.setName("Lamp");
        this.setCost(15);
    }

}
