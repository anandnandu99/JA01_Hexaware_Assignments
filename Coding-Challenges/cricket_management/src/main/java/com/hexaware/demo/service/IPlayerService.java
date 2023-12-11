package com.hexaware.demo.service;

import java.util.List;

import com.hexaware.demo.dto.PlayerDTO;
import com.hexaware.demo.entities.Player;

public interface IPlayerService {
    PlayerDTO addPlayer(PlayerDTO playerDTO);
    List<Player> getAllPlayers();
	List<String> getAllPlayerNames();
	void removePlayerByName(String playerName);


}
