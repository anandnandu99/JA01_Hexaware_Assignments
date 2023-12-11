package com.hexaware.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.demo.dto.PlayerDTO;
import com.hexaware.demo.entities.Player;
import com.hexaware.demo.service.IPlayerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/players")
@CrossOrigin(origins ="*")
public class PlayerRestController {

    @Autowired
    private IPlayerService playerService;
    @GetMapping("/welcome")
    public String hello() {
    	return "Welcome";
    	
    }

    @PostMapping("/addPlayer")
    public PlayerDTO addPlayer(@RequestBody @Valid PlayerDTO playerDTO) {
        return playerService.addPlayer(playerDTO);
    }

    @GetMapping("/getAllPlayers")
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }
    @GetMapping("/getAllPlayerNames")
    public List<String> getAllPlayerNames() {
        return playerService.getAllPlayerNames();
    }
    @DeleteMapping("/removePlayerByName/{playerName}")
    public void removePlayerByName(@PathVariable String playerName) {
        playerService.removePlayerByName(playerName);
       
    }
}
