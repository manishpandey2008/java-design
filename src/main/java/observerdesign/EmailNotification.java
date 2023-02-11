package observerdesign;

public class EmailNotification implements ObserverInterface {
    private ObservableInterface observableInterface;
    private String name;
    EmailNotification(ObservableInterface observableInterface, String name){
        this.observableInterface=observableInterface;
        this.name=name;
    }

    @Override
    public void notification() {
        System.out.println("Email : Hello "+name+", "+observableInterface.getItem()+" is in stock !! Thank you "+name);
    }
}
