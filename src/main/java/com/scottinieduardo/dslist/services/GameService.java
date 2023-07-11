package com.scottinieduardo.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scottinieduardo.dslist.dto.GameMinDTO;
import com.scottinieduardo.dslist.entities.Game;
import com.scottinieduardo.dslist.repositories.GameRespository;

@Service
public class GameService {
	
	@Autowired
	private GameRespository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
}
