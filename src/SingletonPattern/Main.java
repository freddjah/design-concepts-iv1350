package SingletonPattern;

/**
 * Created by fredrik on 5/18/17.
 */
public class Main {
    public static void main(String[] args){
        DatabaseAsSingleton db = DatabaseAsSingleton.getInstance();
        db.printUsers();

        DatabaseAsSingleton newDb = DatabaseAsSingleton.getInstance();
        newDb.addUser("Lisa");

        System.out.println("\nNotice above that I added a user to newDb but I use the printUsers-method on db, but it shows Lisa." +
                "\nThat is because of the Singleton pattern. You can only have one instance of a Singleton class. \n");
        db.printUsers();
    }
}
