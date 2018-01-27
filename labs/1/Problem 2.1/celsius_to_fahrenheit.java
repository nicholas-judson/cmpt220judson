import java.util.Scanner;

public class celsius_to_fahrenheit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the temperature in Celsius degrees: ");
		double celsius = input.nextDouble();
		
		double fahrenheit = 9.0 / 5 * celsius + 32;
		
		System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
	}

}
