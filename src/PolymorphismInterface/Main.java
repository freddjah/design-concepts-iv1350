package PolymorphismInterface;

/**
 * Created by fredrik on 5/18/17.
 */
public class Main {
    public static void main(String[] args){
        Fredrik fredrik = new Fredrik();
        fredrik.doWork();
        fredrik.collectSalary();
        System.out.println("Money made so far: " + fredrik.getMoneyMade() + " SEK.");
        fredrik.doWork();
        fredrik.collectSalary();
        System.out.println("Money made so far: " + fredrik.getMoneyMade() + " SEK.");
    }
}
