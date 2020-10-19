package com.kesav.interfaces;

public class GameRunner {

	public static void main(String[] args) {
		//MarioGame marioGame = new MarioGame();
	   // ChessGame chessGame = new ChessGame();	
	   //using polymorphsim
		GamingConsole game = new ChessGame();
		game.up();
	    game.down();
	    game.left();
	    game.right();

	}

}
