
public class Mechanic extends Person {
	private String location = " Location ";
	private int mechanicId = 1;
	
	/** Construct a default mechanic */
	public Mechanic() {
	
	}

	/** Construct a mechanic with the specified values */
	public Mechanic(String location, int mechanicId) {
		this.location = location;
		this.mechanicId = mechanicId;
	}
	
	public Mechanic(String location, int mechanicId, String firstName, String lastName, 
			String address, String phoneNumber, String emailAddress) {
		super(firstName, lastName, address, phoneNumber, emailAddress);
		this.location = location;
		this.mechanicId = mechanicId;
		
	}
	
	/** Return location */
	public String getLocation() {
		return location;
	}
	
	/** Set a new location */
	public void setLocation() {
		this.location = location;
	}
	
	/** Return mechanic Id */
	public int getMechanicId() {
		return mechanicId;
	}
	
	/** Set a new mechanic Id */
	public void setMechanicId(int mechanicId) {
		this.mechanicId = mechanicId;
	}
	
	@Override
	/** Return a string representation of this object */
	public String toString() {
		return "Location " + location +
				"\nMechanic ID " + mechanicId +
				"\nFirst Name: " + firstName + 
				" \nLast Name: " + lastName +
				" \nAddress: " + address +
				" \nPhone Number: " + phoneNumber +
				" \nEmail Address: " + emailAddress;
	}
}
