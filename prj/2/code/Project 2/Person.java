
public class Person {
	public String firstName = " FirstName ";
	public String lastName = " LastName ";
	public String address = " Address ";
	public String phoneNumber = " Phone Number ";
	public String emailAddress = " Email Address ";
	
	/** Construct a default person */
	public Person() {
		
	}
	
	/** Construct a person with the specified values */
	public Person(String firstName, String lastName, String address, String phoneNumber, String emailAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	
	/** Return firstName */
	public String getFirstName() {
		return firstName;
	}
	
	/** Set a new first name */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/** Return lastName */
	public String getLastName() {
		return lastName;
	}
	
	/** Set a new last name */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/** Return address */
	public String getAddress() {
		return address;
	}
	
	/** Set a new address */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/** Return phone number */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	/** Set a new phone number */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/** Return email address */
	public String getEmailAddress() {
		return emailAddress;
	}
	
	/** Set a new email address */
	public void setEmailAddress(String emailAddres) {
		this.emailAddress = emailAddress;
	}
	
	/** Return a string representation of this object */
	public String toString() {
		return "First Name: " + firstName + 
				" \nLast Name: " + lastName +
				" \nAddress: " + address +
				" \nPhone Number: " + phoneNumber +
				" \nEmail Address: " + emailAddress;
	}
}
