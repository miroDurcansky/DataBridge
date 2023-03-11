package sk.energodata.DataBridge.Models;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;
import java.util.Objects;
import java.util.Set;

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
    private Set<UnipiValue> unipiValues;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhysicalType() {
        return physicalType;
    }

    public void setPhysicalType(String physicalType) {
        this.physicalType = physicalType;
    }

    public int getPhysicalDecimals() {
        return physicalDecimals;
    }

    public void setPhysicalDecimals(int physicalDecimals) {
        this.physicalDecimals = physicalDecimals;
    }

    public String getPhysicalUnit() {
        return physicalUnit;
    }

    public void setPhysicalUnit(String physicalUnit) {
        this.physicalUnit = physicalUnit;
    }

    public double getPhysicalMin() {
        return physicalMin;
    }

    public void setPhysicalMin(double physicalMin) {
        this.physicalMin = physicalMin;
    }

    public double getPhysicalMax() {
        return physicalMax;
    }

    public void setPhysicalMax(double physicalMax) {
        this.physicalMax = physicalMax;
    }

    public double getPhysicalMinAlarm() {
        return physicalMinAlarm;
    }

    public void setPhysicalMinAlarm(double physicalMinAlarm) {
        this.physicalMinAlarm = physicalMinAlarm;
    }

    public double getPhysicalMaxAlarm() {
        return physicalMaxAlarm;
    }

    public void setPhysicalMaxAlarm(double physicalMaxAlarm) {
        this.physicalMaxAlarm = physicalMaxAlarm;
    }

    public double getPhysicalMinWarn() {
        return physicalMinWarn;
    }

    public void setPhysicalMinWarn(double physicalMinWarn) {
        this.physicalMinWarn = physicalMinWarn;
    }

    public double getPhysicalMaxWarn() {
        return physicalMaxWarn;
    }

    public void setPhysicalMaxWarn(double physicalMaxWarn) {
        this.physicalMaxWarn = physicalMaxWarn;
    }

    public Set<UnipiValue> getUnipiValues() {
        return unipiValues;
    }

    public void setUnipiValues(Set<UnipiValue> unipiValues) {
        this.unipiValues = unipiValues;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Unipi)) return false;
        Unipi unipi = (Unipi) o;
        return physicalDecimals == unipi.physicalDecimals && Double.compare(unipi.physicalMin, physicalMin) == 0 && Double.compare(unipi.physicalMax, physicalMax) == 0 && Double.compare(unipi.physicalMinAlarm, physicalMinAlarm) == 0 && Double.compare(unipi.physicalMaxAlarm, physicalMaxAlarm) == 0 && Double.compare(unipi.physicalMinWarn, physicalMinWarn) == 0 && Double.compare(unipi.physicalMaxWarn, physicalMaxWarn) == 0 && id.equals(unipi.id) && name.equals(unipi.name) && description.equals(unipi.description) && type.equals(unipi.type) && physicalType.equals(unipi.physicalType) && physicalUnit.equals(unipi.physicalUnit) && unipiValues.equals(unipi.unipiValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, type, physicalType, physicalDecimals, physicalUnit, physicalMin, physicalMax, physicalMinAlarm, physicalMaxAlarm, physicalMinWarn, physicalMaxWarn, unipiValues);
    }
}
