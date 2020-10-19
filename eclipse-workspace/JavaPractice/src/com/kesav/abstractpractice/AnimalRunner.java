package com.kesav.abstractpractice;

public class AnimalRunner {

	public static void main(String[] args) {
		AbstractAnimal[] animal = {new Cat(), new Dog()};
		for(AbstractAnimal animals : animal) {
		animals.bark();
		}
	}

}
 