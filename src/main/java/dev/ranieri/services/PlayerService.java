package dev.ranieri.services;

import java.util.Set;

import dev.ranieri.entities.Player;

public interface PlayerService {
	
	Player addPlayer(Player player);
	
	Set<Player> getAllPlayers();
	
	boolean deletePlayer(Player player);
	
	Set<Player> getAllPlayersByTeam(String team);

}
