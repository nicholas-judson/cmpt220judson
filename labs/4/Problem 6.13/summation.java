
public class summation {

	public static void main(String[] args) {
		System.out.printf("%-20s%-20s\n", "i", "m(i)");
	    for (int i = 1; i <= 20; i ++)
	      System.out.printf("%-20d%-20.4f\n", i, m(i));
	}
	 public static double m(int i) {
		 double approx = 0;
		 
		 for (int k = 1; k <= i; k++) {
		      approx += k / (k + 1.0);
		    }
		 return approx;
	 }

}
