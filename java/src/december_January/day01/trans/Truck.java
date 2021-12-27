package december_January.day01.trans;

public class Truck extends Trans{
	private int maxCapacity;

	public Truck() {}
	public Truck(String license, String type, int exhaust, int maxCapacity) {
		super(license, type, exhaust);
		this.maxCapacity = maxCapacity;
	}
	
	public int getMaxCapacity() {
		return maxCapacity;
	}
	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	@Override
	public String getInfo() {
		return super.getInfo() + ", 최대 적재 중량: " + maxCapacity;
	}
}
