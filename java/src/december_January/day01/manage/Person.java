package december_January.day01.manage;

public class Person {
	private String name,ssNumber, tel;

	public Person() {}

	public Person(String name, String ssNumber, String tel) {
		this.name = name;
		this.ssNumber = ssNumber;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsNumber() {
		return ssNumber;
	}
	public void setSsNumber(String ssNumber) {
		this.ssNumber = ssNumber;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getInfo() {
		return "name : " + name + ", SSNumber : " + ssNumber + ", tel : " + tel;
	}
}
