import java.util.Scanner; 

public class Temperature {
	
	public static double ConvertFarenheitToCelsius(double temp) 
	{
		double result = ((temp - 32) * 5 / 9);
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
	
		int i = 22, j = 6;
		System.out.println((i / j + 5) /5);
		
		int yy = 10; 
		double xz = yy + 2 * 10;
		System.out.println(xz);
		
		int a = 2;
		double b = 1;
		System.out.println(b/a);
		
		double rate = (double)(1/6 * 10);
		
		System.out.print("here is the rate: ");
		System.out.println(rate);
		
		
		int n = 12345;
		n = n/10;
		System.out.print(" 12345 here");
		System.out.println(n);
		
		int yg = 10;
		++yg;
		System.out.println(yg);
		
		int num =5;
		double xxx = num * 0.5;
		System.out.println(xxx);
		
		int yt = 10;
		yt += 3 * 2;
		System.out.println(yt);
		
		int nn =  12345;
		nn = n/10;
		System.out.println(nn);
		
		
		
		double test = 33;
		int test2 = 4;
		
		double x = 1.5;
		x *= 10 * (x +1);
		System.out.println(x);
		
		
		int result = 13 - 3 * 5 / 4 % 3;
		System.out.println(result);
		
		int xx = 4;
		int y = 5;
		
		//x - y = 22;
		
		xx = 22 + y;
		
		
		
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
		double myret = ConvertFarenheitToCelsius(farenheitNumberEntered);
		
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