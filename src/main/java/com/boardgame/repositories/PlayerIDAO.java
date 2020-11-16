package com.boardgame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boardgame.models.Players;

public interface PlayerIDAO extends JpaRepository<Players, Integer>{

}
