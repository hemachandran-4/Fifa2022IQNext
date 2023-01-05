package com.fifa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fifa.model.Player_Stats;

@Repository
public interface PlayerStatsDao extends JpaRepository<Player_Stats, Integer>{

}
