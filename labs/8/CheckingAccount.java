
public class CheckingAccount extends Account {

	private double OverdraftLimit;
	
	public CheckingAccount() {
		super();
		OverdraftLimit = -20;
	}
	
	public CheckingAccount(int id, double balance, double OverdraftLimit) {
		super(id, balance);
		this.OverdraftLimit = OverdraftLimit;
	}
	
	public void setOverdraftLimit() {
		this.OverdraftLimit = OverdraftLimit;
	}
	
	public double getOverdraftLimit() {
		return OverdraftLimit;
	}
	
	@Override
	public void withdraw(double withdrawal) {
		if(this.balance - withdrawal > OverdraftLimit) {
			this.balance -= withdrawal;
			
		} else {
			System.out.println(" You have exceeded your overdraft limit! ");
		}
	}
	
	@Override
		public String toString() {
			return "\nAccount ID: " + id + "\nDate created: " + getDateCreated()
				+ "\nBalance: $" + balance + 
				"\nMonthly interest: $" + getMonthlyInterest() + 
				"\nOverdraft limit: $" + OverdraftLimit;
		
	}
}
