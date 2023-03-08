package sk.energodata.DataBridge.Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table(name = "subject")
public class Subject {
    @Id
    private Long id;
    private LocalDateTime valueTime;
    private String subject;
    private Long studentId;

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
}
