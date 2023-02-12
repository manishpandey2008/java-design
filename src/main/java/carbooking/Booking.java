package carbooking;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Booking {
    private long bookingId;
    private long userId;
    private long vehicleId;
    private long storeId;
    private Date bookingTime;
    private long bookingHours;

    private PaymentType paymentType;

}
