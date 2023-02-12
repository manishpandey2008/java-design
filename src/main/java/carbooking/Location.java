package carbooking;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Location {
    private long locationId;
    private String address;
    private String pinCode;
    private String city;
}
