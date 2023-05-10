package com.fernandoborgmann.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fernandoborgmann.dslist.DTO.GameDTO;
import com.fernandoborgmann.dslist.DTO.GameMinDTO;
import com.fernandoborgmann.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;

	@GetMapping
	public List<GameMinDTO> findAll(){
		return gameService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public GameDTO findGameById(@PathVariable Long id) {
		return gameService.findGameById(id);		
	}
	
	
}
