package FactoryPattern;

/**
 * The Hoverboard extends the abstract class Product.
 */
public class Hoverboard extends Product{

    /**
     * Creates an instance of the Hoverboard, with hardcoded name and cost.
     */
    public Hoverboard(){
        this.setName("Hoverboard");
        this.setCost(200);
    }

}
