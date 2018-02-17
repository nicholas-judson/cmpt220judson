
public class convertFeetToMeters {

	public static void main(String[] args) {
		System.out.printf("%-10s%10s    |  %-10s%10s\n", "Feet", "Meters",
		        "Meters", "Feet");
		    System.out.println("------------------------------------------------"+ "\n");
		    
		 double feet = 1;
		 double meters = 20;
		 
		 for (int i = 1; i <= 10; feet++, meters += 5, i++) {
		      System.out.printf("%-15.1f%-15.3f%5s%-15.1f%-15.3f\n", feet, footToMeter(feet), "|    ", meters,
		          meterToFoot(meters));
		    }

	}
	
	public static double footToMeter(double foot) {
		return .305 * foot;
	}
	
	public static double meterToFoot(double meter) {
		return 3.279 * meter;
	}

}
