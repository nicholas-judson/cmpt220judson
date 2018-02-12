
public class nNNWhileLoop {

	public static void main(String[] args) {
		int n = 0;
		while(n*n*n < 12000) {
			n++;
		}
		n--; // JA
		System.out.println("The largest integer such that n^3 is less than 12,000 is: " + n);
	}

}
