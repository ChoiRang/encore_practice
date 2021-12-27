package december_January.day01.manage;

public class Emplo extends Person{
	private String dept;

	public Emplo() {}

	public Emplo(String name, String ssNumber, String tel, String dept) {
		super(name, ssNumber, tel);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String getInfo() {
		return super.getInfo() + ", dept : " + dept ;
	}
}
