package dev.ranieri.services;

import java.util.HashSet;
import java.util.Set;

import dev.ranieri.daos.PlayerDAO;
import dev.ranieri.daos.PlayerDAOLocal;
import dev.ranieri.entities.Player;

public class PlayerServiceImpl implements PlayerService {

	PlayerDAO pdao = new PlayerDAOLocal();
	
	public Player addPlayer(Player player) {		
		return pdao.createPlayer(player);
	}

	public Set<Player> getAllPlayers() {	
		return pdao.getAllPlayers();
	}

	public boolean deletePlayer(Player player) {	
		return pdao.deletePlayer(player);
	}

	@Override
	public Set<Player> getAllPlayersByTeam(String team) {
		
		Set<Player> allPlayers = pdao.getAllPlayers();		
		Set<Player> teamPlayers = new HashSet<Player>();
		
		for(Player p : allPlayers) {
			
			if(p.getTeam().equals(team)) {
				teamPlayers.add(p);
			}
		}
		
		return teamPlayers;
	}
	

}
