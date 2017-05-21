package FactoryPattern;

/**
 * This is the Factory, it returns a new instance of some implementation of AbstractProduct depending on the input given.
 * Based upon the AbstractFactory.
 */
public class Factory extends AbstractFactory {

    /**
     * Returns an instance of an implementation of the AbstractProduct abstract class. This way you can simply state in the view
     * that the return type is a AbstractProduct rather than a specific implementation. Super good for creating these during runtime.
     * @param type The type of product you wish to return as <code>String</code>.
     * @return Returns an instance of the product you wished for.
     */
    public AbstractProduct createProduct(String type){

        if (type.equals("Lamp"))
            return new Lamp();
        else if (type.equals("Phone"))
            return new Phone();
        else if (type.equals("Hoverboard"))
            return new Hoverboard();
        else
            return null;

    }

    /**
     * Prints the products it can create, not the best implementation of this but... yeah.
     */
    public void printProductsThatCanBeCreated(){
        System.out.println("You can create either a Lamp, Phone or Hoverboard.");
    }

}
