package dev.ranieri.entities;

public class Player {
	
	private int id;
	
	private String name;
	
	private int jersey;
	
	private String team;

	public Player() {
		super();
	}
	
	public Player(int id, String name, int jersey, String team) {
		super();
		this.id = id;
		this.name = name;
		this.jersey = jersey;
		this.team = team;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJersey() {
		return jersey;
	}

	public void setJersey(int jersey) {
		this.jersey = jersey;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", jersey=" + jersey + ", team=" + team + "]";
	}
	
}
