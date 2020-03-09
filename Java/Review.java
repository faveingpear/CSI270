import java.util.*;
public class Review{
	public static void main(String[] args){
		// Declaring variables
		
		int number;
		double othernumber;
		char letter = 'm';
		//string flag;
		String name = "Matthew";
		int index;
		
		System.out.println("Output to screen with new line");
		System.out.print("Output to screen without new line");
		
		Scanner kb = new Scanner(System.in);
		
		//flag = kb.next();
		
		//System.out.println(flag);
		
		number = kb.nextInt();
		
		// Logical expression (true/false)
		// if statements (based on true value)
		if (number > 34){
			System.out.println("Inside and if statement");
			System.out.println("If you see this then logical exspression is true");
		}
		
		// if-else strucure
		
		if (number < 12){
			System.out.println("Inside second if statment");
		}else{
			System.out.println("Inside else structure");
		}
		
		// repetition - looping
		
		// for loops
		// counter loops
		for (int counter = 0;counter < 10;counter++ ){
			System.out.println(counter + ": A test! For looping 10 times");
			
		}
		
		// while
		index = 0;
		while(index < 10){
			System.out.println(index + ": Testing while loop");
			index++;
		}
		
		index = 90;
		// do while
		// At least once loop
		do{
			System.out.println(index + ": Testing do while loop!");
			index++;
		}while(index < 10);
		
	}// End main method
}// End class Review
