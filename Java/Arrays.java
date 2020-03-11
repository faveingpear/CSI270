/*	Arrays
	CSI271
	* 2020-3-11
	* Working with Arrays
	* Solving a problem using Arrays
	* 
	* Problem Solving Steps
	* 1) Defining the problem
	* 2) Analyze Problem (Structred and Unstructured Parts)
	* 3) Design/Define potential solutions (Structured)
	* 4) Implemention sultion/s (coding) (15% - 20% of your time)
	* 5) Testing/Maintenance 

*/
import java.util.*;
public class Arrays{
	public static void main(String[] args){
		
		// Variable declaration
		int MAX_INDEX = 1000000; // It's going to be a while!
		int temp = 0;
		
		// Array declaration
		int[] number = new int[MAX_INDEX]; //Static declaration 
		
		// Initialize the array - Random values between 1 and 100
		for (int index = 0; index < MAX_INDEX; index++){
			number[index] = (int) (Math.random()*100+1);
		}
		
		// bubble sort algorithim
		for (int left = 0; left < number.length - 1; left++){
			for (int right = left + 1; right < number.length; right++){
				if (number[left] > number[right]){
					temp = number[left];
					number[left] = number[right];
					number[right] = temp;
				}
			}
		}
		for(int index = 0; index < MAX_INDEX; index++){
			System.out.print(index + ": " + number[index] + " ");
		} 
		System.out.println("");
	}
}
