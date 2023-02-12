package liftdesign;

import java.util.List;

public class InnerButton {

    public  List<Integer> innerButtons;

    public void addFloor(int floor) {
        if(!innerButtons.contains(floor))innerButtons.add(floor);
    }

    public void removeFloor(int floor){
        innerButtons.remove(floor);
    }
}
