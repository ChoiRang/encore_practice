package com.team5.prj.users;

public class UserDao {

	public boolean emptyCheck(String id) {
		int checkChar = 0;
		for(int i = 0; i < id.length(); i++) {
			checkChar = id.charAt(i);
			if(checkChar == 32) {
				return true;
			}
		}
		
		return false;
	}

}
