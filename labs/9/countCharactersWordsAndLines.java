import java.io.File;
import java.util.Scanner;

public class countCharactersWordsAndLines {
	
	public static void main(String[] args) throws Exception {
		
		if (args.length != 1) {
			System.out.println("Usage: java countCharactersAndLines sourceFile oldStr newStr");
			System.exit(1);
		}	

		
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.println("File " + args[0] + " does not exist");
			System.exit(2);
		}

		int characters = 0;
		int words = 0;			
		int lines = 0;			

		try (
			
			Scanner input = new Scanner(sourceFile);
		) {
			while (input.hasNext()) {
				lines++;
				String s1 = input.nextLine();
				characters += s1.length();
			}
		}

		try (
			
			Scanner input = new Scanner(sourceFile);
		) {
			while (input.hasNext()) {
				String s2 = input.next();
				words++;
			}
		}

		
		System.out.println("File " + sourceFile.getName() + " has");
		System.out.println(characters + " characters");
		System.out.println(words + " words");
		System.out.println(lines + " lines");
	}
}