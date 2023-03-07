package sk.energodata.DataBridge.Repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import sk.energodata.DataBridge.Models.Movie;

import java.time.LocalDateTime;
import java.util.List;

public interface MovieRepository extends CrudRepository<Movie, Long> {


    @Query("select * from movie m, rental r where m.id = r.movie and r.cas BETWEEN :startDate AND :endDate")
    List<Movie> findMovies(LocalDateTime startDate, LocalDateTime endDate);
}


