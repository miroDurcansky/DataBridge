package sk.energodata.DataBridge.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;
import java.util.Objects;

@Table(name = "tag_vals_ab_as_ke")
public class UnipiValue {
    @Id
    private Long id;
    private LocalDateTime valueTime;
    private double value;
    private Boolean valid;
    private Long descsId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getValueTime() {
        return valueTime;
    }

    public void setValueTime(LocalDateTime valueTime) {
        this.valueTime = valueTime;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public Long getDescsId() {
        return descsId;
    }

    public void setDescsId(Long descsId) {
        this.descsId = descsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnipiValue that = (UnipiValue) o;
        return Double.compare(that.value, value) == 0 &&
                Objects.equals(valueTime, that.valueTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(valueTime, value);
    }
}
