
public class Octagon extends GeometricObject implements Cloneable {
	private double side;
	
	public Octagon() {
		side = 0;
	}
	
	Octagon(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public Object clone()  throws CloneNotSupportedException{
		return super.clone();
		//Object OctagonClone = null;
		//try {
			//OctagonClone = super.clone();
		//}catch(CloneNotSupportedException ex){
			//return null;
		//}
		//return OctagonClone;
	}
	
	@Override
	public double getArea() {
		return (2 + (4 / Math.sqrt(2))) * side * side;
	}

	@Override
	public double getPerimeter() {
		return 8 * side;
	}

}
