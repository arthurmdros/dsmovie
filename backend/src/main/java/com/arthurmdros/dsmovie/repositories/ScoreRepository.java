package com.arthurmdros.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthurmdros.dsmovie.entities.Score;
import com.arthurmdros.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
