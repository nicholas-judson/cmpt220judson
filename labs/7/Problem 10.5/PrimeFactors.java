import java.util.Scanner;

public class PrimeFactors {
	
	public static void main(String[] args) {
		
		StackOfIntegers primeFactors = new StackOfIntegers(16);
		System.out.print("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int factor = 2;
	
		while (number != 1 ) {
			if ((number % factor) == 0) {
				primeFactors.push(factor);
				number /= factor;
			}else {
				factor++;
			}
		}
	
		while (primeFactors.getSize() != 0) {
			System.out.print(primeFactors.pop() + " ");
		}
	}
}