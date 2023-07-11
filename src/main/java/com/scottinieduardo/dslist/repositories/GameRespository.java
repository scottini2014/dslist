package com.scottinieduardo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scottinieduardo.dslist.entities.Game;

public interface GameRespository extends JpaRepository<Game, Long> {
	
}
