package carbooking;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Billing{
    private long billingId;
    private long bookingId;
    private PaymentStatus paymentStatus;
    private BookingStore bookingStore;

}
