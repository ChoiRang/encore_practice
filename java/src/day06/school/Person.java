package day06.school;

public class Person {
	private String name;
	private String phoneNumber;
	
	public Person() {}
	public Person(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void printInfo() {
		System.out.println("이름 : " + name + "핸드폰 번호 : " + phoneNumber);
	}
	
}//end class
