package day06.school;

public class Emp extends Person{
	private String dept;

	public Emp() {}
	public Emp(String name, String phoneNumber, String dept) {
		super(name, phoneNumber);
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public void printInfo() {
		System.out.println("이름 : " + getName() + ", 핸드폰 번호 : " + getPhoneNumber() + ", 부서 : " + dept);
	}
}
				