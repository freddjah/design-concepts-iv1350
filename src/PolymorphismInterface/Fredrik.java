package PolymorphismInterface;

/**
 * Fredrik extends WebDeveloper (which implements the interface of the Employee).
 */
public class Fredrik extends WebDeveloper{
    private float moneyMade;

    public Fredrik(){}

    /**
     * Adjusts the moneyMade in the instance and adds the salary from the superclass WebDeveloper.
     */
    public void collectSalary(){
        this.moneyMade += this.earnMoney();
    }

    /**
     * Returns the money the instance has made.
     * @return Money returned as <code>float</code>.
     */
    public float getMoneyMade(){
        return this.moneyMade;
    }

}
