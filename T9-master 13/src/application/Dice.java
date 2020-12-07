package application;

import java.util.Random;

public class Dice {
	Random randNum = new Random();
	int random;
	
	public Dice(){
		random = randNum.nextInt(6)+1;
	}
	
	public int roll() {
		random = randNum.nextInt(6)+1;
		return random;
	}
	
	public int getNumber() {
		return random;
	}
	
}
