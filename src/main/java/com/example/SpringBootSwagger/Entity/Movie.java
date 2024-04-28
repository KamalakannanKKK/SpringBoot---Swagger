package com.example.SpringBootSwagger.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int MovieId;
	private String Moviename;
	private List<String> cast;
	private String Description;
	private String Review;
	
	
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMovieId() {
		return MovieId;
	}
	public void setMovieId(int movieId) {
		MovieId = movieId;
	}
	public String getMoviename() {
		return Moviename;
	}
	public void setMoviename(String moviename) {
		Moviename = moviename;
	}
	public List<String> getCast() {
		return cast;
	}
	public void setCast(List<String> cast) {
		this.cast = cast;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getReview() {
		return Review;
	}
	public void setReview(String review) {
		Review = review;
	}
	public Movie(int movieId,String moviename, List<String> cast, String description, String review) {
		super();
		MovieId=movieId;
		Moviename = moviename;
		this.cast = cast;
		Description = description;
		Review = review;
	}
	
	
	
	
}
