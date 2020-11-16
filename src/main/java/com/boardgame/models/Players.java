package com.boardgame.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Component
@NoArgsConstructor @Getter @Setter @EqualsAndHashCode @ToString
public class Players {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "player_id")
	private int player_id;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "player_total")
	private int player_total;
	
	@Column(name = "chip_color")
	public String chip_color;
	
	@Column(name = "cards")
	private int cards;
	
	@Column(name = "players_cards")
	private int players_cards;
	
	@Column(name = "max_players")
	private int max_players;
	
	@Column(name = "teams")
	private String teams;
	
	@Column(name = "max_teams")
	private int max_teams;
	
	
	public Players(String username, int player_total, String chip_color, int cards, int players_cards, int max_players,
			String teams, int max_teams) {
		super();
		this.username = username;
		this.player_total = player_total;
		this.chip_color = chip_color;
		this.cards = cards;
		this.players_cards = players_cards;
		this.max_players = max_players;
		this.teams = teams;
		this.max_teams = max_teams;
	}


	public Players(int player_id, String username, int player_total, String chip_color, int cards, int players_cards,
			int max_players, String teams, int max_teams) {
		super();
		this.player_id = player_id;
		this.username = username;
		this.player_total = player_total;
		this.chip_color = chip_color;
		this.cards = cards;
		this.players_cards = players_cards;
		this.max_players = max_players;
		this.teams = teams;
		this.max_teams = max_teams;
	}

	
}
