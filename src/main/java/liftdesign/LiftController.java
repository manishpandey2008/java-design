package liftdesign;

public class LiftController {

    private final InnerButton innerButton;
    private final Lift lift;
    private final Building building;

    public LiftController(Lift lift, InnerButton innerButton, Building building) {
        this.lift = lift;
        this.innerButton = innerButton;
        this.building = building;
    }

    public void run(){

    }


}
