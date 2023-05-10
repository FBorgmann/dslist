package com.fernandoborgmann.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernandoborgmann.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
