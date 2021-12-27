package day05.school;

public class SchoolTest {
	public static void main(String[] args) {
		//학생정보 관리기능 구현하기
		//이름, 번호
		Person p1 = new Person("홍길동", 1113);					//이름, 번호
		MyStudent m1 = new MyStudent("홍길동", 1113, "컴공");		//학생 + 학과
		m1.printInfo();
		
		MyEmp me1 = new MyEmp("박대리", 9011, "총무부");
		me1.printInfo();
	}
}

