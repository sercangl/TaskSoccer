package com.example.FootballApplication.api.model;


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
    @Id
    private int playerId;
    private String playerName;
    private String playerSurname;
    private String playerPosition;
    private String playerNationality;
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

