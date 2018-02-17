import java.util.Scanner;

public class distinctNums {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] userNumber = new int[10];
		int counter = 0;
		
		System.out.print("Enter 10 numbers: ");
		
		for (int i = 0; i < 10; i++) {
			int number = input.nextInt();
			
			if(isNewNum(userNumber, number)) {
				userNumber[counter++] = number;
			}
		}
		System.out.println("The number of distinct numbers is: " + counter);
		System.out.println("The distinct numbers are: ");
		
		for (int i = 0; i < counter; i++) {
			System.out.print(userNumber[i] + " ");
		}
					
	}
	public static boolean isNewNum(int[] userNumber, int num) {
			int i = 0;
			if (num != userNumber[i]) {
				return true;
			} else {
			
				return false;
			}
	}
}

