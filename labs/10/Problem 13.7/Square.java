
public class Square extends GeometricObject implements Colorable {
	private double side;
	
	public Square() {
		side = 0;
	}
	
	Square(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
	public double getArea() {
		return side * side;
	}

	@Override
	public String howToColor() {
		return " Color all sides ";
	}

	@Override
	public double getPerimeter() {
		return 4 * side;
	}

}
