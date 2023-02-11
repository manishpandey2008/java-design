package solid;

interface Sound{
    int increaseVolum(int currentVol);
    int decreaseVolum(int currentVol);
}

class DjSpeekar implements Sound{

    @Override
    public int increaseVolum(int currentVol) {
        return  currentVol+10;
    }

    @Override
    public int decreaseVolum(int currentVol) {
        return currentVol-10;
    }
}

// TableAlarm has extend Sound bur decrease the feature of Sound Interface

class TableAlarm implements Sound{

    @Override
    public int increaseVolum(int currentVol) {
       throw new RuntimeException("Sound is fixed ................ Not increased or decreased");
    }

    @Override
    public int decreaseVolum(int currentVol) {
        throw new RuntimeException("Sound is fixed ................ Not increased or decreased");
    }
}





public class SolidL  {
    public static void main(String[] args) {
        // Liskov Substitution Principle
        // Subclass should extend the capability of parent class not narrow down


    }
}
