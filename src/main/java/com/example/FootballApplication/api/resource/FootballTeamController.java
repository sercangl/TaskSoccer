package com.example.FootballApplication.api.resource;
// import org.springframework.web.bind.annotation.RestController;

import com.example.FootballApplication.api.model.FootballTeam;
import com.example.FootballApplication.api.repository.FootballTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FootballTeamController {
    @Autowired
    private FootballTeamRepository teamRepository;

    @PostMapping("/addTeam")
    public String saveTeam(@RequestBody FootballTeam footballteam) {
       // System.out.println(footballteam);
        teamRepository.save(footballteam);
        return "Added Football team with id :" + footballteam.getTeamId();
    }

    @GetMapping("/findAllTeams")
    public List<FootballTeam> getFootballTeams() {
        return teamRepository.findAll();
    }

    @GetMapping("/findTeam/{id}")
    public Optional<FootballTeam> getFootballTeam(@PathVariable int id) {
        return teamRepository.findById(id);
    }

    @DeleteMapping("/deleteTeam/{id}")
    public String deleteFootballTeam(@PathVariable int id) {
        teamRepository.deleteById(id);
        return "Team deleted with id" + id;

    }

}
