package ObserverPattern;

import java.util.ArrayList;

/**
 * The class that is being observed.
 */
public class ObservedClass {
    ArrayList<ObserverInterface> observers = new ArrayList<>();
    ArrayList<String> allItems = new ArrayList<>();

    /**
     * Adds an item to the instance <code>ArrayList</code> and notifies the different observers.
     * @param item An item given as String.
     */
    public void addItem(String item){
        this.allItems.add(item);
        notifyObservers(item);
    }

    /**
     * Adds an observer to the Observed class' <code>ArrayList</code> observers.
     * @param observer An observer (who must implement the ObserverInterface)
     */
    public void addObserver(ObserverInterface observer){
        this.observers.add(observer);
    }

    /**
     * Removes an observer
     * @param observer An observer (who must implement the ObserverInterface)
     */
    public void removeObserver(ObserverInterface observer){
        this.observers.remove(observer);
    }

    /**
     * Notifies all the observers in the <code>ArrayList</code>.
     * @param item Given as <code>String</code>.
     */
    private void notifyObservers(String item){
        for (ObserverInterface observer : observers){
            observer.addItem(item);
        }
    }
}
