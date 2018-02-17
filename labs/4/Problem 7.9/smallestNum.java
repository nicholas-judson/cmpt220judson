import java.util.Scanner;

public class smallestNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] userNumbers = new double[10];
		
		System.out.print("Enter 10 numbers: ");
		
		 for (int i = 0; i < 10; i++) 
		      userNumbers[i] = input.nextDouble();
		 
		 System.out.println("The minimum number is " + min(userNumbers));
	}
	public static double min(double[] array) {
		double min = array[0];
		
		for (int i = 1; i < array.length; i++) {
		      if (min > array[i]) {
		       min = array[i];
		      }
		}
		return min;
	}

}
