
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int count = 0;
		boolean boy = false;
		boolean girl = false;
	while (!(boy && girl)) {		
		double generate = Math.random();
		if (generate >= 0.5) {
			boy = true;
			System.out.print("b ");
			
		} else  {
			girl = true;
            System.out.print("g ");          
        }
        count += 1;
		}
		System.out.println();
		System.out.println("You made it... and you now have " + count + "  children.");
	}
	
	}

