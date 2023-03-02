package sk.energodata.DataBridge;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data // lombok
public class Student {

    @Id
    private Long id;

    private String contactNo;
    private String firstName;
    private String lastName;

    private LocalDateTime studentTime;

    public Timestamp getStudentTime() {
        return Timestamp.valueOf(this.studentTime);
    }

    public void setStudentTime(LocalDateTime studentTime) {
        this.studentTime = studentTime;
    }
}