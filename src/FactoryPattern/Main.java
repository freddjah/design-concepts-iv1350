package FactoryPattern;

/**
 * Created by fredrik on 5/19/17.
 */
public class Main {
    public static void main(String[] args){
        Factory factory = new Factory();
        factory.printProductsThatCanBeCreated();

        Product firstProduct = factory.createProduct("Lamp");
        Product secondProduct = factory.createProduct("Hoverboard");
        Product thirdProduct = factory.createProduct("Phone");

        firstProduct.printProductSpecification();
        secondProduct.printProductSpecification();
        thirdProduct.printProductSpecification();
    }
}
