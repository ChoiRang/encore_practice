package december_January.day08;

import java.io.Serializable;

public class UserInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private int rentBookNumber = 0;

	public UserInfo() {}
	public UserInfo(String userName, int rentBookNumber) {
		this.userName = userName;
		this.rentBookNumber = rentBookNumber;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getRentBookNumber() {
		return rentBookNumber;
	}
	public void setRentBookNumber(int rentBookNumber) {
		this.rentBookNumber = rentBookNumber;
	}

	@Override
	public String toString() {
		return "대여 유저명 : " + userName 
						+ ", 총 대여 권수 : " + rentBookNumber;
	}	
}
