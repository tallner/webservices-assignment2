package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/RPC")
public class RSPController {
	
	private RSPGameModel rspGame = new RSPGameModel(); //use the RSPmodel to set up a new game
	
	@RequestMapping(method = RequestMethod.POST)
	public String evaluateUserInput(
			String player1Move, 
			String player2Move){
		
		// validate input
		if (
				(!player1Move.equals("rock") &&
				!player1Move.equals("scissors") &&
				!player1Move.equals("paper") &&
				!player1Move.equals("computer"))
				||
				(!player2Move.equals("rock") &&
				!player2Move.equals("scissors") &&
				!player2Move.equals("paper") &&
				!player2Move.equals("computer"))
			)
		{
			return "Check your input values";
		}
		
		// set the moves to the game model that calculates 
		// the scores and returns it in string format
		rspGame.setPlayer1Move(player1Move);
		rspGame.setPlayer2Move(player2Move);
		String currentResult = rspGame.calculateScore();
		
		return 
				"Player1: " + rspGame.getPlayer1Move() + "<br>" + 
				"Player2: " + rspGame.getPlayer2Move() + "<br>" +
				"<br>" +
				"Current score:" + "<br>" + currentResult;
	}
	
	
	@RequestMapping(
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	public String totalScore(){
		return ObjectJson();
	}
	
	private String ObjectJson() {
		return "{"+ 
				"\"TotalNrOfGames\": \"" + rspGame.getNrOfGamesPlayed() + 
				"\"," +
				
				"\"Player 1\":" + 
					"[{"+
						"\"TotalWins\":" + "\"" + rspGame.getPlayer1TotalWins() + "\""+ 
						"," +
						"\"TotalLoss\":" + "\"" + rspGame.getPlayer1TotalLost() + "\""+ 
						"," +
						"\"TotalTie\":" + "\"" + rspGame.getPlayer1TotalTies() + "\""+
					"}]"+
				"," +
				
				"\"Player 2\":" + 
					"[{"+
						"\"TotalWins\":" + "\"" + rspGame.getPlayer2TotalWins() + "\""+ 
						"," +
						"\"TotalLoss\":" + "\"" + rspGame.getPlayer2TotalLost() + "\""+ 
						"," +
						"\"TotalTie\":" + "\"" + rspGame.getPlayer2TotalTies() + "\""+
					"}]"+
				"}";
	}
	

}
