package observerdesign;

public class MobileNotification implements ObserverInterface {
    private ObservableInterface observableInterface;
    private String name;
    MobileNotification(ObservableInterface observableInterface, String name){
        this.observableInterface=observableInterface;
        this.name=name;
    }

    @Override
    public void notification() {
        System.out.println("Mobile: Hello "+name+", "+observableInterface.getItem()+" is in stock !! Thank you "+name);
    }
}
