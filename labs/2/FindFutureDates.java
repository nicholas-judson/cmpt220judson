import java.util.Scanner;


public class FindFutureDates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter today's day: ");
		int day = input.nextInt();
		
		System.out.print(" Enter the number of days elapsed since today: ");
		int daysElapsed = input.nextInt();
		
		int daysElapsedCalc = ( day + daysElapsed ) % 7;
		
		
		if (day == 0) {
			System.out.println("Today's day is Sunday");
		} else if (day == 1) {
			System.out.println("Today's day is Monday");
		} else if (day == 2) {
			System.out.println("Today's day is Tuesday");
		} else if (day == 3) {
			System.out.println("Today's day is Wednesday");
		} else if (day == 4) {
			System.out.println("Today's day is Thursday");
		} else if (day == 5) {
			System.out.println("Today's day is Friday");
		} else {
			System.out.println("Today's day is Saturday");
		}
		
		if (daysElapsedCalc == 0) {
			System.out.println("The future day is Sunday");
		} else if (daysElapsedCalc == 1) {
			System.out.println("The future day is Monday");
		} else if (daysElapsedCalc == 2) {
			System.out.println("The future day is Tuesday");
		} else if (daysElapsedCalc == 3) {
			System.out.println("The future day is Wednesday");
		} else if (daysElapsedCalc == 4) {
			System.out.println("The future day is Thursday");
		} else if (daysElapsedCalc == 5) {
			System.out.println("The future day is Friday");
		} else {
			System.out.println("The future day is Saturday");
		}
		
		
		
		
		
		
		
		
	}

}
