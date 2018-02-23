import java.util.Scanner;
public class eliminateDuplicates {

	public static void main(String[] args) {
		int[] list = new int[10]; 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		for (int i = 0; i < 10; i++) {
			list[i] = input.nextInt();
		}
		System.out.println ("The distinct numbers are: ");
		printArray(eliminateDuplicates(list), 10);
	}
	
	public static int[] eliminateDuplicates(int[] list){
		int[] temp = new int[10];
        int tempIndex = 0;
        for (int i = 0; i < 10; i++) {

            boolean isDuplicate = false;
            for (int j = 0; j < 10; j++) {
                if (temp[j] == list[i]) {
                    isDuplicate = true;

                }
            }
            if (!isDuplicate) {
                temp[tempIndex++] = list[i];
            }

        }
        int[] noDuplicatesArray = new int[tempIndex];
        for (int i = 0; i < tempIndex; i++) {
            noDuplicatesArray[i] = temp[i];
        }

        return noDuplicatesArray;
    }
	public static void printArray(int[] array, int numberPerLine) {

        for (int i = 0; i < array.length; i++) {

        	System.out.printf("%1d ", array[i]);
        }
}
}
		

