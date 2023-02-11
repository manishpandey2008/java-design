package observerdesign;

import java.util.ArrayList;
import java.util.List;

public class NotificationClass implements ObservableInterface{
    private List<ObserverInterface> observerInterfaces=new ArrayList<>();

    private String name;
    private boolean isStock=false;

    NotificationClass(String name){
        this.name=name;
    }
    @Override
    public void addObserver(ObserverInterface observerInterface) {
        observerInterfaces.add(observerInterface);
    }

    @Override
    public void notification() {
        for (ObserverInterface o:observerInterfaces) {
            o.notification();
        }
    }

    @Override
    public void setCurrentUpdate(boolean update) {
        this.isStock=update;
        if(update)notification();
    }

    @Override
    public String getItem() {
        return name;
    }
}
