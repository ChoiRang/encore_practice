package day03;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 1122);
		Student s2 = new Student("김길동", 2233);
		
		s1.printInfo();
		s2.printInfo();
		
		s1.setStudentName("똔또냐!");
		s1.setStudentCode(2232);
		s1.printInfo();
		
		System.out.println(s1.getStudentName() + s2.getStudentCode());
	}
}
