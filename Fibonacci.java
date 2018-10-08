
public class Fibonacci {
	
	public static void main(String[] args) {
		
		int number1 = 0; // starting number when at 0
		int number2 = 1; // starting number when at 1
		
		// printing the first two numbers of the sequence
		System.out.print(number1 + " " + number2 + " ");
		
		// loop to create the rest of the sequence
		for(int i = 0; i <= 9; i++) {
			
			// create the next number in the sequence
			int number3 = number1 + number2;
			
			// print the next value in the sequence
			System.out.print(number3 + " ");
			
			// assigning value of number 2 to number 1, to use in the next iteration
			number1 = number2;
			
			// assigning value of number 3 to number 2, to use in the next interation
			number2 = number3;
		
		} // end of for int i 
		
	} // end of main
	

}
