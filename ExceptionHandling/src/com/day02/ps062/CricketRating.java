package com.day02.ps062;

public class CricketRating {
	String playerName;
	float critic1;
	float critic2;
	float critic3;
	float avgRating;
	String Coins;
	
	public CricketRating(String playerName, float critic1, float critic2) {
		this.playerName = playerName;
		this.critic1 = critic1;
		this.critic2 = critic2;
		calculateAverageRating( critic1, critic2);
	}
	
	public CricketRating(String playerName,float critic1, float critic2, float critic3) {
		this.playerName = playerName;
		this.critic1 = critic1;
		this.critic2 = critic2;
		this.critic3 = critic3;
		calculateAverageRating(critic1,critic2, critic3);
	}
	
	void calculateAverageRating(float critic1, float critic2) {
		avgRating = (critic1 + critic2) / 2;
	}
	
	void calculateAverageRating(float critic1, float critic2, float critic3) {
		avgRating = (critic1 + critic2 + critic3) / 3;
	}
	
	public String calculateCoins() throws NotEligibeException {
		if(avgRating >= 7)
			return "gold";
		else if(avgRating >= 5)
			return "silver";
		else if(avgRating >= 2)
			return "copper";
		else
			throw new NotEligibeException("Player is not eligible for coins.");
		
		
	}
	
	void display() {
		System.out.println(playerName + " " + avgRating + " " + Coins);
	}
	
}

