package com.bridgelabz.demo;

public class snakeladdergame_uc6 {
	
	public static void main(String[] args) {
		
		int dice1;
		dice1 = (int)(Math.random()*6) + 1;
		
		int roll = dice1;
		
		System.out.println("Your total dice roll is " +roll);
		
		 final int NO_PLAY = 0;
		 final int snake = 1;
		 final int ladder = 2;
		 int player = 0;
	 
  		int dice = (int) (Math.random() * 6 + 1);
  		
  		switch(dice) {
  			
  		case NO_PLAY:
  			break;
  			
  		case snake: int temp1 = player-dice;
  		if(temp1 < 0) {
 			player = 0;
 		}
 		else {
 			player = temp1;
 		}
  			break;
  			
  		case ladder: int temp2 = player + dice;
  		if(temp2 <= 100) {
 			player = 100;
 		}
 		else
 		{
 			player = temp2;
 		}
 		break;
  			
  		}
  		System.out.println("Player's Position" +player);
	}

}
