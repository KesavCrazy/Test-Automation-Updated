package com.kesav.interfaces;

public class FlyableRunner {

	public static void main(String[] args) {
	    Flyable[] flyingObjects = { new Birds(), new Aeroplane()};
	    for(Flyable object : flyingObjects) {
	    	object.fly();
	    }

	}

}
