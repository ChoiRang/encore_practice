package december_January.day06;

import java.io.Serializable;

public class Student implements Serializable{

	private String name, tel, subject;
	private int grade;

	public Student() {}
	public Student(String name, String tel, String subject, int grade) {
		this.name = name;
		this.tel = tel;
		this.subject = subject;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name +", 전화 : " + tel + ", 과목 : " + subject + ", 학년 : " + grade;
	}
}
