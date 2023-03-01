package sk.energodata.DataBridge;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data // lombok
public class Student {

    @Id
    private Long id;

    private String contactNo;
    private String firstName;
    private String lastName;

}