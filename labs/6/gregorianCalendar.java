import java.util.GregorianCalendar;
public class gregorianCalendar {

	public static void main(String[] args) {
		GregorianCalendar gregCal = new GregorianCalendar();
		
		System.out.println(" Today is " + gregCal.get(GregorianCalendar.MONTH) + " / "
		+ gregCal.get(GregorianCalendar.DAY_OF_MONTH) + " / "
		+ gregCal.get(GregorianCalendar.YEAR));
		
		gregCal.setTimeInMillis(1234567898765L);
		
		System.out.println(" Time elapsed since 1970 set to 1234567898765L is " 
		+ gregCal.get(GregorianCalendar.MONTH) + " / "
		+ gregCal.get(GregorianCalendar.DAY_OF_MONTH) + " / "
		+ gregCal.get(GregorianCalendar.YEAR));
	}
}
