import java.util.Scanner;

public class negPos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int count = 0, poscount = 0,negcount = 0;
		float sum = 0;
		
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int number = input.nextInt();
		
		while (number != 0) {
			if (number > 0) {
				poscount++;
			}else {
				negcount++;
			}
			sum += number;
			count++;
			number = input.nextInt();
		}
		
		float avg = sum/count;
		
		System.out.println(" The number of positives is  " + poscount);
		System.out.println(" The number of negatives is " + negcount);
		System.out.printf(" The total is %.1f %n", sum);
		System.out.printf(" The average is %.2f %n", avg);
		
		
	}

}
