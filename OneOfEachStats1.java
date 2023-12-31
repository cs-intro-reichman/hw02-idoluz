/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int t = Integer.parseInt(args[0]);

            int count = 0;
			int twokids = 0;
			int threekids = 0;
			int fourplus = 0;
            boolean boy = false;
		    boolean girl = false;
		    double avg = 0.0;
		for (int i =1; i <= t; i++ ) {
			
	      while (!(boy && girl)) {		
		    double generate = Math.random();
		if (generate >= 0.5) {
			boy = true;	
		} else  {
			girl = true;
                      
        }
        count += 1;
		}
		avg = avg + count;
		if (count == 2) {
			twokids += 1;
		  } else if (count == 3 ) {
			  threekids += 1;
		      } else if (count >= 4) {
			     fourplus += 1;
		    }
		    boy = false;
		    girl = false;
		    count = 0;
		}
		int mode = Math.max(fourplus, Math.max (threekids, twokids));
		if (mode == fourplus){
			mode = 4;
		} else if (mode == threekids) {
			mode = 3;
		} else {
			mode = 2;
		} 
		
		avg =  (avg / t);
		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twokids );
		System.out.println("Number of families with 3 children: " + threekids );
		System.out.println("Number of families with 4 or more children: " + fourplus );
		System.out.println("The most common number of children is " + mode + ".");
	}
}
