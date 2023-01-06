package com.fifa.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fifa.model.Player_Defence;
import com.fifa.repository.PlayerDefenceDao;

@Service
public class PlayerDefenceServiceImpl implements PlayerDefenceService{
	
	@Autowired
	private PlayerDefenceDao playerDefenceDao;
	
	@Override
	public List<Player_Defence> getAllPlayerdefence() {
		
		List<Player_Defence> list=playerDefenceDao.findAll();
		if(list.isEmpty()){
			//throw exception;
		}
		return list;
	}

	@Override
	public Player_Defence getPlayerDefenceById(Integer id) {
		Optional<Player_Defence> opt=playerDefenceDao.findById(id);
		if(opt.isEmpty()) {
			//throw exception;
		}
		return opt.get();
	}

	@Override
	public List<Player_Defence> getPlayerDefenceByFilter(String position, String team, Integer tackles, Integer tackles_won) {
		List<Player_Defence> list=playerDefenceDao.findAll();
		if(list.isEmpty()) {
			//throw exception
		}
		if(position!=null)
			list.removeIf(i->(!i.getPosition().equals(position)));
		
		if(team!=null)
			list.removeIf(i ->(!i.getTeam().equals(team)));
		
		if(tackles!=null)
			list.removeIf(i->(i.getTackles()!=tackles));
		
		if(tackles_won!=null)
			list.removeIf(i->(i.getTackles_won()!=tackles_won));
		
		return list;
	}

}
