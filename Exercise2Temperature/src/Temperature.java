import java.util.Scanner; 

public class Temperature {
	
	
	public static void main(String[] args) {			
		

		Scanner scanner = new Scanner(System.in); 
		System.out.println("Please enter a temperature in Farenheit.");
		double farenheitNumberEntered = scanner.nextDouble();
		System.out.println("");

		double celsius = (5.0/9.0)*(farenheitNumberEntered - 32);
	    System.out.println("Temperature in Celsius is : " + celsius);

		System.out.println("");
		
		System.out.println("Please enter a temperature in Celcius");
		double celsiusNumberEntered = scanner.nextDouble();
		

        double fahrenheit = (9.0/5.0)*celsiusNumberEntered + 32;
        System.out.println("Temperature in Fahrenheit is : "+fahrenheit);
		
		
		scanner.close();
		
		
	}	
		
}