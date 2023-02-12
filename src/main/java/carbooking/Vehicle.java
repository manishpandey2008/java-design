package carbooking;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Vehicle {
    private long vehicleId;
    private String vehicleName;
    private String vehicleNumber;
    private VehicleType vehicleType;
    private long storeId;
    private double bookingPricePerHour;
    private Status status;
}
