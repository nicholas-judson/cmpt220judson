
public class IllegalTriangleException extends Exception {
	private double side;
	
	public IllegalTriangleException(double side) {
		super("Illegal side: " + side);
	}
	
	public double getSide() {
		return side;
	}

}
