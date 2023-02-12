package carbooking;

import lombok.Getter;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class BookingStore {
    private List<VehicleStore> vehicleStoreList=new ArrayList<>();
    private List<Vehicle> vehicleList=new ArrayList<>();
    private List<User> userList=new ArrayList<>();

    private List<Booking> bookingList=new ArrayList<>();

    private List<Billing> billingList =new ArrayList<>();

    public void addVehicleStore(VehicleStore vehicleStore){
        vehicleStoreList.add(vehicleStore);
    }
    public void removeVehicleStore(VehicleStore vehicleStore){
        vehicleStoreList.remove(vehicleStore);
    }

    public VehicleStore getVehicleStoreById(long vehicleStoreId){
        return vehicleStoreList.stream().filter(e->e.getStoreId()==vehicleStoreId).toList().get(0);
    }
    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle){
        vehicleList.remove(vehicle);
    }
    public Vehicle getVehicleById(long vehicleId){
        return vehicleList.stream().filter(e->e.getVehicleId()==vehicleId).toList().get(0);
    }

   public void addNewUser(User user){
        userList.add(user);
   }
    public void removeUser(User user){
        userList.remove(user);
    }

    public User getUserById(long userId){
        return userList.stream().filter(e->e.getUserId()==userId).toList().get(0);
    }


    public void addBookingList(Booking booking){
        bookingList.add(booking);
    }
    public void removeBookingList(Booking booking){
        bookingList.remove(booking);
    }

    public Booking getBookingById(long bookingId){
        return bookingList.stream().filter(e->e.getBookingId()==bookingId).toList().get(0);
    }


    public void addBillingList(Billing billing){
        billingList.add(billing);
    }
    public void removeBillingList(Billing billing){
        billingList.remove(billing);
    }

    public Billing getBillingById(long billingId){
        return billingList.stream().filter(e->e.getBillingId()==billingId).toList().get(0);
    }

    public void printBill(long billId){
        Billing billing=getBillingById(billId);
        Booking booking=getBookingById(billing.getBillingId());
        Vehicle vehicle=getVehicleById(booking.getVehicleId());
        User user=getUserById(booking.getUserId());
        VehicleStore vehicleStore=getVehicleStoreById(booking.getStoreId());

        System.out.println("=====================Booking Details===================");

        System.out.println("Store name : "+ vehicleStore.getStoreName());
        System.out.println("Store Address : "+ vehicleStore.getLocation().getAddress());
        System.out.println("Store PinCode : "+ vehicleStore.getLocation().getPinCode());
        System.out.println();
        System.out.println("User name : "+ user.getUsername());
        System.out.println("Booking Date : "+ booking.getBookingTime());
        System.out.println("Booking Hours : "+ booking.getBookingHours());
        System.out.println("Total Payable Amount : "+ vehicle.getBookingPricePerHour()* booking.getBookingHours());

    }


}
