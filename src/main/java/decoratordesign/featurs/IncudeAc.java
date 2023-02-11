package decoratordesign.featurs;

import decoratordesign.CarBaseClass;

public class IncudeAc extends CarBaseClass{
    private CarBaseClass carBaseClass;
    public IncudeAc(CarBaseClass carBaseClass){
        this.carBaseClass=carBaseClass;
    }

    @Override
    public int cost() {
        return this.carBaseClass.cost()+10000;
    }
}
