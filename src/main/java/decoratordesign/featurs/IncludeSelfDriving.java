package decoratordesign.featurs;

import decoratordesign.CarBaseClass;

public class IncludeSelfDriving extends CarBaseClass {
    private CarBaseClass carBaseClass;
    public IncludeSelfDriving(CarBaseClass carBaseClass){
        this.carBaseClass=carBaseClass;
    }

    @Override
    public int cost() {
        return this.carBaseClass.cost()+45600;
    }

}
