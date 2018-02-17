import java.util.Scanner;

public class Triangles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the three sides of a triangle: ");
		
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		if (isValid(side1, side2, side3)) {
				System.out.print("The area of your triangle is " + area(side1, side2, side3));
		}
		else{
			System.out.print("Your input is invalid");
		}
	}
	
	public static boolean isValid(double side1, double side2, double side3) {
		boolean isTrue = side1 + side2 > side3 && side1 + side3 > side1;
		
		return isTrue;
	}
	
	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3)/2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
}
