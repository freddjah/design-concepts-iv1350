package FactoryPattern;

/**
 * Created by fredrik on 5/19/17.
 */
public class Main {
    public static void main(String[] args){
        Factory factory = new Factory();
        factory.printProductsThatCanBeCreated();

        AbstractProduct firstProduct = factory.createProduct("Lamp");
        AbstractProduct secondProduct = factory.createProduct("Hoverboard");
        AbstractProduct thirdProduct = factory.createProduct("Phone");

        firstProduct.printProductSpecification();
        secondProduct.printProductSpecification();
        thirdProduct.printProductSpecification();
    }
}
