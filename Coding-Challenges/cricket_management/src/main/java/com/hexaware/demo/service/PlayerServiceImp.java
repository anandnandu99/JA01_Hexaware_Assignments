package com.hexaware.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.hexaware.demo.dto.PlayerDTO;
import com.hexaware.demo.entities.Player;
import com.hexaware.demo.repository.PlayerRepository;

import jakarta.transaction.Transactional;

@Service
public class PlayerServiceImp implements IPlayerService {

    @Autowired
    PlayerRepository playerRepository;

    @Override
    public PlayerDTO addPlayer(PlayerDTO playerDTO) {
        Player player = new Player();
        player.setPlayerName(playerDTO.getPlayerName());
        player.setJerseyNumber(playerDTO.getJerseyNumber());
        player.setRole(playerDTO.getRole());
        player.setTotalMatches(playerDTO.getTotalMatches());
        player.setTeamName(playerDTO.getTeamName());
        player.setCountry(playerDTO.getCountry());
        player.setDescription(playerDTO.getDescription());

        Player savedPlayer = playerRepository.save(player);

        return new PlayerDTO(
            savedPlayer.getPlayerName(),
            savedPlayer.getJerseyNumber(),
            savedPlayer.getRole(),
            savedPlayer.getTotalMatches(),
            savedPlayer.getTeamName(),
            savedPlayer.getCountry(),
            savedPlayer.getDescription()
        );
    }

    @Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }
    @Override
    public List<String> getAllPlayerNames() {
        List<Player> players = playerRepository.findAll();
        List<String> playerNames = new ArrayList<>();

        for (Player player : players) {
            playerNames.add(player.getPlayerName());
        }

        return playerNames;
    }
    @Override
    @Transactional
    public void removePlayerByName(String playerName) {
        playerRepository.deleteByPlayerName(playerName);
    }
}
