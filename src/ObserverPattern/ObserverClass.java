package ObserverPattern;


import java.util.ArrayList;

/**
 * The Observer class that implements the Observer interface, you can have several different Observer classes that
 * implements the same interface, and you can then add them with the same method (addObserver in ObservedClass) since
 * the parameter is based upon the interface and not a specific implementation.
 */
public class ObserverClass implements ObserverInterface {

    private ArrayList<String> allItems = new ArrayList<>();

    /**
     * Adds the item in the Observer class.
     * @param item An item given as <code>String</code>.
     */
    public void addItem(String item) {
        this.allItems.add(item);
        System.out.println("Added " + item + " to the observer.");
    }

    /**
     * Prints the items that have been stored in the observer.
     */
    public void printItems(){
        System.out.println("All items in the observer:");
        for(String item : allItems)
            System.out.println(item);
        System.out.println("");
    }
}
