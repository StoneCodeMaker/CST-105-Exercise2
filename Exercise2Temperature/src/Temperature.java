import java.util.Scanner; 

public class Temperature {
	
	public static int ConvertFarenheitToCelsius(int temp) 
	{
		int result = ((temp - 32) * 5 / 9);
		return result;
	}
	
	public static int ConvertCelsiusToFarenheit(int temperature)
	{
		int temperatureResult = ((9 / 5) * temperature) + 32;
		return temperatureResult;
	}
	
	public static String TestPassingInString(String blah)
	{
		String newBlah = "more stuff coming =>";
		newBlah += blah;
		return newBlah;
		//return 100;
	}
	public static void main(String[] args) {
	
		// testing out passing in a string to a method
		String returnToMe = "";
		String whatToPass = "I'm passing this in;";
		returnToMe = TestPassingInString(whatToPass);
				
		System.out.println(returnToMe);
		
		
		
		System.out.println("test temperature....");
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Please enter a temperature in Farenheit.");
		int farenheitNumberEntered = scanner.nextInt();
		//System.out.printf("You entered %d", farenheitNumberEntered);
		System.out.println("");
		int myret = ConvertFarenheitToCelsius(farenheitNumberEntered);
		
		System.out.printf("In Celsius that is %d degrees.", myret);
		
		System.out.println("");
		
		System.out.println("Please enter a temperature in Celcius");
		int celsiusNumberEntered = scanner.nextInt();
		int valueReturned = ConvertCelsiusToFarenheit(celsiusNumberEntered);
		System.out.printf("In Farenheit that is %d degrees", valueReturned);
		
		
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