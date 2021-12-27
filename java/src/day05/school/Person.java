package day05.school;

public class Person {
	private String name;
	private int no;
	
	public Person() {}
	//변수 누르고 Ctrl+1
	public Person(String name, int no) {
		this.name = name;
		this.no = no;
	}
	
	//getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}

	public void printInfo() {
		System.out.println("name : " + name + ", no :" + no);
	}
}
