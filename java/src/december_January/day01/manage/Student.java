package december_January.day01.manage;

public class Student extends Person{
	private String subject;

	public Student() {}
	public Student(String name, String ssNumber, String tel, String subject) {
		super(name, ssNumber, tel);
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	@Override
	public String getInfo() {
		return super.getInfo() + ", subject : " + subject;
	}
}