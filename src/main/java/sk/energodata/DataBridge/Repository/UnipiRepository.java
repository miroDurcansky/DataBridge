package sk.energodata.DataBridge.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sk.energodata.DataBridge.Models.Unipi;

@Repository
public interface UnipiRepository extends CrudRepository<Unipi, Long> {

}