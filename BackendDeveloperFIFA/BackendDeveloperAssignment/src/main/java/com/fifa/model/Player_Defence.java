package com.fifa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player_Defence {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String player;
	private String position;
	private String team;
	private String age;
	private Integer birth_year;
	private double minutes_90s;
	private Integer tackles;
	private Integer tackles_won;
	private Integer tackles_def_3rd;
	private Integer tackles_mid_3rd ;
	private Integer tackles_att_3rd; 
	private Integer dribble_tackles;
	private Integer dribbles_vs;
	private Double dribble_tackles_pct;
	private Integer dribbled_past;
	private Integer blocks; 
	private Integer blocked_shots; 
	private Integer blocked_passes;
	private Integer interceptions; 
	private Integer tackles_interceptions;
	private Integer clearances; 
	private Integer errors; 
}
