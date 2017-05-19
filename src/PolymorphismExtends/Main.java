package PolymorphismExtends;

/**
 * Created by fredrik on 5/18/17.
 */
public class Main {
    public static void main(String[] args){
        Pizza hawaii = new Hawaii();
        Pizza capricciosa = new Capricciosa();
        PizzaMaker baker = new PizzaMaker();
        baker.makePizza(hawaii);
        baker.makePizza(capricciosa);


    }
}
