import java.util.Scanner;

public class NumberOfDaysInMonth {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter a month: ");
		int month = input.nextInt();
		
		System.out.print(" Enter a year: ");
		int year = input.nextInt();
		
		if (month == 1) {
			System.out.println("The month January in " + year + " had 31 days. ");
		} else if (month == 2 && (year % 4 != 0)) {
			System.out.println("The month February in " + year + " had 28 days. ");
		} else if (month == 2 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			System.out.println("The month February in " + year + " had 29 days. ");
		} else if (month == 3) {
			System.out.println("The month March in " + year + " had 31 days. ");
		} else if (month == 4) {
			System.out.println("The month April in " + year + " had 30 days. ");
		} else if (month == 5) {
			System.out.println("The month May in " + year + " had 31 days. ");
		} else if (month == 6) {
			System.out.println("The month June in " + year + " had 30 days. ");
		} else if (month == 7) {
			System.out.println("The month July in " + year + " had 31 days. ");
		} else if (month == 8) {
			System.out.println("The month August in " + year + " had 31 days. ");
		} else if (month == 9) {
			System.out.println("The month September in " + year + " had 30 days. ");
		} else if (month == 10) {
			System.out.println("The month October in " + year + " had 31 days. ");
		} else if (month == 11) {
			System.out.println("The month November in " + year + " had 30 days. ");
		} else {
			System.out.println("The month December in " + year + " had 31 days. ");
		}
	}

}
