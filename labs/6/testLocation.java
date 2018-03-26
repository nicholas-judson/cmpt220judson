import java.util.Scanner;

public class testLocation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print(" Enter the number of rows and columns of the array: ");
		int row = input.nextInt();
		int column = input.nextInt();
		double[][] a = new double[row][column];
		
		System.out.print(" Enter the array: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				a[i][j] = input.nextDouble();
			}
		}
		
			Location location = Location.locateLargest(a);
		System.out.println(" The location of the largest element is " + location.maxValue + " at ("
			+ location.row + " , " + location.column + ") ");
	}
}