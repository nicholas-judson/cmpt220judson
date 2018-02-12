import java.util.Scanner;

public class factorsOfInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Please enter an integer: ");
		
		int number = input.nextInt();
		
		System.out.print("The factors for the number " + number + " are ");
		int factor = 2;
		
		while(factor <= number) {
			
			if(number % factor == 0) {
				
				number = number/factor;
				System.out.print(factor + " ");
				
			}else {
				
				factor++;
			}
		}
	}

}
