package com.boardgame.models;


public class Players {
	
	private int player_id;
	private String username;
	private int player_total;
	public String chip_color;
	private int cards;
	private int players_cards;
	private int max_players;
	private String teams;
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


	public int getPlayer_id() {
		return player_id;
	}


	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public int getPlayer_total() {
		return player_total;
	}


	public void setPlayer_total(int player_total) {
		this.player_total = player_total;
	}


	public String getChip_color() {
		return chip_color;
	}


	public void setChip_color(String chip_color) {
		this.chip_color = chip_color;
	}


	public int getCards() {
		return cards;
	}


	public void setCards(int cards) {
		this.cards = cards;
	}


	public int getPlayers_cards() {
		return players_cards;
	}


	public void setPlayers_cards(int players_cards) {
		this.players_cards = players_cards;
	}


	public int getMax_players() {
		return max_players;
	}


	public void setMax_players(int max_players) {
		this.max_players = max_players;
	}


	public String getTeams() {
		return teams;
	}


	public void setTeams(String teams) {
		this.teams = teams;
	}


	public int getMax_teams() {
		return max_teams;
	}


	public void setMax_teams(int max_teams) {
		this.max_teams = max_teams;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cards;
		result = prime * result + ((chip_color == null) ? 0 : chip_color.hashCode());
		result = prime * result + max_players;
		result = prime * result + max_teams;
		result = prime * result + player_id;
		result = prime * result + player_total;
		result = prime * result + players_cards;
		result = prime * result + ((teams == null) ? 0 : teams.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Players other = (Players) obj;
		if (cards != other.cards)
			return false;
		if (chip_color == null) {
			if (other.chip_color != null)
				return false;
		} else if (!chip_color.equals(other.chip_color))
			return false;
		if (max_players != other.max_players)
			return false;
		if (max_teams != other.max_teams)
			return false;
		if (player_id != other.player_id)
			return false;
		if (player_total != other.player_total)
			return false;
		if (players_cards != other.players_cards)
			return false;
		if (teams == null) {
			if (other.teams != null)
				return false;
		} else if (!teams.equals(other.teams))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Players [player_id=" + player_id + ", username=" + username + ", player_total=" + player_total
				+ ", chip_color=" + chip_color + ", cards=" + cards + ", players_cards=" + players_cards
				+ ", max_players=" + max_players + ", teams=" + teams + ", max_teams=" + max_teams + "]";
	}
	
	
}
