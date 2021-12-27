package day05.school;

public class MyEmp extends Person{
	private String dept;

	public MyEmp(String name, int no, String dept) {
		this.setName(name);
		this.setNo(no);
		this.dept = dept;
	} 
	@Override
	public void printInfo() {
		System.out.println("name : " + super.getName() + ", no :" + super.getNo() + ", dept : " + dept);
	}
	
	
}
