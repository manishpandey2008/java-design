package decoratordesign;

import decoratordesign.featurs.IncludeAirBag;
import decoratordesign.featurs.IncudeAc;

public class DecoratorDesignMain {
    public static void main(String[] args) {

        CarBaseClass carBaseClass=new SuvCarBase();
        CarBaseClass carBaseClass2=new IncudeAc(carBaseClass);
        CarBaseClass carBaseClass3=new IncludeAirBag(carBaseClass2);
        CarBaseClass carBaseClass4=new IncudeAc(carBaseClass3);

        System.out.println(carBaseClass4.cost());

    }
}
