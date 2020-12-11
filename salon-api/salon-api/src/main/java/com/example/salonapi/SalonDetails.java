import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access=AccessLevel.PRIVATE)
@Entity
public class SalonDetails{
    private String name;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String phone;
}