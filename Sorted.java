
public class Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating the arrays
		double[] list1 = {16.1, 12.3, 22.2, 14.5};
		double[] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		// list 3 tests the 1 number array, as it should return true
		double[] list3= {1.5};

		System.out.println(isSorted(list1));
		System.out.println(isSorted(list2));
		System.out.println(isSorted(list3));
	}

	public static boolean isSorted(double[] list) {
		// Establishes a comparison and assumes all arrays contain a positive number
		double number = 0;
		
		// making sure the array has a length of at least 1
		if(list.length >= 1) {
			// loop through the array
			for(int i = 0; i < list.length; i++) {
				// testing to make sure that number is less than the next double
				if(number < list[i]) {
					// assigns number the value of the next number
					number = list[i];
				}else {
					// if the next number isn't less than number the list isn't sorted, return false
					return false;
				}
			}
			// we've made it to the end without issue, the list is sorted
			return true;
			
		}else {
			// array has length of 0 we return false 
			return false;
		}
		
	}
	
}
