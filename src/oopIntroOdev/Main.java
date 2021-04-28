package oopIntroOdev;

public class Main {
	
	public static void main(String[]args) {
	
		Instructor instructor1 = new Instructor (1, "Engin", "Demiroð");
		
		Instructor instructor2 = new Instructor();
		instructor2.id = 2;
		instructor2.instructorName = "Kerem";
		instructor2.instructorSurname = "Varýþ";
		
		Instructor [] instructors = {instructor1, instructor2};
	
		Course course1 = new Course (1, "Yazýlým Geliþtirme Kursu", "Java+React ", "Ücretsiz ");
		
		Course course2 = new Course ();
		course2.id = 2;
		course2.courseName = "Yazýlým Geliþtirme Kursu";
		course2.courseDetails = "C#+ANGULAR";
		course2.priceDetails = "Ücretsiz";
		
		Course course3 = new Course (3, "Programlamaya Giriþ", "Temel Kurs", "Ücretsiz");
	
		Course [] courses = {course1,course2,course3};
	
		for (Course course : courses) {
			System.out.println(course.courseName + " " + course.courseDetails);
		}
		
		System.out.println("Toplam Kurs Sayýsý: " + courses.length);
	
		for (Instructor instructor : instructors) {
			System.out.println(instructor.instructorName + " " + instructor.instructorSurname);
		}
		
		System.out.println("Toplam Eðitmen Sayýsý: " + instructors.length);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.chooseAnInstructor(instructor1);
		
		CourseManager courseManager = new CourseManager();
		courseManager.joinTheCourse(course1);
		
		courseManager.removeCourse(course3);
	
	}
}