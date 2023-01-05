package com.fifa.service;

import java.util.List;

import com.fifa.model.Player_Defence;

public interface PlayerDefenceService {
	public List<Player_Defence> getAllPlayerdefence();
	public Player_Defence getPlayerDefenceById(Integer id);
	public List<Player_Defence> getPlayerDefenceByFilter(String position,String team,Integer tackles,Integer tackles_won);
}
