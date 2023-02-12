package carbooking;

import java.util.Date;
import java.util.List;

public class CarBooking {
    public static void main(String[] args) {

        BookingStore bookingStore=new BookingStore();
        List<User> userList=addUsers(bookingStore);
        List<Vehicle> vehicleList=addVehicle(bookingStore);
        List<VehicleStore> vehicleStoreList=addVehicleStore(bookingStore);

        User currentUser=bookingStore.getUserById(2);

        BookingOperations bookingOperations =new BookingOperations(bookingStore);

        System.out.println("---------------------Show all stores as per location------------------------");

        List<VehicleStore> vehicleStores= bookingOperations.getVehiclesStoreByLocation("KoTa");
        vehicleStores.forEach(e-> System.out.println(e.getStoreName()+" "+e.getLocation().getAddress() +" "+e.getLocation().getPinCode()));

        System.out.println("-------------------Show all vehicle as per store--------------------------");

        List<Vehicle> vehicles=bookingOperations.getVihicalAsPerStore(4);
        vehicles.forEach(e-> System.out.println(e.getVehicleName()+" "+e.getVehicleType()+" "+e.getVehicleNumber()+" "+e.getBookingPricePerHour()));

        System.out.println("-------------------Booking  cars--------------------------");
        Booking booking=new Booking(1,2,4,4,new Date(),10,PaymentType.CASH);
        System.out.println(bookingOperations.addBooking(booking));

        Booking booking2=new Booking(2,2,5,4,new Date(),10,PaymentType.ONLINE);
        System.out.println(bookingOperations.addBooking(booking2));


        System.out.println("-------------------Billing  process--------------------------");

        bookingStore.addBillingList(new Billing(1,1,PaymentStatus.PAID,bookingStore));
        bookingStore.addBillingList(new Billing(2,2,PaymentStatus.PENDING,bookingStore));

        bookingStore.printBill(1);
        bookingStore.printBill(2);


    }

    public static List<User> addUsers(BookingStore bookingStore){
        bookingStore.addNewUser(new User(1,"Manish Pandey","DLMP123"));
        bookingStore.addNewUser(new User(2,"Balmukund Pandey","DLBP123"));
        bookingStore.addNewUser(new User(3,"Suprbha Pandey","DLSP123"));
        bookingStore.addNewUser(new User(4,"Avinash Pandey","DLAP123"));
        return bookingStore.getUserList();
    }

    public static List<Vehicle> addVehicle(BookingStore bookingStore){
        bookingStore.addVehicle(new Vehicle(1,"Car 1","BR-123",VehicleType.CAR,1,100,Status.ACTIVE));
        bookingStore.addVehicle(new Vehicle(2,"Car 2","RJ-123",VehicleType.CAR,4,300,Status.ACTIVE));
        bookingStore.addVehicle(new Vehicle(3,"Car 3","MP-123",VehicleType.CAR,5,300,Status.INACTIVE));
        bookingStore.addVehicle(new Vehicle(4,"Car 4","UP-123",VehicleType.CAR,4,340,Status.INACTIVE));
        bookingStore.addVehicle(new Vehicle(5,"Car 5","KR-123",VehicleType.CAR,4,650,Status.ACTIVE));
        return bookingStore.getVehicleList();
    }

    public static List<VehicleStore> addVehicleStore(BookingStore bookingStore){
        bookingStore.addVehicleStore(new VehicleStore(1,"Store 1",new Location(1,"kota-rajasthan","676543","kota"),Status.ACTIVE));
        bookingStore.addVehicleStore(new VehicleStore(2,"Store 2",new Location(2,"Noida-delhi","987652","Noida"),Status.ACTIVE));
        bookingStore.addVehicleStore(new VehicleStore(3,"Store 3",new Location(3,"kanpur-utterpardesh","465354","Kanpur"),Status.ACTIVE));
        bookingStore.addVehicleStore(new VehicleStore(4,"Store 4",new Location(4,"kota-rajasthan","834765","kota"),Status.ACTIVE));
        bookingStore.addVehicleStore(new VehicleStore(5,"Store 5",new Location(5,"jaipur-rajasthan","238543","Jaipur"),Status.ACTIVE));

        return bookingStore.getVehicleStoreList();

    }

}
