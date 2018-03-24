import java.util.Scanner;

public class pointsNearestToEachother {
	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		//System.out.print("Enter the number of points: ");
		//int numberOfPoints = input.nextInt();
		
	
		double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, 
				{2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2}, 
				{5.5, 4, -0.5}};
		
		
		
		
		
		int p1 = 0, p2 = 1, p3 = 2;
		double shortestDistance = distance(points[p1][0], points[p1][1], 
				 points[p2][0], points[p2][1],
				points[p3][0], points[p3][1]);
		
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				for (int k = i + 2; k < points.length; k++) {
					double distance = distance(points[i][0], points[i][1],
							 points[j][0], points[j][1], 
							points[k][0], points[k][1]);
					
					if (shortestDistance > distance) {
						p1 = i;
						p2 = j;
						p3 = k;
						shortestDistance = distance;
					}
				//}
			}
		}
		System.out.println("The closest three points are " + 
		"(" + points[p1][0] + ", " + points[p1][1] + ", " + points[p1][2] + ") , (" +
			points[p2][0] + ", " + points[p2][1] + ", " + points[p2][2] + ") and (" +
			points[p3][0] + ", " + points[p3][1] + ", " + points[p3][2] + ") ");
		
		}
	}
	
	public static double distance(
			double x1, double y1, double z1, double x2, double y2, double z2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1));
	}

}
