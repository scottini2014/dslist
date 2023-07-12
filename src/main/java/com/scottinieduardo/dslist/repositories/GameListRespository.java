package com.scottinieduardo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scottinieduardo.dslist.entities.Game;
import com.scottinieduardo.dslist.entities.GameList;

public interface GameListRespository extends JpaRepository<GameList, Long> {
	
}
