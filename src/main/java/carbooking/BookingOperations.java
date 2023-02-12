package carbooking;

import java.util.List;

public class BookingOperations {
    private BookingStore bookingStore;

    BookingOperations(BookingStore bookingStore){
        this.bookingStore=bookingStore;
    }

    public List<VehicleStore> getVehiclesStoreByLocation(String cityname){
        return bookingStore.getVehicleStoreList().stream().filter(e->e.getLocation().getCity().toUpperCase().equals(cityname.toUpperCase()) && e.getStatus().equals(Status.ACTIVE)).toList();
    }

    public List<Vehicle> getVihicalAsPerStore(long storeId){
        return bookingStore.getVehicleList().stream().filter(e->e.getStoreId()==storeId).toList();
    }

    public String addBooking(Booking booking){
        try {
            bookingStore.addBookingList(booking);
            Vehicle vehicle=bookingStore.getVehicleById(booking.getVehicleId());
            return "Congratulation Your booking has confirmed for "+vehicle.getVehicleName()+"!  Thank you, We will meet again :";
        }catch (Exception e){
            return e.getMessage();
        }
    }


}
