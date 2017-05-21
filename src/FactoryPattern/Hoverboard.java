package FactoryPattern;

/**
 * The Hoverboard extends the abstract class AbstractProduct.
 */
public class Hoverboard extends AbstractProduct {

    /**
     * Creates an instance of the Hoverboard, with hardcoded name and cost.
     */
    public Hoverboard(){
        this.setName("Hoverboard");
        this.setCost(200);
    }

}
