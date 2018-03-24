import java.util.Scanner;

public class sumElementsByColumn {

	public static void main(String[] args) {
			    Scanner input = new Scanner(System.in);
			    
			    System.out.print("Enter a 3-by-4 matrix row by row: ");
			    double[][] m = new double[3][4];
			    
			    for (int i = 0; i < 3; i++)
			      for (int j = 0; j < 4; j++)
			        m[i][j] = input.nextDouble();

			    for (int i = 0; i < m[0].length; i++) {
		            System.out.println("Sum of the elements at column" + i +" is " + sumColumn(m, i));
		        }
			  }
			  
			  public static double sumColumn(double[][] m, int columnIndex) {
			    double sum = 0;

			    for (int i = 0; i < m.length; i++)
			        sum += m[i][columnIndex];

			    return sum;
			  }  
	}


