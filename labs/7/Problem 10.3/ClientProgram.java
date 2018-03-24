
public class ClientProgram {

	public static void main(String[] args) {
		MyInteger myInteger = new MyInteger(100);
		
		// Test MyInteger(), isEven(), isOdd(), isPrime() and getValue()
		System.out.println((myInteger.isOdd()) ? " It is an odd number. " : " It is not an odd number. ");
		System.out.println((myInteger.isEven()) ? " It is an even number. " : " It is not an even number. ");
		System.out.println((myInteger.isPrime()) ? " It is a prime number. " : " It is not a prime number. ");
		
		// Test MyInteger(int), isEven(int), isOdd(int), isPrime(int) and getValue(int)
		System.out.println(MyInteger.isOdd(myInteger) ? " It is an odd number " : " It is not an odd number ");
		System.out.println(MyInteger.isEven(myInteger) ? " It is an even number " : " It is not an even number ");
		System.out.println((MyInteger.isPrime(myInteger)) ? " It is a prime number. " : " It is not a prime number. ");

		// Test MyInteger(MyInteger), isEven(MyInteger), isOdd(MyInteger), isPrime(MyInteger) and getValue(MyInteger)
		System.out.println((MyInteger.isOdd(myInteger)) ? " It is an odd number. " : " It is not an odd number. ");
		System.out.println((MyInteger.isEven(myInteger)) ? " It is an even number. " : " It is not an even number. ");
		System.out.println((MyInteger.isPrime(myInteger)) ? " It is a prime number. " : " It is not a prime number. ");
		
		// Test equals(int)
		int[] values = {1,2,3};
		MyInteger value = new MyInteger(1);
		for (int i = 0; i < values.length; i++) {
			System.out.println(value.equals(values[i]) ? " They are equal. " : " They are not equal. ");
		}

		// Test equals(MyInteger)
		for (int i = 0; i < values.length; i++) {
			System.out.println(value.equals(myInteger) ? " They are equal. " : " They are not equal. ");
		}
		
		//Test parseInt(chart[]) & parseInt(String)
		char[] numericCharacters = {'1', '2', '3'};
		String numericString = "456";
		for (int i = 0; i < numericCharacters.length; i++) {
		 	System.out.print(numericCharacters[i] + "");
		} 
		System.out.println (MyInteger.parseInt(numericCharacters) + MyInteger.parseInt(numericString));
		}	
}

