import java.util.*;
public class PairOfDice{
	
	// instance variables
	private int die1; // six-sided die
	private int die2; // six-sided die
	
	// accessor methods
	
	public int getDie1(){
		return die1;
	}
	public int getDie2(){
		return die2;
	}
	
	// mutators methods
	
	public void setDie1(int value){
		if(value > 6){
			return;
		}else {
			die1 = value;
		}
	}
	public void setDie2(int value){
		if(value > 6){
			return;
		}else {
			die2 = value;
		}
	}
	
	// constuctors
	
	public PairOfDice(){ //  default constructor
		die1 = 1;
		die2 = 1;
	}
	
	public PairOfDice(int newVal1,int newVal2){
		die1 = newVal1;
		die2 = newVal2;
	}
	// Other
	
	// roll the dice(random number)
	public void rollDice(){
		
		// what algo should we use?
		// Us Math.random
		
		die1 = (int) (Math.random()*6 + 1);
		die2 = (int) (Math.random()*6 + 1);
	}
	
	// print out roll
	public void printRoll(){
		System.out.println("Roll: " + die1 + "," + die2); 
	}
	
	public static void main(String[] args){
		PairOfDice dice = new PairOfDice();
		PairOfDice dice1 = new PairOfDice(1,3);
		
		dice.printRoll();
		dice1.printRoll();
		
		System.out.println("Random Rolls:");
		
		for(int i = 0; i < 10; i++){
			dice.rollDice();
			dice.printRoll();
		}
	}
}// end class PairOfDice
