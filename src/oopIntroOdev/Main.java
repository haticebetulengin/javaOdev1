package oopIntroOdev;

public class Main {
	
	public static void main(String[]args) {
	
		Instructor instructor1 = new Instructor (1, "Engin", "Demirog");
		
		Instructor instructor2 = new Instructor();
		instructor2.id = 2;
		instructor2.instructorName = "Kerem";
		instructor2.instructorSurname = "Varis";
		
		Instructor [] instructors = {instructor1, instructor2};
	
		Course course1 = new Course (1, "Yazilim Gelistirme Kursu", "Java+React ", "Ucretsiz ");
		
		Course course2 = new Course ();
		course2.id = 2;
		course2.courseName = "Yazilim Gelistirme Kursu";
		course2.courseDetails = "C#+ANGULAR";
		course2.priceDetails = "Ucretsiz";
		
		Course course3 = new Course (3, "Programlamaya Giris", "Temel Kurs", "Ucretsiz");
	
		Course [] courses = {course1,course2,course3};
	
		for (Course course : courses) {
			System.out.println(course.courseName + " " + course.courseDetails);
		}
		
		System.out.println("Toplam Kurs Sayisi: " + courses.length);
	
		for (Instructor instructor : instructors) {
			System.out.println(instructor.instructorName + " " + instructor.instructorSurname);
		}
		
		System.out.println("Toplam Egitmen Sayisi: " + instructors.length);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.chooseAnInstructor(instructor1);
		
		CourseManager courseManager = new CourseManager();
		courseManager.joinTheCourse(course1);
		
		courseManager.removeCourse(course3);
	
	}
}