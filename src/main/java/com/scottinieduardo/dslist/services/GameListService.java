package com.scottinieduardo.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scottinieduardo.dslist.dto.GameDTO;
import com.scottinieduardo.dslist.dto.GameListDTO;
import com.scottinieduardo.dslist.dto.GameMinDTO;
import com.scottinieduardo.dslist.entities.Game;
import com.scottinieduardo.dslist.entities.GameList;
import com.scottinieduardo.dslist.repositories.GameListRespository;
import com.scottinieduardo.dslist.repositories.GameRespository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRespository gameListRepository;
	
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
	
}
