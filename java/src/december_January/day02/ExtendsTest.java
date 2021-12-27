package december_January.day02;

public class ExtendsTest {
	public static void main(String[] args) {
		Student st1 = new Student("홍길동", 21, "컴공");
		st1.name= "홍길동";

		Person p1 = st1;
		
		Emp e1 = new Emp("홍길동", 21, "컴공");
		p1 = e1;
		
		Emp e2 = (Emp)p1;	//donw Casting
	}
}

abstract class Person{
	String name;
	int age;

	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Student extends Person{
	String subject;
	
	public Student() {}
	public Student(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}


	public String getInfo() {
		return name + "," + age + "," + subject;
	}
}

class Emp extends Person{
	String dept;
	public Emp(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
	public String getInfo() {
		return name + "," + age + ",";
	}
}
