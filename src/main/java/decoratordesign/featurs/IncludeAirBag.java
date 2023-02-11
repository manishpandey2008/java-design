package decoratordesign.featurs;

import decoratordesign.CarBaseClass;

public class IncludeAirBag extends CarBaseClass{
    private CarBaseClass carBaseClass;
    public IncludeAirBag(CarBaseClass carBaseClass){
        this.carBaseClass=carBaseClass;
    }

    @Override
    public int cost() {
        return this.carBaseClass.cost()+50000;
    }
}
