
public class ComparableCircle extends GeometricObject {
	private int x;
	private int y;
	private double radius;
	
	ComparableCircle() {
		
	}
	
	ComparableCircle(double radius) {
		this.x = 0;
		this.y = 0;
		this.radius = radius;
	}

	ComparableCircle(int x, int y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public boolean equals(Object obj) {
        return obj instanceof ComparableCircle && radius == ((ComparableCircle) obj).radius;
    }
}
