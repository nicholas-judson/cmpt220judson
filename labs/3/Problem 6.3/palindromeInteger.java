import java.util.Scanner;

public class palindromeInteger {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer  to see if it is a palindrome: ");
		int palindromeNumber = input.nextInt();
	    if(isPalindrome(palindromeNumber)) {
	    	System.out.print(palindromeNumber + " is a palindrome number. ");
	    }else {
	    	System.out.print(palindromeNumber + " is not a palindrome number. ");
	    }
	  }

	public static int reverse(int number) {
		int remainder = 0;
	    while (number != 0) {
	    	remainder = remainder * 10;
	    	remainder += (number % 10);
	    	number = number / 10; 
	    }return remainder;
	}
	    public static boolean isPalindrome(int number) {
		  return (number == reverse(number));
		  }
		  
	}

