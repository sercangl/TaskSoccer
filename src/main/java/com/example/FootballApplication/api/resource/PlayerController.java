package com.example.FootballApplication.api.resource;

import com.example.FootballApplication.api.model.Player;
import com.example.FootballApplication.api.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PlayerController {

    @Autowired
    private PlayerRepository playerrepository;

    @PostMapping("/addPlayer")
    public String savePlayer(@RequestBody Player player) {
        playerrepository.save(player);
        return "Added player with id :" + player.getPlayerId();
    }


    @GetMapping("/findAllPlayers")
    public List<Player> getPlayers() {
        return playerrepository.findAll();
    }

    @GetMapping("/findPlayer/{id}")
    public Optional<Player> getPlayer(@PathVariable int id) {
        return playerrepository.findById(id);
    }

    @DeleteMapping("/deletePlayer/{id}")
    public String deletePlayer(@PathVariable int id) {
        playerrepository.deleteById(id);
        return "player deleted with id" + id;

    }


}
