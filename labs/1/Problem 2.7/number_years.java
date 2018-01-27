import java.util.Scanner;

public class number_years {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of minutes: ");
		double minutes = input.nextDouble();
		
		double years = minutes / 525600;
		double days = minutes % 525600 / 1440;
		
		System.out.println(minutes + " minutes is approximately " 
		+ (int) Math.floor (years) + " years and " +(int) Math.floor(days)+ " days");
		
	}

}
