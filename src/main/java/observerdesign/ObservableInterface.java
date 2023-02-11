package observerdesign;

import java.util.ArrayList;
import java.util.List;

public interface ObservableInterface {

    void addObserver(ObserverInterface observerInterface);
    void notification();

    void setCurrentUpdate(boolean update);

    String getItem();
}
