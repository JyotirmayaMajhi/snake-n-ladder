package com.bridgelabz.demo;

public class snakeladdergame_uc2 {
	 public static final int player=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Welcome to the Snakes and Ladders Game");
		
		System.out.print("Player intitial position: " + player);

		int dice = (int) ((Math.random() * 10) % 6) + 1;

		System.out.println("Dice is rolled " + dice);
	}

}
