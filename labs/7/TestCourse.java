
public class TestCourse {

	public static void main(String[] args) {
		Course course = new Course("Data Structures");
		
		course.addStudent("Peter Jones");
		course.addStudent("Kim Smith");
		course.addStudent("Anne Kennedy");
		course.dropStudent("Peter Jones");
		
		String[] students = course.getStudents();
		
		for(int i = 0; i < course.getNumberOfStudents(); i++) {
			System.out.print(students[i] + " ");
		}
	}

}
