package PolymorphismInterface;

/**
 * WebDeveloper implements the Employee interface and must therefor declare the methods in the interface.
 */
abstract class WebDeveloper implements Employee {

    /**
     * Prints what the WebDeveloper does.
     */
    public void doWork() {
        System.out.println("I'm working with a website");
    }

    /**
     * Returns what the Webdeveloper earns.
     * @return A <code>float</code> with the salary of the WebDeveloper.
     */
    public float earnMoney() {
        return 15000;
    }
}
