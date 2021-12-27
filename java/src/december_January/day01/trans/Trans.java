package december_January.day01.trans;

public class Trans {
	private String license, type;
	private int exhaust;
	
	public Trans() {}
	public Trans(String license, String type, int exhaust) {
		this.license = license;
		this.type = type;
		this.exhaust = exhaust;
	}
	
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getExhaust() {
		return exhaust;
	}
	public void setExhaust(int exhaust) {
		this.exhaust = exhaust;
	}
	public String getInfo() {
		return "번호판 : " + license + ", 차종 : " + type + ", 배기량" + exhaust;
	}
}
