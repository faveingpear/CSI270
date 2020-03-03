/*
	Matthew Pearson
	CSCI 271-8873
	Assign 2
	Due Date: 03/11/20

	Create a program to estimate the square root of a number. I solved this by utilizing the formula (x + y/x)/2. If I calculated all the results from the inputed number to 0 and ploted them I noticed that this will result is a graph with a minimun value. For numbers which have a an integer square root then the min of the graph is equal to the y therefore if I could easily tell the square root. but for number that do not have an even square root the value would be .* and because I was using integers to iterate through the values I couldn't use the =='s check for them. I noticed that at the very max of the curve the value start to loop back. Using this I could check the value after the next to find the apex which is the decimal value. Ex: If the input is 63 then the max 9=8 --> 8=7.9375 --> 9=8. So according to my idea the value is 7.9375 

*/
import java.util.*;
public class Assign3{
    public static double squareRoot(double newVal){

	double approx = 0; // Vairable to store approx
	double inverseApprox = 0;

        for(double i = newVal; i > 0; i--){
		
		approx = (i + newVal/i)/2; // Approx value of the x
		inverseApprox = (i-2 + newVal/(i-2))/2; // Value of x but two y's ahead to check for the min

		if(approx == inverseApprox){ // Checks for the min
			return (i-1 + newVal/(i-1))/2;
		}else if(approx == i){ // Checks if the y = x
			return approx;
		}else if((int) (approx) == i){ // Rounds the approx for numbers that do not trigger the last too checks.
			return approx;
		}
        }
	return 0;
    }
    public static void main(String[] args){
	Scanner kb = new Scanner(System.in);

	System.out.print("Enter the number you want to aprox the square root of: ");
	double number = kb.nextDouble();

	System.out.println("Aprox Square root: " + squareRoot(number));
    }
}
