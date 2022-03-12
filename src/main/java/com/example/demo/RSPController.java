package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/RPC")
public class RSPController {
	
	private String player1Move = "";
	private String player2Move = "computer";
	
	private RSPModel rspGame = new RSPModel(); //use the RSPmodel to set up a new game
	
	@RequestMapping(method = RequestMethod.POST)
	public String evaluateUserInput(
			String player1Move, 
			String player2Move){
		
		rspGame.setPlayer1Move(player1Move);
		rspGame.setPlayer2Move(player2Move);
		rspGame.calculateScore;
			
		
		return 
				"Player1: " + this.player1Move + "<br>" + 
				"Player2: " + this.player2Move + "<br>" +
				"<br>" +
				"Current score is" + "<br>" +
				"Player1: " + rspGame.getPlayer1Score() + "<br>" +
				"Player2: " + rspGame.getPlayer2Score();
	}
	
	
	@RequestMapping(
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	public String totalScore(
			String player1Move, 
			String player2Move){
			
		
		return "{ \"data\": \"value\" }";
	}
	

}
