package sk.energodata.DataBridge;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "tag_descs_ab_as_ke")
public class Unipi {
    @Id
    private int id;
    private String description;
    private String type;
    private String physicalType;
    private int physicalDecimals;
    private String physicalUnit;
    private double physicalMin;
    private double physicalMax;
    private double physicalMinAlarm;
    private double physicalMaxAlarm;
    private double physicalMinWarn;
    private double physicalMaxWarn;

}
