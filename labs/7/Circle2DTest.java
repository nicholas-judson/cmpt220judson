
public class Circle2DTest {

	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		System.out.print("The area is: " + c1.getArea() 
		+ "\nThe perimeter is: " + c1.getPerimeter() 
		+ "\nContains point (3, 3)? : " + (c1.contains(3,3) ? " True " : " False "));
		System.out.print(	
		"\nContains Circle2D(4, 5, 10.5)? : " + ((c1.contains(new Circle2D(4,5,10.5)) ? " True " : " False "))
		+ "\nOverlaps with Circle2D(3, 5, 2.3)? : " + (c1.overlaps(new Circle2D(3,5,2.3)) ? " True " : " False "));
	}

}
