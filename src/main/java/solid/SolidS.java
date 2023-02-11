package solid;

import java.util.Calendar;

class Car{

     String name;
     String color;
     double price;

    public Car(String name, String color,double price) {
        this.name = name;
        this.color = color;
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    //    public double calculateTotalPrice(){
//        double text=15.6;
//        return price+((price*text)/100);
//    }

}

class CarPriceCalculator{
    private Car car;
    CarPriceCalculator(Car car){
        this.car=car;
    }

    public double calculateTotalPrice(double text){
        return this.car.getPrice()+((this.car.getPrice()*text)/100);
    }

}

public class SolidS {
    // Single Responsibility Principal
    // One class is responsible for one task
    public static void main(String[] args) {
        Car car=new Car("A","Red",500000.00);
//        System.out.println(car.calculateTotalPrice());

        CarPriceCalculator carPriceCalculator=new CarPriceCalculator(car);
        System.out.println(carPriceCalculator.calculateTotalPrice(3.6));


        // In this case Car class is responsible for create car object and CarPriceCalculator class is responsible for calculate total amount of car

    }
}
