import java.util.Scanner;

public class gameNineHeadsAndTails {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[][] binMatrix = new int[3][3];
		System.out.print("Enter a number between 0 and 511: ");
		String binString = stringLengthNine(input.nextInt());
		setMatrix(binString, binMatrix);
		dispMatrix(binMatrix);
	}
	
	public static void dispMatrix(int[][] binMatrix) {
		for (int i = 0; i < binMatrix.length; i++) {
			for (int j = 0; j < binMatrix[i].length; j++) 
				if (binMatrix[i][j] == 0) 
					System.out.print("[ H ]");
				else 
					System.out.print("[ T ]");
				
				System.out.println();
			
		}
	}
	
	public static void setMatrix(String binString, int[][] binMatrix) {
		int indCounter = 0;
		
		for (int i = 0; i < binMatrix.length; i++) {
			for (int j = 0; j < binMatrix[i].length; j++) {
				binMatrix[i][j] = Character.getNumericValue(binString.charAt(indCounter));
				indCounter++;
			}
		}
	}
	
	public static String stringLengthNine(int num) {
		String binString = Integer.toBinaryString(num);
		int length = binString.length();
		
		for(int i = 0; i <= (8 - length); i ++) {
			binString = (0 + binString);
	}
		return binString;
	}
}
