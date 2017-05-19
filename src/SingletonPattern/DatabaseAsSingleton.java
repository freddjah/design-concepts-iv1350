package SingletonPattern;

import java.util.ArrayList;

/**
 * This is a database that uses the Singleton Pattern
 */
public class DatabaseAsSingleton {
    private static DatabaseAsSingleton db;
    private ArrayList<String> users;

    /**
     * The constructor is a private method, which means that it can only be accessed from withing. Therefore we can be certain
     * that we only have exactly one instance of this object.
     */
    private DatabaseAsSingleton(){
        this.users = new ArrayList<>();
        addUser("Bart");
        addUser("Homer");
        addUser("Marge");
    }

    /**
     * Returns the instance of the Singleton class, if there is not an instance it will instead call upon the constructor
     * and return a new instance of the DatabaseAsSingleton. But, it can only be one since both the variable db and method
     * is static.
     * @return The database as <code>DatabaseAsSingleton</code>.
     */
    public static DatabaseAsSingleton getInstance(){
        if (db == null){
            db = new DatabaseAsSingleton();
        }
        return db;
    }

    /**
     * Prints out all the users in the database.
     */
    public void printUsers(){
        System.out.println("All users in database");
        for(String user : users)
            System.out.println("User: " + user);
    }

    /**
     * Adds a user to the database.
     * @param user User given as <code>String</code>.
     */
    public void addUser(String user){
        this.users.add(user);
    }
}
