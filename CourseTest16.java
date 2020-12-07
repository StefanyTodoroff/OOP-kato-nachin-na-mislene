package oopThinking;

public class CourseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
				Course course1 = new Course("Mathematics");
				Course course2 = new Course("Russian");
				course1.addStudent("Iva Simeonova");
				course1.addStudent("Stefany Todorova");
				course1.addStudent("Martin Ivanov");
				course1.addStudent("Kaloyan Natzev");
				course2.addStudent("Yana Kostova");
				course2.addStudent("Mira Zikolova");
				course2.addStudent("Aleks Petrov");
				
				
				System.out.println("Number of students for course1: "  + course1.getNumberOfStudents());
				String[] students = course1.getStudents();
				for(int i = 0; i < course1.getNumberOfStudents(); i++) {
					System.out.println( students[i] + " , ");
				}
				course1.dropStudent("Kaloyan Natzev");
				System.out.println("\nNumber of students in course1 " + course1.getNumberOfStudents());
				for(int i = 0; i < course1.getNumberOfStudents(); i++) {
					System.out.println( students[i] + ", ");
				}
				System.out.println();
				System.out.println("Number of students in course2 " + course2.getNumberOfStudents());
					
				}
				
			}
