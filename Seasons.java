
public class Seasons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season(2,5);
		
		System.out.println("Winter");
		System.out.println("December 21st is in "+ Season(12,21));
		System.out.println("February 5th is in " + Season(2,5));
		System.out.println("March 19th is in " + Season(3,19));
		System.out.println("Spring");
		System.out.println("March 20st is in "  + Season(3,20));
		System.out.println("April 1st is in " + Season(4,1));
		System.out.println("June 20th is in " + Season(6,20));
		System.out.println("Summer");
		System.out.println("June 21st is in " + Season(6,21));
		System.out.println("August 1st is in " + Season(8,1));
		System.out.println("September 21st is in " + Season(9,21));
		System.out.println("Fall");
		System.out.println("September 22nd is in " + Season(9,22));
		System.out.println("November 1st is in " + Season(11,1));
		System.out.println("December 20th is in " + Season(12,20));

	}

	public static String Season(int month,int day) {
		
		// initialize the variable
		String theSeason = "";
		
		// if month is greater than or equal to 1 AND
		// is Less than or equal to 3 
		if(month >= 1 && month <= 3){
			
			// if day is less than or equal to 19
			if(day <= 19) {
				// it's winter
				// assign value to the variable we'll be returning
				theSeason = "winter";
			}
			else {
				// it's spring
				// assign value to the variable we'll be returning
				theSeason = "spring";
			}
		}
		else if (month >= 4 && month <= 6) {
			if(day <= 20) {
				// it's spring
				theSeason = "spring";
			}
			else {
				// it's summer
				theSeason = "summer";
			}
		}
		else if (month >= 7 && month <= 9) {
			if(day <= 21) {
				// it's summer
				theSeason = "summer";
			}
			else {
				// it's fall
				theSeason = "fall";
			}
		}
		else if (month >= 10 && month <= 12) {
			if(day <= 20) {
				// it's fall
				theSeason = "fall";
			}
			else {
				// it's winter
				theSeason = "winter";
			}
		}
		
		return theSeason;
	}
	
}
