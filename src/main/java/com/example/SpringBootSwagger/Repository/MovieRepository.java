package com.example.SpringBootSwagger.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootSwagger.Entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{

}
