package liftdesign;

public class LiftMain {
    public static void main(String[] args) {

        Building building=new Building(12,"Nirala Estate");
        Lift lift1 =new Lift();
        lift1.setLiftId(1);
        InnerButton innerButton=new InnerButton();
        innerButton.addFloor(3);
        innerButton.addFloor(5);
        innerButton.addFloor(11);
        innerButton.addFloor(1);
        innerButton.addFloor(3);
        LiftController liftController=new LiftController(lift1,innerButton, building);
        liftController.run();
    }
}
