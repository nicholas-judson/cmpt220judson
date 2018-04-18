
public class TestIllegalTriangleException {

	public static void main(String[] args) {
		try {
			new Triangle(1, 2, 4);
			System.out.println(" Here ");
		}catch(IllegalTriangleException ex){
			System.out.print(ex);
		}

		System.out.println(" Continue ");
		
	}

}
