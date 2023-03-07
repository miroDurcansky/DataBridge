package sk.energodata.DataBridge.Models;


import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Set;

public class Movie {
    @Id
    private Long id;
    private String title;
    private String description;
    private List<Rental> rental;

    public Movie(Long id, String title, String description, List<Rental> rental) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.rental = rental;
    }


    public void addRental(Rental rental) {
        this.rental.add(rental);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", rental=" + rental +
                '}';
    }
}
