import java.util.Scanner;

public class unicodeOfCharacter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		String character = input.nextLine();
		
		if(character.length() != 1) {
			System.out.println("You must enter exactly one character");
			System.exit(1);
		}
		
		
		char ch = character.charAt(0);
		
		
		if ('A' <= ch && ch <= 'Z' || 'a' <= ch && ch <= 'z') {
			int uni = ch;
			System.out.println(" The unicode for the character " + character + " is " + uni);
		} else {
			System.out.println(ch + " is not a invalid input");
		}
			
		
		
	}

}
