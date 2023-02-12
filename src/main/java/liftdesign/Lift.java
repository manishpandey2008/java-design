package liftdesign;

import lombok.Getter;
import lombok.Setter;

import static liftdesign.Movement.UP;

@Getter
@Setter
public class Lift {
    private int liftId;
    private int currentFloor=0;
    private RunningStatus runningStatus=RunningStatus.STOP;
    private Movement movement=UP;

    public void move(int targetFloor,Movement movement){
        this.movement=movement;
        this.runningStatus=RunningStatus.RUNNING;
        System.out.println("Lift move to "+targetFloor);
        updateStatus(true,targetFloor);
    }

    public boolean updateStatus(boolean status,int targetFloor){
        if (!status) return false;
        this.runningStatus=RunningStatus.STOP;
        this.currentFloor=targetFloor;
        return true;
    }

}
