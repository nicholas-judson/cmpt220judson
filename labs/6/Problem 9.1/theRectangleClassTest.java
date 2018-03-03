
public class theRectangleClassTest {
	/** Main method */
	public static void main(String[] args) {
	/** Create a rectangle with width 4 and height 40 */
		theRectangleClass rectangle1 = new theRectangleClass(4, 40);
		System.out.println("The area of the rectangle of width " + rectangle1.width +
				" and height " + rectangle1.height + " is " + rectangle1.getArea() +
				" and the perimeter of the rectangle of width " + rectangle1.width + 
				" and height " + rectangle1.height + " is " + rectangle1.getPerimeter());
		/** Create a rectangle with width 3.5 and height 35.9 */
		theRectangleClass rectangle2 = new theRectangleClass(3.5, 35.9);
		System.out.println("The area of the rectangle of width " + rectangle2.width +
				" and height " + rectangle2.height + " is " + rectangle2.getArea() + 
				" and the perimeter of the rectangle of width " + rectangle2.width + 
				" and height " + rectangle2.height + " is " + rectangle2.getPerimeter());
	}
}
