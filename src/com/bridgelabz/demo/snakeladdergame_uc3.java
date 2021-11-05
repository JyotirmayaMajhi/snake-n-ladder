package com.bridgelabz.demo;

import java.util.Scanner;

public class snakeladdergame_uc3 {
	
	public static void main(String[] args) {
			
			 final int NO_PLAY = 0;
			 final int snake = 1;
			 final int ladder = 2;
			 int player = 0;
		 
	  		int dice = (int) (Math.random() * 6 + 1);
	  		
	  		switch(dice) {
	  			
	  		case NO_PLAY:
	  			break;
	  			
	  		case snake: player = player-dice;
	  			break;
	  			
	  		case ladder: player = player + dice;
	  			break;
	  		}
	  		System.out.println("Player's Position" +player);
	}
	
    	  
    	
  		
	}
	
		
	
		
		
		
		
		
	


