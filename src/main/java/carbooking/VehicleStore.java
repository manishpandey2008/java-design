package carbooking;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VehicleStore {
    private long storeId;
    private String StoreName;
    private Location location;
    private Status status;

}
