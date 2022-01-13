package com.arthurmdros.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthurmdros.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
