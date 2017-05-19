package CompositePattern;

import java.util.ArrayList;

/**
 * Created by fredrik on 5/18/17.
 */
public class Main {
    public static void main(String[] args){

        ArrayList<Component> list = new ArrayList<>();
        list.add(new GraphicsCardAsLeaf());
        list.add(new HarddriveAsLeaf());
        list.add(new MotherboardAsLeaf());

        ComputerAsComposite computer = new ComputerAsComposite(list);

        System.out.println("Total cost: " + computer.getCost());

    }
}
