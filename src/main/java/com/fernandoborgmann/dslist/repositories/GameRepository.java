package com.fernandoborgmann.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernandoborgmann.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
