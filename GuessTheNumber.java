import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		makeGuesses();
	}

	public static void makeGuesses(){
		// create the random 
		Random rand = new Random();
	    
		// set the variable and first guess
	    int guess = rand.nextInt(49) + 1;
	    
	    //Set the counter variable.
	    // set to because it could get a number >=  48 on the first try
	    int count = 1;
	    
	    //Test if Guess is lower than 48 
	    while(guess < 48){
	    	// print line to show what the guess was
	    	System.out.println("Guess = " + guess);
		    
	    	// set guess for the next pass
	    	guess = rand.nextInt(49) + 1;
	      
	    	// increment count 
	    	count++;
	    }
	    
	    // print the last guess
	    System.out.println("Guess = " + guess);
	    
	    // print how many guesses it took
	    System.out.println("Total guesses = " + count);
	    
	  } // end of makeGuesses()
	
}
