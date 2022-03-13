package com.example.demo;

public class RSPPlayerModel {
	private String selectedMove; //this is the move the player makes
	private int nrOfWins; //this is nr of wins
	private int currentScore;
	
	public RSPPlayerModel() {}

	public String getSelectedMove() {
		return selectedMove;
	}

	public void setSelectedMove(String selectedMove) {
		this.selectedMove = selectedMove;
	}

	public void increaseNrOfWins() {
		this.nrOfWins += 1;
	}
	
	public int getNrOfWins() {
		return nrOfWins;
	}

	public void setNrOfWins(int nrOfWins) {
		this.nrOfWins = nrOfWins;
	}
	
	public int getCurrentScore() {
		return currentScore;
	}
	
	public void setScore() {
		this.currentScore += 1;
	}
	
	public void resetScore() {
		this.currentScore = 0;
	}
	
	
	

}
