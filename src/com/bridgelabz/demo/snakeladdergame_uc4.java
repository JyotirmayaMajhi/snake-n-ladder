package com.bridgelabz.demo;

public class snakeladdergame_uc4 {
	public static final int Win_Position=100;
	public static void main(String[] args) {
		
		final int NO_PLAY = 0;
		 final int snake = 1;
		 final int ladder = 2;
		 int player = 0;
		 
		 while(player < Win_Position) {
			 int dice = (int)(Math.random()*6 + 1);
			 
			 switch(dice){
				 
			 case NO_PLAY:
				 break;
				 
			 case snake: int temp = player - dice;
			 		if(temp <0) {
			 			player = 0;
			 		}
			 		else {
			 			player = temp;
			 		}
			 		break;
			 		
			 case ladder: player = player + dice;
			 		break;
			 }
			 System.out.println("Player's Position: "+player);
		 }
	}

}
