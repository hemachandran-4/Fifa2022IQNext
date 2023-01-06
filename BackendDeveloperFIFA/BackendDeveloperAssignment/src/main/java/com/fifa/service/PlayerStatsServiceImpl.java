package com.fifa.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fifa.model.Player_Stats;
import com.fifa.repository.PlayerStatsDao;

@Service
public class PlayerStatsServiceImpl implements PlayerStatsService{
	
	@Autowired
	private PlayerStatsDao playerStatsDao;
	
	@Override
	public List<Player_Stats> getAllPlayerStats() {
		List<Player_Stats> list=playerStatsDao.findAll();
		if(list.isEmpty()) {
			//throw exception
		}
		return list;
	}

	@Override
	public Player_Stats getPlayerStatsById(Integer Id) {
		Optional<Player_Stats> opt=playerStatsDao.findById(Id);
		if(opt.isEmpty()) {
			//throw exception;
		}
		return opt.get();
	}

	@Override
	public List<Player_Stats> getPlayerStatsByFiler(Integer games, Integer minutes, Integer goals, Integer birth_year) {
		List<Player_Stats> list=playerStatsDao.findAll();
		if(list.isEmpty()) {
			//throw exception
		}
		if(games!=null)
			list.removeIf(i->(i.getGames()!=games));
		
		if(minutes!=null) 
			list.removeIf(i->(i.getMinutes()!=minutes));
		
		if(goals!=null)
			list.removeIf(i->(i.getGoals()!=goals));
		
		if(birth_year!=null) 
			list.removeIf(i->(i.getBirth_year()!=birth_year));
		
		return list;
	}

}
