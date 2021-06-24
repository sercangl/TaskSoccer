package com.example.FootballApplication.api.repository;

import com.example.FootballApplication.api.model.Player;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerRepository extends MongoRepository<Player, Integer> {

}
