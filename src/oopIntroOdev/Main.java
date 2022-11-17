package oopIntroOdev;

public class Main {
	
	public static void main(String[]args) {
	
		Instructor instructor1 = new Instructor (1, "Engin", "Demiro�");
		
		Instructor instructor2 = new Instructor();
		instructor2.id = 2;
		instructor2.instructorName = "Kerem";
		instructor2.instructorSurname = "Var��";
		
		Instructor [] instructors = {instructor1, instructor2};
	
		Course course1 = new Course (1, "Yaz�l�m Geli�tirme Kursu", "Java+React ", "�cretsiz ");
		
		Course course2 = new Course ();
		course2.id = 2;
		course2.courseName = "Yaz�l�m Geli�tirme Kursu";
		course2.courseDetails = "C#+ANGULAR";
		course2.priceDetails = "�cretsiz";
		
		Course course3 = new Course (3, "Programlamaya Giri�", "Temel Kurs", "�cretsiz");
	
		Course [] courses = {course1,course2,course3};
	
		for (Course course : courses) {
			System.out.println(course.courseName + " " + course.courseDetails);
		}
		
		System.out.println("Toplam Kurs Say�s�: " + courses.length);
	
		for (Instructor instructor : instructors) {
			System.out.println(instructor.instructorName + " " + instructor.instructorSurname);
		}
		
		System.out.println("Toplam E�itmen Say�s�: " + instructors.length);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.chooseAnInstructor(instructor1);
		
		CourseManager courseManager = new CourseManager();
		courseManager.joinTheCourse(course1);
		
		courseManager.removeCourse(course3);
	
	}
}