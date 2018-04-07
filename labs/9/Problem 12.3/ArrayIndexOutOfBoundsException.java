import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		int[] array = generateList(100);
		
		System.out.print("Enter an index of the array: ");
		
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("The number in the array is: " + array[input.nextInt()]);
		}catch(Exception ex){
			System.out.print("Your index is out of bounds.");
		}
	}
	public static int[] generateList(int size) {
		Random randomNumber = new Random();
		int[] tempList = new int[size];
		
		for (int i = 0; i < size; i++) {
			tempList[i] = randomNumber.nextInt(1000);
		}
		return tempList;
	}
}
