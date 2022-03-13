package com.example.demo;

public class RSPModel {
	private Player player1 = new Player();
	private Player player2 = new Player();
	
	public RSPModel() {}

	public void setPlayer1Move(String player1Move) {
		this.player1.setSelectedMove(player1Move);
	}

	public void setPlayer2Move(String player2Move) {
		this.player2.setSelectedMove(player2Move);
	}

//	public int getPlayer1Score() {
//		return player1.getCurrentScore();
//	}
	
//	public int getPlayer2Score() {
//		return player2.getCurrentScore();
//	}

	public String calculateScore() {
		String currentScore = "";
		String winner = "";
		String player1Move = this.player1.getSelectedMove();
		String player2Move = this.player2.getSelectedMove();
		
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
		
		//reset scores
		if (player1.getCurrentScore()==3 || player2.getCurrentScore()==3) {
			player1.resetScore();
			player2.resetScore();
		}
		
		//return status
		return "Player1: " + player1.getCurrentScore() + "<br>" +
				"Player2: " + player2.getCurrentScore() + "<br>" +
				"Winner:" + winner;

	}
	
	
	

}
