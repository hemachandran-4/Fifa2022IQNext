package com.fifa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fifa.model.Player_Defence;

@Repository
public interface PlayerDefenceDao extends JpaRepository<Player_Defence, Integer>{

}
