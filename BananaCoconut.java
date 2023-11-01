/**
 * The program takes in numbers as command line arguments and prints out a string based on the value of the numbers.
 * @author Danielle Joseph
 */
public class BananaCoconut {
	/**
	 * checks if the string input is an integer or a word
	 * converts each argument into an integer, if an exception is thrown that means the conversion cannot work and
	 * therefore it is not an integer value
	 * If not an integer return false otherwise return true.
	 * @param args the command line argument input
	 * @return boolean value 
	 */
	private static boolean check_input(String [] args) {
		/* Variable check is true at default
		 * Variable num holds the conversion to an integer
		 */
		char character = 'a';
		int num = 9;
		boolean check = true;
		int num;
		
		for (int i = 0; i < args.length; i++) {
			
			try {
				
				num = Integer.parseInt(args[i]);
			}
			
			catch (Exception e) {
				
				check = false;
				
				return check;		
				
			}
				
		}
		//if the for loop iterates all the way through successfully and there is no exception
		return true;
	}
	
	/**
	 * First checks if there are no arguments, if there is none an error message is printed.
	 * Then checks if check_input returned true or false. If false, an error message is printed. 
	 * If true, a for loop iterates through each argument and prints values based on the if statements.
	 * The last argument is treated outside of the for loop to end the string without a whitespace at the end.
	 * @param args the command line argument input
	 */
	public static void main(String[] args) {
		
		if ( args.length == 0) {
			
			System.err.print("One or more numbers required as a command line argument.\nExample Usage: java BananaCoconut [number] [number] [...]");	
		}
		
		//if check_input returns false
		else if (!check_input(args)) {
			
			System.err.print("One or more numbers required as a command line argument.\nExample Usage: java BananaCoconut [number] [number] [...]");
			
		}
		
		else if (check_input (args)) {
			
			for ( int i = 0; i < args.length - 1; i++) {
				
				if (Integer.parseInt(args[i]) < 1) {
					
					System.out.print("puttputt ");
				}
				
				else if (Integer.parseInt(args[i]) % 3 == 0 && Integer.parseInt(args[i]) % 7 == 0) {
				
					System.out.print("banana-coconut ");
				
				}
				
				else if (Integer.parseInt(args[i]) % 3 == 0) {
					
					System.out.print("banana ");
				}
				
				else if (Integer.parseInt(args[i]) % 7 == 0) {
					
					
					System.out.print("coconut ");
				}
				
				
				else {
					//if the string is an integer, just print it out
					System.out.print(args[i] + " ");
					
				}
				
				
			}
			
			//check last argument separately to avoid whitespace at the end when printing out the string
			if (Integer.parseInt(args[args.length-1]) < 1) {
				
				System.out.print("puttputt");
			}
			
			else if (Integer.parseInt(args[args.length-1]) % 3 == 0 && Integer.parseInt(args[args.length-1]) % 7 == 0) {
			
				System.out.print("banana-coconut");
			
			}
			
			else if (Integer.parseInt(args[args.length-1]) % 3 == 0) {
				
				System.out.print("banana");
			}
			
			else if (Integer.parseInt(args[args.length-1]) % 7 == 0) {
				
				
				System.out.print("coconut");
			}
			
			
			else {
				
				System.out.print(args[args.length-1]);
				
			}
			
			
			
			
		}
		

	}	
		
	
}
	
	
	
	
	
	
	
	
	
	
	


