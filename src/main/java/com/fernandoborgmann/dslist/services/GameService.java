package com.fernandoborgmann.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fernandoborgmann.dslist.DTO.GameDTO;
import com.fernandoborgmann.dslist.DTO.GameMinDTO;
import com.fernandoborgmann.dslist.entities.Game;
import com.fernandoborgmann.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;		
	}
	
	@Transactional(readOnly = true)
	public GameDTO findGameById(Long id) {
		try {
			Game game = gameRepository.findById(id).get();
			GameDTO gameDto= new GameDTO(game);	
			return gameDto;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
