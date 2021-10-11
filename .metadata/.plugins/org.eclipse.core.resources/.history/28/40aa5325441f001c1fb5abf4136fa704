import java.util.Scanner; 


public class UserInput {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Please enter a number to calculate sum of digits"); 
		int userNumber = scanner.nextInt(); 

		int sum = 0; 
		int input = userNumber; 
		
		while (input != 0) 
		{ 
			int lastdigit = input % 10; 
			sum += lastdigit; 
			
			input /= 10; 
			

		} 
		
		System.out.printf("Sum of digits of number %d is %d", userNumber, sum); 

		
		
		scanner.close(); // Close
		
		
		
		
		
		
		
	}

}
