import java.util.Scanner;

public class vowelOrConsonant {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		String letter = input.nextLine();
		
		char ch = Character.toUpperCase(letter.charAt(0));
		
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'Y') {
			System.out.println(" The letter " + letter + " is a vowel ");
		} else if ('A' <= ch && ch <= 'Z') {
			System.out.println(" The letter " + letter + " is a consonant ");
		} else if (Character.isDigit(ch)){
			System.out.println(" The number " + letter + " is not a letter ");
		}
	}

}
