package sk.energodata.DataBridge.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sk.energodata.DataBridge.Models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {


}

