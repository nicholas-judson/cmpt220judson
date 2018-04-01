import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.print(" Please enter 5 integers: ");
		for(int i =0; i < 5; i++) {
			list.add(input.nextInt());
		}
		
		sort(list);
		
		System.out.println(" The sorted array is " + list.toString());
	}
	
	public static void sort(ArrayList<Integer> list) {
		java.util.Collections.sort(list);
	}

}
