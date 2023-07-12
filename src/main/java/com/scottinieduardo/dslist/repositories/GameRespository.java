package com.scottinieduardo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scottinieduardo.dslist.entities.Game;
import com.scottinieduardo.dslist.entities.GameList;

public interface GameRespository extends JpaRepository<Game, Long> {
	
}
