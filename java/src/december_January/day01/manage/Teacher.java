package december_January.day01.manage;

public class Teacher extends Person{
	private String teahingSubject;

	public Teacher() {}
	public Teacher(String name, String ssNumber, String tel, String teahingSubject) {
		super(name, ssNumber, tel);
		this.teahingSubject = teahingSubject;
	}
	
	
	public String getTeahingSubject() {
		return teahingSubject;
	}
	public void setTeahingSubject(String teahingSubject) {
		this.teahingSubject = teahingSubject;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo() + ", teaching subject : " + teahingSubject;
	}
}
