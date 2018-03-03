
class theRectangleClass {
	/** The width and height of this rectangle */ 
	double width = 1;
	double height = 1;
	
	/** Construct a rectangle object */
	theRectangleClass() {
		
	}
	
	/** Construct a rectangle object */
	theRectangleClass(double newWidth, double newHeight){
		width = newWidth;
		height = newHeight;
	}
	
	/** Return the area of this rectangle */
	double getArea() {
		return width * height;
	}
	
	/** Return the perimeter of this rectangle */
	double getPerimeter() {
		return 2 * (width + height);
	}
	
}
