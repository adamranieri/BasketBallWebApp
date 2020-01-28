package dev.ranieri.daos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import dev.ranieri.entities.Player;

public class PlayerDAOLocal implements PlayerDAO{

	static final Map<Integer,Player> playertable = new HashMap<Integer,Player>();
	static int idmaker = 1001;
	
	public Player createPlayer(Player player) {
		idmaker++;
		player.setId(idmaker);		
		
		playertable.put(player.getId(), player);
				
		return player;
	}

	public Player getPlayerById(int id) {
		
		Player player = playertable.get(id);
		
		return player;
	}

	public Set<Player> getAllPlayers() {
		
		Set<Player> players = new HashSet<Player>(playertable.values());
		
		return players;
	}

	public Player updatePlayer(Player player) {
		
		playertable.put(player.getId(), player);
		
		return player;
	}

	public boolean deletePlayer(Player player) {
		
		if(playertable.remove(player.getId()) == null){		
			return false;
		}
		
		return true;
	}

}
