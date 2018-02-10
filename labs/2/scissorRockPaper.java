import java.util.Scanner;

public class scissorRockPaper {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("scissor (0) rock (1) paper (2)");
		int user = input.nextInt();
		
		
		int computer = (int)(Math.random()*3);
		
		if (user == 0 && computer == 0 ) {
			System.out.println(" The computer is scissor. You are scissor. It is a draw. ");
		} else if (user == 0 && computer == 1 ) {
			System.out.println(" The computer is rock. You are scissor. You lose. ");
		} else if (user == 0 && computer == 2 ) {
			System.out.println(" The computer is paper. You are scissor. You win. ");
		} else if (user == 1 && computer == 0 ) {
			System.out.println(" The computer is scissor. You are rock. You win. ");
		} else if (user == 1 && computer == 1 ) {
			System.out.println(" The computer is rock. You are rock. It is a draw. ");
		} else if (user == 1 && computer == 2 ) {
			System.out.println(" The computer is paper. You are rock. You lose. ");
		} else if (user == 2 && computer == 0 ) {
			System.out.println(" The computer is scissor. You are paper. You lose. ");
		} else if (user == 2 && computer == 1 ) {
			System.out.println(" The computer is rock. You are paper. You win. ");
		} else {
			System.out.println(" The computer is paper. You are paper. It is a draw ");
		}
		
	}
}
