import java.util.Scanner;
public class A1_Paper {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int[] numberOfSheets = new int[number];
		
		for (int i = 1; i < number; i++) {
			numberOfSheets[i] = input.nextInt();
		}
		
		double[] tape = new double[number];
		
		for (int i = 1; i < number; i++) {
			tape[i] = Math.pow(2, ((double)(-1 - i * 2))/4.0);
		}
		
		double tapeUsed = 0;
		int nextPageSize = 1;
		
		for(int i = 0; i < number; i++) {
			tapeUsed = tapeUsed + tape[i] * ((double)(nextPageSize/2));
		
		
			if (numberOfSheets[i] >= nextPageSize) {
				nextPageSize = 0;
				break;
			}else {
				nextPageSize = (nextPageSize - numberOfSheets[i]) * 2; 
			}	
		}
		
		if(nextPageSize > 0) {
			System.out.println("impossible");
		}else{
			System.out.println(tapeUsed);
		}
	}
}
