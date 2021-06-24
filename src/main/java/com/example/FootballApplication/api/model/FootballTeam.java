package com.example.FootballApplication.api.model;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Getter
@Setter
@ToString
@Document(collection = "FootballTeam")
public class FootballTeam {
    @Id
    private int teamId;
    private String teamName;
    private String teamLeague;
    private String teamLogo;
    private String teamLocation;
    private String teamYear;
    private String teamColors;
    private final List<Player> players;

    
    public FootballTeam(List<Player> players) {
        this.players = players;
    }
}
