
public class Repair extends Car {
	private String partName = " part name ";
	private double partCost = 0.00;
	private double taxRate = 0;
	private double hourlyRate = 1.0;
	private int hoursWorked = 1;
	private double discount = 0.0;
	/** Construct a default repair */
	public Repair() {
		
	}
	
	/** Construct a repair with the specified values */
	public Repair(String partName, double partCost, double taxRate, double hourlyRate, int hoursWorked, double discount) {
		this.partName = partName;
		this.partCost = partCost;
		this.taxRate = taxRate;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		this.discount = discount;
	}

	public Repair(String partName, double partCost, double taxRate, double hourlyRate, int hoursWorked, double discount, String make, String model, int year) {
		super(make, model, year);
		this.partName = partName;
		this.partCost = partCost;
		this.taxRate = taxRate;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		this.discount = discount;
	}
	@Override
	/** Return a string representation of this object */
	public String toString() {
		return "Make: " + make + 
				"\nModel: " + model +
				"\nYear: " + year +
				"\nPart Name: " + partName +
				"\nPart Cost $" + partCost +
				"\nTax Rate " + taxRate + " % " +
				"\nHourly Rate $" + hourlyRate +
				"\nHours Worked " + hoursWorked + 
				"\nDiscount $" + discount;
	}
	
	/** Return part name */
	public String getPartName() {
		return partName;
	}
	
	/** Set a new part name */
	public void setPartName() {
		this.partName = partName;
	}

	/** Return part cost */
	public double getPartCost() {
		return partCost;
	}
	
	/** Set a new part cost */
	public void setPartCost() {
		this.partCost = partCost;
	}
	
	/** Return tax rate */
	public double getTaxRate() {
		return taxRate;
	}
	
	/** Set a new tax rate */
	public void setTaxRate() {
		this.taxRate = taxRate;
	}
	
	/** Return hourly rate */
	public double getHourlyRate() {
		return hourlyRate;
	}
	
	/** Set a new hourly rate */
	public void setHourlyRate() {
		this.hourlyRate = hourlyRate;
	}
	
	/** Return hours worked */
	public int getHoursWorked() {
		return hoursWorked;
	}
	
	/** Set a new hours worked */
	public void setHoursWorked() {
		this.hoursWorked = hoursWorked;
	}
	
	/** Return discount */
	public double getDiscount() {
		return discount;
	}
	
	/** Set a new discount */
	public void setDiscount() {
		this.discount = discount;
	}
	
	/** Return mechanic cost */
	public double getMechanicCost() {
		return hourlyRate * hoursWorked;
	}
	
	public double getCost() {
		return getMechanicCost() + getPartCost();
	}
	public double getTax() {
		return getTaxRate() * getCost();
	}
	
	/** Print out the total cost */
	public String printRepairCost() {
		return "The total cost for the repair is $" + ((getCost() + getTax()) - getDiscount());
	}
}
