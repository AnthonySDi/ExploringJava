
public class PrintingPowers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// write a method called printPowersOfN
		// NOTES:
		//	- when possible I set numbers involved in math to doubles to create a habit of it
		//		something I picked up when working in c#
		
		// Using Math Library
		printPowersOfN(4,3);
		printPowersOfN(7,8);
		
		// No math library
		printPowersOfX(4,3);
		printPowersOfX(7,8);
		
	}
	
	public static void printPowersOfN(double number, int times ) {
		
		// start a loop to iterate the value of times
		for(double i = 0; i <= times; i++) {
			
			// create variable power with value of number to the power of i
			double power = Math.pow(number, i);
			
			//print the power that's been casted to an int for formatting
			// NOTE: casting a value of 9.999 does not create value 10 it takes the digit before the decimal
			System.out.print( (int)power + " ");
			
		} // end of for loop
		
		// start new line
		System.out.println();
		
	} // end of printPowersOfN()
	
	
	public static void printPowersOfX(double number, int times ) {
		
		//set a variable to use over in a loop with value of one
		double power = 1;
		
		// start loop
		for(int i = 0; i <= times; i++) {

			// print the current value of power
			System.out.print((int)power + " ");
			
			// set power to equal result of the powers equation for the next iteration of the loop
			power = power * number;
			
		} // end of for loop
		
		// start new line
		System.out.println();
		
	} // end of printPowersOfX()

}
