<<<<<<< HEAD
import java.util.Scanner;

public class tip_calc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter subtotal and gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratrate = input.nextDouble();
		
		double gratuity = subtotal * (gratrate / 100);
		
		double total = subtotal + gratuity;
		
		System.out.println("The gratuity is " + gratuity + " and total is " + total);
	}

=======
import java.util.Scanner;

public class tip_calc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter subtotal and gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratrate = input.nextDouble();
		
		double gratuity = subtotal * (gratrate / 100);
		
		double total = subtotal + gratuity;
		
		System.out.println("The gratuity is " + gratuity + " and total is " + total);
	}

>>>>>>> 2d3904c58face0318f01e60ccb8eca359b001810
}