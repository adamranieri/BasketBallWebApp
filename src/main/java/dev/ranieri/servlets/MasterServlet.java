package dev.ranieri.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.ranieri.controllers.PlayerController;


public class MasterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public static PlayerController pc = new PlayerController();
    
    public MasterServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// uniform resource identifier 
		String uri = request.getRequestURI();
		System.out.println(uri);
		
		
		
		switch(uri) {
		
		case "/BasketBallWebApp/addPlayer.do" : {pc.addPlayer(request, response);break;}
		case "/BasketBallWebApp/getAllPlayers.do" : {pc.getAllPlayers(request, response);break;}
		case "/BasketBallWebApp/deletePlayer.do" : {pc.deletePlayer(request, response);break;}
		case "/BasketBallWebApp/getPlayersByTeam.do" : {pc.getPlayersByTeam(request, response);break;}
		
		default :{response.sendError(404, "The URI you entered does not exist!!!!!");}
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
