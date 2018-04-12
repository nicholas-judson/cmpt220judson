
public class SavingsAccount extends Account {
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}
	
	@Override
	public void withdraw(double withdrawal) {
		if(withdrawal < this.balance) {
			this.balance -= withdrawal;
		} else {
			System.out.println(" You have exceeded your account balance! ");
		}
	}
	
	@Override
	public String toString() {
		return "\nAccount ID: " + id + "\nDate created: " + getDateCreated()
			+ "\nBalance: $" + balance + 
			"\nMonthly interest: $" + getMonthlyInterest();
	}
	

}
