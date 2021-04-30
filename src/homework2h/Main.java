package homework2h;

public class Main {

	public static void main(String[] args) {
		Category category1 = new Category(1,"Tümü");
		Category category2 = new Category(2,"Programlama");
		Instructor instructor2 = new Instructor(1,"Tümü");
		Instructor instructor1 = new Instructor(2,"Engin Demiroð");
		
		Category[] category = {category1,category2};
		Instructor[] instructor = {instructor1,instructor2};
		
		for(Category categories : category) {
			System.out.println(categories.id +" "+categories.name);
		}
		
		for(Instructor instructors : instructor) {
			System.out.println(instructors.id +" "+instructors.name);
		}

		Course course1 = new Course(1,"Programlamaya Giriþ Ýçin Temel Kurs","Engin Demiroð",100);
		Course course2 = new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)","Engin Demiroð",100);
		Course course3 = new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)","Engin Demiroð",100);
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.removeToCourse(course2);
	}

}
