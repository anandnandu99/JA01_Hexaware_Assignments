package com.hexaware.mappings.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Long id;

    @Column(name = "movie_title")
    private String title;



	public Movie() {
		super();
	}

	public Movie(Long id, String title, Set<Movie> movies) {
		super();
		this.id = id;
		this.title = title;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Movie> getMovies() {
		return getMovies();
	}

	

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title+"]";
	}
    
}