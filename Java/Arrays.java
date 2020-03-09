public class Arrays{
	public static void main(String[] args){
		// Array declaration
		int[] number = new int[8];
		
		for(int counter = 0; counter < 8; counter++){
			number[counter] = counter;
		}
		for(int counter = 0; counter < 8; counter++){
			System.out.println(number[counter]);
		} 
	}
}
