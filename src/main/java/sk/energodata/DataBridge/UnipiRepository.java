package sk.energodata.DataBridge;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sk.energodata.DataBridge.Model.Unipi;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface UnipiRepository extends CrudRepository<Unipi, Long> {

    @Query("SELECT * FROM tag_descs_ab_as_ke WHERE name = :name")
    Optional<Unipi> findByName(String name);

    @Query("SELECT DISTINCT u.*, uv.* \n" +
            "FROM tag_descs_ab_as_ke u \n" +
            "JOIN tag_vals_ab_as_ke uv ON u.id = uv.descs_id \n" +
            "WHERE uv.value_time BETWEEN :startDate AND :endDate")
    List<Unipi> findBetweenDates(@Param("startDate") LocalDateTime startDate, @Param("endDate") LocalDateTime endDate);


}