
public class testColorable {

	public static void main(String[] args) {
		GeometricObject[] GeometricObjectArray = new GeometricObject[5];
		GeometricObjectArray[0] = new Triangle();
		GeometricObjectArray[1] = new Square();
		GeometricObjectArray[2] = new Triangle(2, 2, 2);
		GeometricObjectArray[3] = new Square(4);
		GeometricObjectArray[4] = new Triangle(3, 4, 5);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Area of shape number " + (i) + ": " + GeometricObjectArray[i].getArea());
			if(GeometricObjectArray[i] instanceof Colorable) {
				System.out.println("How to color shape number " + (i) + ": " + ((Colorable)GeometricObjectArray[i]).howToColor());
			}
		}
	}

}
