package december.day15.test;

public class Others {
	
	
	/**check String all units are nummeric*/
	public boolean isNumber(String strValue){
		for(int i =0; i < strValue.length(); i++) {
			if(!Character.isDigit(strValue.charAt(i))) {
				return false;	//���ڰ� �ϳ��� ��������� false
			}
		}
		return true;	//���ڸ� true
	}
}
