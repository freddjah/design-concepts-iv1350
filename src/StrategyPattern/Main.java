package StrategyPattern;

/**
 * Created by fredrik on 5/19/17.
 */
public class Main {
    public static void main(String[] args){
        StudentContext stephenHawking = new StudentContext(new MathPro(), new ProgrammingPro(), new BiologyNoob());
        StudentContext charlesDarwin = new StudentContext(new MathBeginner(), new ProgrammingNoob(), new BiologyPro());
        StudentContext fredrikEkloof = new StudentContext(new MathBeginner(), new ProgrammingNoob(), new BiologyNoob());

        System.out.println("Stephen Hawking says: ");
        stephenHawking.doSomeMath();
        stephenHawking.doSomeProgramming();
        stephenHawking.doSomeBiology();

        System.out.println("");

        System.out.println("Charles Darwin says: ");
        charlesDarwin.doSomeMath();
        charlesDarwin.doSomeProgramming();
        charlesDarwin.doSomeBiology();

        System.out.println("");

        System.out.println("Fredrik Eklööf says: ");
        fredrikEkloof.doSomeMath();
        fredrikEkloof.doSomeProgramming();
        fredrikEkloof.doSomeBiology();
    }
}
