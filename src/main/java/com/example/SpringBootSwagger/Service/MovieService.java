package com.example.SpringBootSwagger.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootSwagger.Entity.Movie;
import com.example.SpringBootSwagger.Repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	MovieRepository movierepo;
	
	public List<Movie> getAllMovies() {
		return movierepo.findAll();
	}
	
	public Movie addMovie(Movie movie) {
		return movierepo.save(movie);
	}
	
	public Movie getbyName(int id) {
		return movierepo.findById(id).get();
	}
	
	public void deleteMovie(int id) {
		movierepo.deleteById(id);
	}
}
