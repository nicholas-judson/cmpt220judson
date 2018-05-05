
public class Car {
	public String make = " make ";
	public String model = " model ";
	public int year = 0000;
	
	/** Construct a default car */
	public Car() {
		
	}
	
	/** Construct a car with the specified values */
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	/** Return make */
	public String getMake() {
		return make;
	}
	
	/** Set a new make */
	public void setMake(String make) {
		this.make = make;
	}
	
	/** Return model */
	public String getModel() {
		return model;
	}
	
	/** Set a new model */
	public void setModel(String model) {
		this.model = model;
	}
	
	/** Return year */
	public double getYear() {
		return year;
	}
	
	/** Set a new year */
	public void setYear(int year) {
		this.year = year;
	}
	
	/** Return a string representation of this object */
	public String toString() {
		return "Make: " + make + 
				" \nModel: " + model +
				" \nYear: " + year;
	}
}
