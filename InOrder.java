/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		
			int firstNumber =  (int) (Math.random() * 10 );
		    System.out.print(firstNumber);
		    int secondNumber = (int) (Math.random() * 10);
		
		if (secondNumber >= firstNumber ) {
			System.out.print(" " + secondNumber );
			int thirdNumber = (int) (Math.random() * 10);
			if (thirdNumber >= secondNumber) {
				System.out.print(" " + thirdNumber);
				firstNumber = secondNumber;
				secondNumber = thirdNumber;
			}

		} 
	}
}
