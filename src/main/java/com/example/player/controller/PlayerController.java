package com.example.player.controller;
/*
 * 
 * You can use the following import statemets
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.player.service.PlayerH2Service;
import com.example.player.model.Player;

@RestController
public class PlayerController{

    @Autowired
    public PlayerH2Service playerH2Service;
    
    @GetMapping("/players")
    public ArrayList<Player> getPlayers(){
        return playerH2Service.getPlayers();
    }

    @GetMapping("/players/{playerId}")
    public Player getPlayerById(@PathVariable("playerId") int playerId){
        return playerH2Service.getPlayerById(playerId);
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player){
        return playerH2Service.addPlayer(player);
    }
}
