import java.util.Scanner;
public class TestTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Please enter three sides of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		System.out.println(" Please enter the color of the triangle: ");
		String color = input.next();
		
		System.out.println(" Please enter whether or not the triangle is filled ");
		Boolean filled = input.nextBoolean();
		
		Triangle TestTriangle = new Triangle(side1, side2, side3);
		TestTriangle.setFilled(filled);
	    TestTriangle.setColor(color);
		
		System.out.println(" \nA triangle " + TestTriangle.toString());
		System.out.println(" The area is " + TestTriangle.getArea());
		System.out.println(" The perimeter is " + TestTriangle.getPerimeter());
		System.out.println(" The color is " + TestTriangle.getColor());
		System.out.println(" filled:  " + (TestTriangle.isFilled()? "true" : "false" ));
	}

}
