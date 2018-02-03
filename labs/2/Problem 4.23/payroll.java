import java.util.Scanner;

public class payroll {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		
		System.out.print("Enter numbers of hours worked in a week: ");
		double hour = input.nextDouble();
		
		System.out.print("Enter hourly pay rate: ");
		double rate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double fed = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double state = input.nextDouble();
		
		double gross = (hour * rate);
		
		double fedwithhold = (gross * fed);
		
		double statewithhold = (gross * state);
		
		double totalded = fedwithhold + statewithhold;
		
		double netpay = gross - totalded;
		
		
		
		System.out.println("Employee Name: " + name );
		System.out.println("Hours Worked: " + hour );
		System.out.printf("Pay Rate: %.2f %n", rate );
		System.out.printf("Gross Pay: %.2f %n", gross );
		System.out.println("Deductions");
		System.out.printf("\tFederal Withholding: %.2f %n", fedwithhold);
		System.out.printf("\tState Withholding: %.2f %n", statewithhold);
		System.out.printf("\tTotal Deduction: %.2f %n", totalded);
		System.out.printf("Net Pay: %.2f %n", netpay);
		
		
		
	}

}
