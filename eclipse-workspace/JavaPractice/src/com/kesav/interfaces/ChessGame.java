package com.kesav.interfaces;

public class ChessGame implements GamingConsole{

	@Override
	public void up() {
		System.out.println("move up");
		
	}

	@Override
	public void down() {
		System.out.println("move down");
		
	}

	@Override
	public void left() {
		System.out.println("go left");
		
	}

	@Override
	public void right() {
		System.out.println("Go right");
		
	}

 

}

