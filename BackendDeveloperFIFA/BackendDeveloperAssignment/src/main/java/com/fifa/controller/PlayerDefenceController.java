package com.fifa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fifa.model.Player_Defence;
import com.fifa.service.PlayerDefenceService;

@RestController
@RequestMapping("fifa/api/v1/defense")
public class PlayerDefenceController {
	
	@Autowired
	private PlayerDefenceService playerDefenceService;
	
	@GetMapping("/get-all-details")
	public ResponseEntity<List<Player_Defence>> getAllPlayerDefenceHandler(){
		
		List<Player_Defence> list=playerDefenceService.getAllPlayerdefence();
		
		return new ResponseEntity<List<Player_Defence>>(list,HttpStatus.ACCEPTED);
	
	}
	
	@GetMapping("/get-by-id/{p_id}")
	public ResponseEntity<Player_Defence> getPlayerDefenceByIdHandler(@PathVariable("p_id") Integer id){
		
		Player_Defence pd=playerDefenceService.getPlayerDefenceById(id);
		
		return new ResponseEntity<Player_Defence>(pd,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/apply-filter")
	public ResponseEntity<List<Player_Defence>> getPlayerDefenceByFilter(@RequestParam(required=false) String position, @RequestParam(required=false)  String team, @RequestParam(required=false) Integer tackles, @RequestParam(required=false) Integer tackles_won){
		
		List<Player_Defence> list=playerDefenceService.getPlayerDefenceByFilter(position, team, tackles, tackles_won);
		
		return new ResponseEntity<List<Player_Defence>>(list,HttpStatus.ACCEPTED);
	}
	
}
