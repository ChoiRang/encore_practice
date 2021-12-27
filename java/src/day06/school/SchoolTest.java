package day06.school;

public class SchoolTest {
	public static void main(String[] args) {
		Student st1 = new Student("홍길동", "111-222", "컴공");
		System.out.println(st1);

		Emp e1 = new Emp("김대리", "111-223", "총무부");
		System.out.println(e1);
		
		Person p1 = st1;
		
		System.out.println(st1.getSubject());
//		System.out.println(p1.getSubject());  //nononononono
		
	}//end main
}//end class
//학생정보 : 이름, 주민번호, 전화번호, 학과	=>Student
//직원정보 : 이름, 주민번호, 전화번호, 담당부서	=>Employee(Emp)
//공통변수 : Person : 이름, 전화 => 학생 : 학과, 직원 : 담당부서