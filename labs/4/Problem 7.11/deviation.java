import java.util.Scanner;

public class deviation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] userNumber = new double[10];
		
		System.out.print("Enter 10 numbers: ");
		
		 for (int i = 0; i < 10; i++) 
		      userNumber[i] = input.nextDouble();
		 
		 System.out.printf("The mean is: %.2f %n", mean(userNumber));
		 System.out.printf("The standard deviation is: %.5f %n", deviation(userNumber));
	}
	
	public static double deviation(double[] x) {
		double mean = mean(x);
		double addSquare = 0;
		
		for (int i = 0; i < 10; i++) {
			addSquare += Math.pow(x[i] - mean, 2);
		}
		
		return Math.sqrt((addSquare)/9);
	}
	public static double mean(double[] x) {
		double add = 0;
		for (int i = 0; i < 10; i++) {
		add += x[i];
		
	}
		return add/10;
}
}