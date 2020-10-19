package com.kesav.abstractpractice;

public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Get the utensils");
		
	}

	@Override
	void doTheDish() {
		System.out.println("Get stuff ready");
		System.out.println("Put it in the  microwave");
		
	}

	@Override
	void cleanup() { 
		System.out.println("Cleanup the utensils");
		System.out.println("Switch off the microwave");
		
	}

}
 
