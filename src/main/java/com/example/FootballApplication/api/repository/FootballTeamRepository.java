package com.example.FootballApplication.api.repository;

import com.example.FootballApplication.api.model.FootballTeam;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FootballTeamRepository extends MongoRepository<FootballTeam, Integer> {
}
