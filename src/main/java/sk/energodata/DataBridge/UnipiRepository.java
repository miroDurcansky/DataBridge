package sk.energodata.DataBridge;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sk.energodata.DataBridge.Model.Unipi;

import java.util.Optional;

@Repository
public interface UnipiRepository extends CrudRepository<Unipi, Long> {

    @Query("SELECT * FROM tag_descs_ab_as_ke WHERE name = :name")
    Optional<Unipi> findByName(String name);

}