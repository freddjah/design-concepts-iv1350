package PolymorphismExtends;

/**
 * Class Hawaii extends the Pizza class, which basically means that it inherits its variables and methods. It is also
 * possible to override methods if wanted.
 */
public class Hawaii extends Pizza{

    /**
     * The constructor sets the correct toppings of the pizza
     */
    public Hawaii(){
        this.setTopping("Ham");
        this.setTopping("Ananas");
        this.setTopping("Shrimp");
    }
}
