package com.example.demo;

public class RSPModel {
	private Player player1;
	private Player player2;
	
	public RSPModel() {}

	public void setPlayer1Move(String player1Move) {
		this.player1.setSelectedMove(player1Move);
	}

	public void setPlayer2Move(String player2Move) {
		this.player2.setSelectedMove(player2Move);
	}

	public int getPlayer1Score() {
		return player1.getCurrentScore();
	}
	
	public int getPlayer2Score() {
		return player2.getCurrentScore();
	}

	private String calculateScore() {
		String score = "";
		//decide who is winner for this round
		//if winner is player 1 add score to player 1
		//if winner is player 1 add score to player 1
		//if there is a winner return this, otherwise return score
		
		return String score;

	}
	
	
	

}
