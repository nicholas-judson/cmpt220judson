
public class ComparableCloneableOctagonTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Octagon Octagon1 = new Octagon(5);
		Octagon OctagonClone = (Octagon)Octagon1.clone();
	
		System.out.println("Are the original and the clone the same? " + (Octagon1.compareTo(OctagonClone) == 0));
	}

}
