package sk.energodata.DataBridge.Repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sk.energodata.DataBridge.Models.Unipi;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface UnipiRepository extends CrudRepository<Unipi, Long> {

    @Query("SELECT * FROM tag_descs_ab_as_ke WHERE name = :name")
    Optional<Unipi> findByName(String name);

    @Query("SELECT DISTINCT u.*, uv.* \n" +
            "FROM tag_descs_ab_as_ke u \n" +
            "INNER JOIN tag_vals_ab_as_ke uv ON u.id = uv.descs_id \n" +
            "WHERE uv.value_time BETWEEN :startDate AND :endDate")
    Set<Unipi> findBetweenDates(@Param("startDate") LocalDateTime startDate, @Param("endDate") LocalDateTime endDate);

    @Query("SELECT d.*, v* FROM tag_descs_ab_as_ke d INNER JOIN tag_vals_ab_as_ke v ON d.id = v.descs_id WHERE v.value_time BETWEEN :startDate AND :endDate")
    Set<Unipi> findRecords(@Param("startDate") LocalDateTime startDate, @Param("endDate") LocalDateTime endDate);


}