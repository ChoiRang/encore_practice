package day06.school;

public class Student extends Person{
	private String subject;

	//studentName & phoneNumber 부모클래스 넘겨주기 2가지 방법 : set메서드 또는 부모생성자메서드
	public Student(String name, String phoneNumber, String subject) {
		super(name, phoneNumber);		//생성자 내부에서만 부모생성자 메서드를 부를수 있음.
//		this.name(name);
//		this.setPhoneNumber(phoneNumber);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public void printInfo() {
		System.out.println("이름 : " + getName() + ", 핸드폰 번호 : " + getPhoneNumber() + ", 학과 : " + subject);
	}
	
}
