<<<<<<< HEAD
import java.util.Scanner;

public class avg_accel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter v0, v1, and t: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		double accel = (v1 - v0)/t;
		
		System.out.println("The average acceleration is " + accel);
		
	}

}
=======
import java.util.Scanner;

public class avg_accel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter v0, v1, and t: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		double accel = (v1 - v0)/t;
		
		System.out.println("The average acceleration is " + accel);
		
	}

}
>>>>>>> 2d3904c58face0318f01e60ccb8eca359b001810
