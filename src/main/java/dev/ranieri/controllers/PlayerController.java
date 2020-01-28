package dev.ranieri.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dev.ranieri.entities.Player;
import dev.ranieri.services.PlayerService;
import dev.ranieri.services.PlayerServiceImpl;

public class PlayerController {

	private PlayerService ps = new PlayerServiceImpl();
	
	public void addPlayer(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String json = request.getParameter("payload");	
		
		Gson gson = new Gson();
		
		Player player = gson.fromJson(json, Player.class);
		
		player = ps.addPlayer(player);
		
		PrintWriter pw = response.getWriter();
		
		pw.append(gson.toJson(player));
		
	}
	
	public void getAllPlayers(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		Set<Player> players = ps.getAllPlayers();
		
		Gson gson = new Gson();
		
		String json = gson.toJson(players);
		
		PrintWriter pw = response.getWriter();
		
		pw.append(json);
	}
	
	public void deletePlayer(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		Player p = new Player();
		p.setId(id);
		
		boolean result = ps.deletePlayer(p);
		
		PrintWriter pw = response.getWriter();
		pw.append("Player deleted");
		
		
	}
	
	public void getPlayersByTeam(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String team = request.getParameter("team");		
		Set<Player> players = ps.getAllPlayersByTeam(team);
		
		Gson gson = new Gson();	
		String json = gson.toJson(players);
		PrintWriter pw = response.getWriter();
		
		pw.append(json);
		
	}
	
	
	
	
}
