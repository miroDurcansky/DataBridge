package sk.energodata.DataBridge;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sk.energodata.DataBridge.Models.Movie;
import sk.energodata.DataBridge.Models.Rental;
import sk.energodata.DataBridge.Repository.MovieRepository;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootTest
class DataBridgeApplicationTests {

	@Autowired
	private MovieRepository movieRepository;

	@Test
	void contextLoads() {
		List<Rental> rentals = new ArrayList<>();
		rentals.add(new Rental(Duration.ofDays(1), 2, LocalDateTime.now()));

		rentals.add(new Rental(Duration.ofDays(7), 10, LocalDateTime.now().minusMinutes(30)));
		Movie movie = new Movie(null, "Matrix", "....", rentals);
		movieRepository.save(movie);


		List<Movie> list = movieRepository.findMovies(LocalDateTime.now().minusMinutes(10), LocalDateTime.now());
		System.out.println(list.size());


		movieRepository.save(movie);

	}

}
