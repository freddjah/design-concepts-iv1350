package FactoryPattern;

/**
 * The abstract class that different factories can be based upon. For instance, you can create products based upon
 * the string that's being passed.
 */
abstract class AbstractFactory {

    /**
     * Creates an instance of an implementation of the <code>AbstractProduct</code>.
     * @param string A string that can be used as a way to create specific products.
     * @return An intance of an implementation of an <code>AbstractProduct</code>.
     */
    abstract AbstractProduct createProduct(String string);

}
