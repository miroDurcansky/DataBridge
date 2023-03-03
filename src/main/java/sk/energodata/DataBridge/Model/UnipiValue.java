package sk.energodata.DataBridge.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Table(name = "tag_vals_ab_as_ke")
public class UnipiValue {

    @Id
    private Long id;
    private LocalDateTime valueTime;
    private double value;
    private Boolean valid;

}
