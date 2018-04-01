import java.util.Date;
public class Account {
	protected int id = 0;
	protected double balance = 0.0;
	private double annualInterestRate = 0.0;
	private Date dateCreated;
	
	public Account() {
		dateCreated = new java.util.Date();
	}
	public Account(int id, double balance){
		this();
		this.id = id;
		this.balance = balance;	
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return this.balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	 public String getDateCreated() {
	        return this.dateCreated.toString();
	}
	
	public double getMonthlyInterestRate() {
		return (annualInterestRate/100) / 12;
	}
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	public void withdraw(double amount) {
		this.balance = this.balance - amount;
	}
	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}
	public String toString() {
		return "\nAccount ID: " + id + "\nDate created: " + getDateCreated()
			+ "\nBalance: $" + balance + 
			"\nMonthly interest: $" + getMonthlyInterest();
	}
}
