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
    @JsonProperty("teamId")
    private int teamId;

    @JsonProperty("teamName")
    private String teamName;

    @JsonProperty("teamLeague")
    private String teamLeague;

    @JsonProperty("teamLogo")
    private String teamLogo;

    @JsonProperty("teamLocation")
    private String teamLocation;

    @JsonProperty("teamYear")
    private String teamYear;

    @JsonProperty("teamColors")
    private String teamColors;
}
