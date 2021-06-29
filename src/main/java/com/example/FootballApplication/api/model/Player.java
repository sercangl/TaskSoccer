package com.example.FootballApplication.api.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document(collection = "Player")
public class Player {
    @JsonProperty("playerId")
    private int playerId;

    @JsonProperty("playerName")
    private String playerName;

    @JsonProperty("playerSurname")
    private String playerSurname;

    @JsonProperty("playerPosition")
    private String playerPosition;

    @JsonProperty("playerNationality")
    private String playerNationality;

    @JsonProperty("playerFormNumber")
    private int playerFormNumber;

    /* public Player(int playerId,
                  String playerName,
                  String playerSurname,
                  String playerPosition,
                  String playerNationality,
                  int playerFormNumber) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.playerSurname = playerSurname;
        this.playerPosition = playerPosition;
        this.playerNationality = playerNationality;
        this.playerFormNumber = playerFormNumber;

    }
*/
}

