import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveText {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage: java RemoveText sourceFile oldStr newStr");
			System.exit(1);
		}
		
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.println("Source file " + args[1] + " does not exist");
			System.exit(2);
		}
		
		String removeString = "";
		try {
			Scanner input = new Scanner(sourceFile);
			
				while(input.hasNext()) {
					removeString += input.nextLine();
				}
		} catch (Exception ex){
				System.out.println(ex.getMessage());
		}
		
		removeString= removeString.replaceAll("John", "");
		
		try {
			PrintWriter editor = new PrintWriter(sourceFile);
			editor.write(removeString);
			editor.close();
		} catch (Exception ex){
			System.out.println(ex.getMessage());
	}
		
	}
}