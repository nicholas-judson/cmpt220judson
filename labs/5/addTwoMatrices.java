import java.util.Scanner;

public class addTwoMatrices {

	public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    final int N = 3;
		    
		    // Enter matrix1
		    System.out.print("Enter matrix1: ");
		    double[][] matrix1 = new double[N][N];
		    for (int i = 0; i < matrix1.length; i++)
		      for (int j = 0; j < matrix1[i].length; j++) {
		        matrix1[i][j] = input.nextDouble();
		      }
		    
		    // Enter matrix2
		    System.out.print("Enter matrix2: ");
		    double[][] matrix2 = new double[N][N];
		    for (int i = 0; i < matrix1.length; i++)
		      for (int j = 0; j < matrix1[i].length; j++) {
		        matrix2[i][j] = input.nextDouble();
		      }

		    double[][] resultMatrix = addMatrix(matrix1, matrix2);
		    System.out.println("\nThe matrices are added as follows ");
		    printResult(matrix1, matrix2, resultMatrix, '+');
		  }

		  public static double[][] addMatrix(
		      double[][] a, double[][] b) {
		    double[][] result = new double[a.length][a[0].length];
		    for (int i = 0; i < a.length; i++)
		      for (int j = 0; j < a[i].length; j++)
		           result[i][j] = a[i][j] + b[i][j];

		    return result;
		  }

		  /** Print result */
		  public static void printResult(
		      double[][] a, double[][] b, double[][] c, char op) {
		    for (int i = 0; i < a.length; i++) {
		      for (int j = 0; j < a[0].length; j++)
		        System.out.print(" " + a[i][j]);

		      if (i == a.length / 2)
		        System.out.print( "  " + op + "  " );
		      else
		        System.out.print( "     " );

		      for (int j = 0; j < b[0].length; j++)
		        System.out.print(" " + b[i][j]);

		      if (i == a.length / 2)
		        System.out.print( "  =  " );
		      else
		        System.out.print( "     " );

		      for (int j = 0; j < c[0].length; j++)
		        System.out.print(" " + c[i][j]);

		      System.out.println();
		    }
		  }
		

	}


