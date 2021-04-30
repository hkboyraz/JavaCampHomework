package homework2h;

public class Main {

	public static void main(String[] args) {
		Category category1 = new Category(1,"T�m�");
		Category category2 = new Category(2,"Programlama");
		Instructor instructor2 = new Instructor(1,"T�m�");
		Instructor instructor1 = new Instructor(2,"Engin Demiro�");
		
		Category[] category = {category1,category2};
		Instructor[] instructor = {instructor1,instructor2};
		
		for(Category categories : category) {
			System.out.println(categories.id +" "+categories.name);
		}
		
		for(Instructor instructors : instructor) {
			System.out.println(instructors.id +" "+instructors.name);
		}

		Course course1 = new Course(1,"Programlamaya Giri� ��in Temel Kurs","Engin Demiro�",100);
		Course course2 = new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)","Engin Demiro�",100);
		Course course3 = new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)","Engin Demiro�",100);
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.removeToCourse(course2);
	}

}
