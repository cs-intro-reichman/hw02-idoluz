/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String word = args[0];
		String reverse = "";
		 for(int i = word.length() - 1; i >= 0; i--) {
		 	reverse = reverse + word.charAt(i);
		 }
		 int middle = (word.length() / 2);
		 if (word.length() % 2 == 0){
		 	middle = (word.length()-1) / 2;
		 }
		 System.out.println(reverse + "\n" + "The middle character is " + word.charAt(middle));
	}
}
