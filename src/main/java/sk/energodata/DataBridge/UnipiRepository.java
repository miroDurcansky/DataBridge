package sk.energodata.DataBridge;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sk.energodata.DataBridge.Model.Unipi;

@Repository
public interface UnipiRepository extends CrudRepository<Unipi, Long> {

}