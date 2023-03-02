package sk.energodata.DataBridge;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BranchOneToManyTestRepository extends CrudRepository<Branch, Long> {

}