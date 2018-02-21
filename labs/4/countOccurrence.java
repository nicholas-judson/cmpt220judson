
import java.util.Scanner;

public class countOccurrence {
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	
	int[] number = new int[101];
	int[] counter = new int[101];
	int i;
	int temp = 0;
	
	System.out.println("Enter the integers between 1 and 100, 0 to end: ");
	
	for (i = 0; i < number.length; i++) {
		number[i] = input.nextInt();
		
		if(number[i] == 0) {
			break;
		}
	}
	for (i = 0; i < number.length; i++) {
		temp = number[i];
		counter[temp]++;
	}
	for (i = 1; i< counter.length; i++) {
		if(counter[i] > 0 && counter[i] == 1) {
			System.out.println(i +" occurs " + counter[i] + " time ");
		}else if (counter[i] >=2){
			System.out.println(i + " occurs " + counter[i] + " times ");
		}
	}
	
	}

}