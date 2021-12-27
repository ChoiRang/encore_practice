package december_January.day02;

public class Member { //회원 정보

	private String name;
	private int age;
	
	public Member(){}
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void setData(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void setData(int age, String name) {
		this.name = name;
		this.age = age;
	}
}
