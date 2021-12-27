package december_January.day01.trans;

public class Car extends Trans{
	private int maxPassenger;

	public Car() {}
	public Car(String license, String type, int exhaust, int maxPassenger) {
		super(license, type, exhaust);
		this.maxPassenger = maxPassenger;
	}
	
	public int getMaxPassenger() {
		return maxPassenger;
	}
	public void setMaxPassenger(int maxPassenger) {
		this.maxPassenger = maxPassenger;
	}
	@Override
	public String getInfo() {
		return super.getInfo() + ", 최대 승차 인원 : " + maxPassenger;
	}
}
