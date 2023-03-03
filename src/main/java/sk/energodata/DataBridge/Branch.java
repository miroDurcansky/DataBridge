package sk.energodata.DataBridge;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Set;

@Data
public class Branch {

    @Id
    private int branchId;

    private String branchShortName;

    private String branchName;

    private String description;

    @MappedCollection(keyColumn = "branch_id", idColumn = "branch_id")
    private Set<Student> students;

}