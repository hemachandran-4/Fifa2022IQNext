package com.fifa.service;

import java.util.List;

import com.fifa.model.Player_Stats;

public interface PlayerStatsService {
//	Create an api route to return all players' statistics data. (/get-all-details)
//			Create an api route to return results of all statistical data of the player based upon the player id. (/get-by-id)
//			Create an api route  to return players statistics with filter (based 
//	on no of games played, no of minute played, no of goal score, year of birth etc)].
	
	public List<Player_Stats> getAllPlayerStats();
	public Player_Stats getPlayerStatsById(Integer Id);
	public List<Player_Stats> getPlayerStatsByFiler(Integer games, Integer minutes, Integer goals,Integer birth_year);
}
