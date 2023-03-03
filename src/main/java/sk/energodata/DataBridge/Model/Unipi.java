package sk.energodata.DataBridge.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

@Data
@Table(name = "tag_descs_ab_as_ke")
public class Unipi {
    @Id
    private Long id;
    private String name;
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

    @MappedCollection(keyColumn = "id", idColumn = "descs_id")
    private List<UnipiValue> unipiValues;

}
