package day03;

public class Vehicle {
	String vehicleType;
	String vehicleName;
	double exhaust;

	public Vehicle(String vehicleType, String vehicleName) {
		this(vehicleType, vehicleName, 0 );		//같은 클래스 내의 생성자 함수
	}
	public Vehicle(String vehicleType, String vehicleName, double exhaust) {
		this.vehicleType = vehicleType;
		this.vehicleName = vehicleName;
		this.exhaust = exhaust;
//		System.out.println("this = " + this);
	}
	public void printInfo() {
		System.out.println("Type : " + vehicleType + ", Name : " + vehicleName + ", exhaust : "+ exhaust);
	}
		
}
