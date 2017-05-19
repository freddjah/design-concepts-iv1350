package ObserverPattern;

/**
 * Created by fredrik on 5/18/17.
 */
public class Main {
    public static void main(String[] args){

        ObservedClass theClassWeWantToObserve = new ObservedClass();
        ObserverClass theClassThatObserves = new ObserverClass();
        theClassWeWantToObserve.addObserver(theClassThatObserves);

        theClassWeWantToObserve.addItem("Sausage");
        theClassWeWantToObserve.addItem("Milk");
        theClassWeWantToObserve.addItem("Coffee");
        theClassWeWantToObserve.addItem("Toilet paper");

        System.out.println("");

        theClassThatObserves.printItems();
    }
}
