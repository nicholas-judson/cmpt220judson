import java.util.Date;

public class testAccount {
	public static void main(String[] args) {
		Account testAccount = new Account(1122, 20000);
		testAccount.setAnnualInterestRate(4.5);
		testAccount.withdraw(2500.0);
		testAccount.deposit(3000.0);
		
		System.out.println(" The balance is: $ " + testAccount.getBalance());
		System.out.println(" The monthly interest is: " + testAccount.getMonthlyInterest());
		System.out.println(" The account was created on : " + testAccount.getDateCreated());
	}
}
