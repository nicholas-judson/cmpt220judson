import java.util.Date;

public class theDateClass {

	public static void main(String[] args) {
		
		java.util.Date date = new java.util.Date();
		long elapsedTime = 10000;
		
		System.out.println("The dates and times for the elapsed times 10000, 100000, "
				+ " 1000000, 10000000, 100000000, 1000000000, 10000000000, and " + 
				" 100000000000 are: ");
		for (int i = 0; i < 8; i++) {
			date = new Date(elapsedTime);
			
			System.out.println( date.toString() );
			
			elapsedTime = elapsedTime * 10;
		}
	}

}
