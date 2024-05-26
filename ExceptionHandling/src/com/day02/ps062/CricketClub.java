package com.day02.ps062;

import java.util.Scanner;

public class CricketClub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Input: ");
		String playerName = sc.next();
		float critic1 = sc.nextFloat();
		float critic2 = sc.nextFloat();
		float critic3 = sc.nextFloat();
		
		CricketRating cr;
		if(critic3 != 0)
			cr = new CricketRating(playerName, critic1, critic2, critic3);
		else
			cr = new CricketRating(playerName, critic1, critic2);
		
		try {
			cr.Coins = cr.calculateCoins();
			cr.display();
		} catch(NotEligibeException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
