package dev.ranieri.daos;

import java.util.Set;

import dev.ranieri.entities.Player;

public interface PlayerDAO {

	//Create
	Player createPlayer(Player player);
	
	//Read
	Player getPlayerById(int id);	
	Set<Player> getAllPlayers();
	
	//Update
	Player updatePlayer(Player player);
	
	//Delete
	boolean deletePlayer(Player player);
	
}
