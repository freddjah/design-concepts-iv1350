package PolymorphismExtends;

/**
 * Class Capricciosa extends the Pizza class, which basically means that it inherits its variables and methods. It is also
 * possible to override methods if wanted.
 */
public class Capricciosa extends Pizza {

    /**
     * The constructor sets the correct toppings of the pizza
     */
    public Capricciosa(){
        this.setTopping("Ham");
        this.setTopping("Mushroom");
    }
}
