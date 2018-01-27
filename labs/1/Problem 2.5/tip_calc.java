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

}