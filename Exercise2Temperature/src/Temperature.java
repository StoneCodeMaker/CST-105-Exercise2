import java.util.Scanner; 

public class Temperature {
	
	public static double ConvertFarenheitToCelsius(double temp) 
	{
		double result = ((temp - 32) * 5 / 9);
		return result;
	}
	
	public static int ConvertCelsiusToFarenheit(int temp)
	{
		
		int result = ((5/9) * (temp - 32));
		return result;
		//fahrenheit = (celsius * 1.8) + 32;
	}
	
	
		
	public static String TestPassingInString(String blah)
	{
		String newBlah = "more stuff coming =>";
		newBlah += blah;
		return newBlah;
		//return 100;
	}
	public static void main(String[] args) {
		//double x = 1.5;
		//x *= 10 * (x + 1);
		//System.out.println(x);
		
		// testing out passing in a string to a method
		String returnToMe = "";
		String whatToPass = "I'm passing this in;";
		returnToMe = TestPassingInString(whatToPass);
				
		System.out.println(returnToMe);
		
		
		
		System.out.println("test temperature....");
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Please enter a temperature in Farenheit.");
		double farenheitNumberEntered = scanner.nextDouble();
		//System.out.printf("You entered %d", farenheitNumberEntered);
		System.out.println("");
		//double myret = ConvertFarenheitToCelsius(farenheitNumberEntered);
		double celsius = (5.0/9.0)*(farenheitNumberEntered - 32);
	    System.out.println("Temperature in Celsius is : " + celsius);
	    
		
		
		//System.out.printf("In Celsius that is %f degrees.", myret);
		
		System.out.println("");
		
		System.out.println("Please enter a temperature in Celcius");
		double celsiusNumberEntered = scanner.nextDouble();
		

	    
	    
	    
		//int valueReturned = ConvertCelsiusToFarenheit(celsiusNumberEntered);
		//System.out.printf("In Farenheit that is %d degrees", valueReturned);
		
		
		/*
		2. Write a program that prompts the user to enter a temperature in degrees Fahrenheit.
		Convert the temperature to degrees Celsius. Then prompt the user to enter a temperature
		in Celsius. Convert the temperature to degrees Fahrenheit. The formulas needed are C =
		(F - 32) * 5/9 and F = 9/5*C + 32.
		Here is a sample run of the program with user input shown in red.
		Enter a Fahrenheit temperature: 100
		100F is equivalent to 37.777�C
		Enter a Celsius temperature: 100
		100C is equivalent to 212F
		3. Test your results for each program carefully.
		*/
		
		
		scanner.close();
		
		
	}	
		
}