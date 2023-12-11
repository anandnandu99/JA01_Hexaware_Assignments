package com.hexaware.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.demo.entities.Player;

@Repository
public interface PlayerRepository  extends JpaRepository<Player, Integer>{

	void deleteByPlayerName(String playerName);

}
