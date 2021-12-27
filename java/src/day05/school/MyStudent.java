package day05.school;

public class MyStudent extends Person {
	private String subjcet;
	
	//name % no는 Person 꺼임
	public MyStudent(String name, int no, String subjcet) {
		super.setName(name);
		super.setNo(no);
		this.subjcet = subjcet;
	}

	@Override
	public void printInfo() {
		System.out.println("name : " + super.getName() + ", no :" + super.getNo() + ", subjcet : " + subjcet);
	}
	
}
