package com.example.demo;

public class Player {
	private String selectedMove; //this is the move the player makes
	private int nrOfWins; //this is nr of wins
	
	public Player() {}

	public String getSelectedMove() {
		return selectedMove;
	}

	public void setSelectedMove(String selectedMove) {
		this.selectedMove = selectedMove;
	}

	public int getNrOfWins() {
		return nrOfWins;
	}

	public void setNrOfWins(int nrOfWins) {
		this.nrOfWins = nrOfWins;
	}
	
	
	

}
