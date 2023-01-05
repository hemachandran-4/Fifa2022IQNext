package com.fifa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fifa.model.Player_Playing_Time;

@Repository
public interface PlayerPlayingTimeDao extends JpaRepository<Player_Playing_Time, Integer>{

}
