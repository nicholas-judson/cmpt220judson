
public class LinearEquation {
	private Double a;
	private Double b;
	private Double c;
	private Double d;
	private Double e;
	private Double f;
	
	LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return a;
	}
	
	public double getC() {
		return c;
	}
	
	public double getD() {
		return d;
	}
	
	public double getE() {
		return e;
	}
	
	public double getF() {
		return f;
	}
	
	public boolean isSolvable() {
		return a*d - b*c != 0;
	}
	
	public double getX() {
		return (e*d - b*f) / (a*d - b*c);
	}
	
	public double getY() {
		return (a*f - e*c) / (a*d - b*c);
	}
}
