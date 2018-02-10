
public class getPentagonalNumber {

	public static void main(String[] args) {
		for (int num = 1; num <= 100; num++ ) {
			if (num % 10 == 0) {
				System.out.printf("%7d \n", getPentagonalNumber(num));
			}else {
				System.out.printf("%7d", getPentagonalNumber(num));	
			}
		}
	}
	
	public static int getPentagonalNumber(int n) {
			n = n * ((3 * n) -1)/2;
			return n;
	}
	

}
