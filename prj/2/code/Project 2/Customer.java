
public class Customer extends Person {
	private int customerId;
	
	/** Construct a default customer */
	public Customer() {
	
	}
	
	/** Construct a customer with the specified values */
	public Customer(int customerId) {
		this.customerId = customerId;
	}
	
	public Customer(int customerId, String firstName, String lastName, String address, String phoneNumber, String emailAddress) {
		super(firstName, lastName, address, phoneNumber, emailAddress);
		this.customerId = customerId;
	}
	
	/** Return customer Id */
	public int getCustomerId() {
		return customerId;
	}
	
	/** Set a new customer Id */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	@Override
	/** Return a string representation of this object */
	public String toString() {
		return "Customer ID " + customerId +
				"\nFirst Name: " + firstName + 
				" \nLast Name: " + lastName +
				" \nAddress: " + address +
				" \nPhone Number: " + phoneNumber +
				" \nEmail Address: " + emailAddress;
	}
}
