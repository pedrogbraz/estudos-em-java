package highSchool;

public class School {
	public static void main(String[] args) {
		Students student1 = new Students();
		student1.firstName = "Pedro";
		student1.lastName = "Gontijo Braz";
		student1.age = 17;
		student1.address = "Rua 1, 123, Centro, Nova Iorque";
		student1.email = "pedrobrazdevs@gmail.com";
		student1.phone = "(55) 11 91449-4438";

		System.out.println(student1.firstName);
	}
}
