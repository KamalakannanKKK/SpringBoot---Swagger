package com.example.SpringBootSwagger.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootSwagger.Entity.Movie;
import com.example.SpringBootSwagger.Service.MovieService;

@RestController
public class MovieController {

	@Autowired
	MovieService movieservice;
	
	@GetMapping("/getAll")
	public List<Movie> getAllmovies() {
		return movieservice.getAllMovies();
	}
	
	@GetMapping("/getByName/{id}")
	public Movie getByMovieName(@PathVariable(value="id") int id) {
		return movieservice.getbyName(id);
	}
	
	@PostMapping("/addMovie")
	public Movie addMovie(@RequestBody Movie movie) {
		return movieservice.addMovie(movie);
	}
	
	@DeleteMapping("/deleteMovie/{id}")
	public void deleteMovie(@PathVariable(value="id")  int id) {
		movieservice.deleteMovie(id);
	}
}
