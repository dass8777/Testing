package pkg1;

public class Student {
	int age;
	int rollno;

	public void display1() {
		System.out.println("Welcome all of you");
	}

	public void display2() {
		System.out.println("Automation is easy");
	}

	public static void main(String[] args) {
		Student obj = new Student();
		obj.age = 25;
		obj.rollno = 8777;
		System.out.println("Your age is-" +obj.age);
		System.out.println("Your rollno is-" +obj.rollno);
		obj.display1();
		obj.display2();
	}
}
