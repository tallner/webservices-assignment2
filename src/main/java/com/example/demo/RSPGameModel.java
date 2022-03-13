package com.example.demo;

import java.util.Random;

public class RSPGameModel {
	private RSPPlayerModel player1 = new RSPPlayerModel();
	private RSPPlayerModel player2 = new RSPPlayerModel();
	
	public RSPGameModel() {}

	// set the player move
	// if player is set to computer, then a random value will be set
	public void setPlayer1Move(String player1Move) {
		if (player1Move.equals("computer")) {
			this.player1.setSelectedMove(randomVal());
		}else this.player1.setSelectedMove(player1Move);
	}

	public void setPlayer2Move(String player2Move) {
		if (player2Move.equals("computer")) {
			this.player2.setSelectedMove(randomVal());
		}else this.player2.setSelectedMove(player2Move);
	}
	
	// get the move. this is used for display only
	public String getPlayer1Move() {
		return player1.getSelectedMove();
	}
	
	public String getPlayer2Move() {
		return player2.getSelectedMove();
	}

	public String calculateScore() {
		String currentScore = "";
		String winner = "";
		String player1Move = this.player1.getSelectedMove();
		String player2Move = this.player2.getSelectedMove();
		
		//reset scores if there is a winner from last round
		if (player1.getCurrentScore()==3 || player2.getCurrentScore()==3) {
			player1.resetScore();
			player2.resetScore();
		}
		
		//decide who is winner for this round
		//if winner is player 1 add score to player 1
		//if winner is player 1 add score to player 1
		switch (player1Move) {
	      case "rock": //player1
	    	  
	    	  switch (player2Move) { //player2
			      case "rock":
			    	  currentScore = "tie";
			    	  break;
			      case "scissors": 
			    	  currentScore = "player1";
			    	  break;
			      case "paper":
			    	  currentScore = "player2";
			    	  break;
			      }
	    	  
	    	  break;
	    	  
	      case "scissors": //player1
	    	  
	    	  switch (player2Move) { //player2
			      case "rock":
			    	  currentScore = "player2";
			    	  break;
			      case "scissors": 
			    	  currentScore = "tie";
			    	  break;
			      case "paper":
			    	  currentScore = "player1";
			    	  break;
			      }
	    	  break;
	    	  
	      case "paper":  //player1
	    	  switch (player2Move) { //player2
			      case "rock":
			    	  currentScore = "player1";
			    	  break;
			      case "scissors": 
			    	  currentScore = "player2";
			    	  break;
			      case "paper":
			    	  currentScore = "tie";
			    	  break;
			      }
	    	  break;
	    	  
	    }
		
		//set score for the winner
		if (currentScore.equals("player1")) {
			player1.setScore();
		}else if (currentScore.equals("player2")) {
			player2.setScore();
		}else if (currentScore.equals("tie")){
			player1.setScore();
			player2.setScore();	
		}
		
		//check if there is a winner
		//if there is a winner return this, otherwise return score
		if (player1.getCurrentScore()==3 && player2.getCurrentScore()==3) {
			winner = "tie";
		}else if (player1.getCurrentScore()==3) {
			winner = "player1";
		}else if (player2.getCurrentScore()==3) {
			winner = "player2";
		}else winner = "round not finished";
		
		//return status
		return "Player1: " + player1.getCurrentScore() + "<br>" +
				"Player2: " + player2.getCurrentScore() + "<br>" +
				"Winner:" + winner;

	}
	
	
	private String randomVal() {
		Random rn = new Random();
		int answer = rn.nextInt(3);
		String returnVal = "";
		
		switch (answer) {
			case 0:
				returnVal = "rock";
				break;
			
			case 1:
				returnVal = "scissors";
				break;
				
			case 2:
				returnVal = "paper";
				break;
	
			default:
				break;
		}
		
		return returnVal;
	}

}
