import java.util.Scanner;

public class sorted {

	public static void main(String[] args) {
		int arraySize = 100;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the size of the list: ");
		arraySize = input.nextInt();
		
		System.out.print("Enter the contents of the list: ");
		int[] arrayContents = new int[arraySize];
		
		for(int i = 0; i < arraySize; i++) {
			arrayContents[i] = input.nextInt();
			
		}
		
		if(isSorted(arrayContents)) {
			System.out.print("The list is already sorted. ");
			}else {
			System.out.print("The list is not sorted. ");
		}
		
		
	}
	public static boolean isSorted(int[] arrayContents) {
		for (int i = 0; i < arrayContents.length - 1; i++) {
			if (arrayContents[i] > arrayContents[i + 1]) 
				return false;
		}return true;
	}

}
