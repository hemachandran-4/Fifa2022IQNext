package com.fifa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fifa.model.Player_Stats;
import com.fifa.service.PlayerStatsService;


@RestController
@RequestMapping("fifa/api/v1/statistics")
public class PlayerStatsController {
	
	@Autowired
	private PlayerStatsService playerStatsService;
	
	@GetMapping("/get-all-details")
	public ResponseEntity<List<Player_Stats>> getAllPlayerStatsHandler(){
		
		List<Player_Stats> list=playerStatsService.getAllPlayerStats();
		
		return new ResponseEntity<>(list,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/get-by-id/{p_id}")
	public ResponseEntity<Player_Stats> getPlayerStatsByIdHandler(@PathVariable("p_id") Integer id){
		
		Player_Stats ps=playerStatsService.getPlayerStatsById(id);
		
		return new ResponseEntity<Player_Stats>(ps,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/apply-filter")
	public ResponseEntity<List<Player_Stats>> getPlayerStatsByFilterHandler(@RequestParam(required=false) Integer games,@RequestParam(required=false) Integer minutes,@RequestParam(required=false) Integer goals,@RequestParam(required=false) Integer birth_year){
		
		List<Player_Stats> list=(List<Player_Stats>) playerStatsService.getPlayerStatsByFiler(games, minutes, goals, birth_year);
		
		return new ResponseEntity<List<Player_Stats>>(list,HttpStatus.ACCEPTED);
	
	}
}
