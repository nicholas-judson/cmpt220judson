
public class kgToLbAndLbToKg {

	public static void main(String[] args) {
		System.out.printf("%10s%10s    |  %10s%10s\n", "Kilograms", "Pounds",
		        "Pounds", "Kilograms");
		    System.out.println("------------------------------------------------"
		    		+ "\n");

		  
		    int kilograms = 1;
		    int pounds = 20;
		    for (int count =1; count < 200; count +=2) {
		      System.out.printf("%10d%10.1f    |  %10d%10.2f\n", kilograms, kilograms * 2.2,
		          pounds, pounds / 2.2);
		      kilograms+=2;
		      pounds += 5;
		    }
	}

}
