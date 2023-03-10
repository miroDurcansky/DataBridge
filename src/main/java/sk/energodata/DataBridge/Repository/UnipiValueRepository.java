package sk.energodata.DataBridge.Repository;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sk.energodata.DataBridge.Models.UnipiValue;
import java.time.LocalDateTime;

@Repository
public interface UnipiValueRepository extends CrudRepository<UnipiValue, Long> {
    @Modifying
    @Query("INSERT INTO tag_vals_ab_as_ke (id, value_time, descs_id, value, valid) VALUES (:id, :value_time, :descs_id, :value, :valid) ON CONFLICT (value_time, descs_id) DO NOTHING ")
    void saveOrUpdateValue(@Param("id") Long id, @Param("value_time") LocalDateTime value_time, @Param("descs_id") long descs_id, @Param("value") double value, @Param("valid") Boolean valid);

}