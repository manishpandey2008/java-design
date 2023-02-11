package solid;


interface CarD{
    void fun();
}

class SolarCar implements CarD{
    @Override
    public void fun() {

    }
}

class DieselCar implements CarD{
    @Override
    public void fun() {

    }
}

class TestCar{
    private DieselCar dieselCar;
    public TestCar(DieselCar dieselCar){
        this.dieselCar=dieselCar;
    }
}

// In Above implementation TestCar can take only DieselCar class object -------wrong way
// We need to make a class for taking every child implemented classes

class TestCar2{
    private CarD carD;
    public TestCar2(CarD carD){
        this.carD=carD;
    }
}

// Now TestCar2 can take all type of implemented classes like SolarCar or DieselCar classes


public class SolidD {
    public static void main(String[] args) {
        // Dependency Inversion Principle

        new TestCar(new DieselCar());
//        new TestCar(new SolarCar());  // This is not acceptable

        new TestCar2(new DieselCar());
        new TestCar2(new SolarCar());
    }
}
