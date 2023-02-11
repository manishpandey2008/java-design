package observerdesign;

public class ObserverDesignPattern {
    public static void main(String[] args) {
        ObservableInterface product=new NotificationClass("Nokia");

        product.addObserver( new MobileNotification(product,"Manish"));
        product.addObserver( new EmailNotification(product,"Pandey"));
        product.addObserver( new EmailNotification(product,"Balmukund"));
        product.addObserver( new MobileNotification(product,"Suprbha"));

        product.setCurrentUpdate(true);
    }
}
