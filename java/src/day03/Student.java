package day03;

public class Student {
	private String studentName;
	private int studentCode;
	
	public Student(String studentName, int studentCode) {
		this.studentName = studentName;
		this.studentCode = studentCode;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public int getStudentCode() {
		return studentCode;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}
	
	
	public void printInfo() {
		System.out.println("이름 : " + studentName + ", 학번 : " + studentCode);
	}
}