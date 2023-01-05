package com.fifa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player_Playing_Time {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String player;
	private String position;
	private String team;
	private String age;
	private Integer birth_year;
	private Integer games;
	private Integer minutes;
	private Integer minutes_per_game;
	private Double minutes_pct;
	private Double minutes_90s;
	private Integer games_starts;
	private Integer minutes_per_start;
	private Integer games_complete;
	private Integer games_subs;
	private Integer minutes_per_sub;
	private Integer unused_subs;
	private Double points_per_game;
	private Integer on_goals_for;
	private Integer on_goals_against;
	private Integer plus_minus;
	private Double plus_minus_per90;
	private Double plus_minus_wowy;
	private Double on_xg_for;
	private Double on_xg_against;
	private Double xg_plus_minus;
	private Double xg_plus_minus_per90;
	private Double xg_plus_minus_wowy;
}
