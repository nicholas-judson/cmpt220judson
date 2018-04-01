
public class TestAccount {

	public static void main(String[] args) {
		Account testAccount = new Account(110, 20000);
		testAccount.setAnnualInterestRate(4.5);
		testAccount.withdraw(2500.0);
		testAccount.deposit(3000.0);
		System.out.println(testAccount.toString());
		
		SavingsAccount testSavingsAccount = new SavingsAccount(111, 20000);
		testSavingsAccount.setAnnualInterestRate(4.5);
		testSavingsAccount.withdraw(2500.0);
		testSavingsAccount.deposit(3000.0);
		System.out.println(testSavingsAccount.toString());
		
		CheckingAccount testCheckingAccount = new CheckingAccount(112, 20000, -100);
		testCheckingAccount.setAnnualInterestRate(4.5);
		testCheckingAccount.withdraw(2500.0);
		testCheckingAccount.deposit(3000.0);
		System.out.println(testCheckingAccount.toString());
	}

}
