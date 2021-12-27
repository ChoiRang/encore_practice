package december.day15.test;

public class Others {
	
	
	/**check String all units are nummeric*/
	public boolean isNumber(String strValue){
		for(int i =0; i < strValue.length(); i++) {
			if(!Character.isDigit(strValue.charAt(i))) {
				return false;	//문자가 하나라도 들어잇으면 false
			}
		}
		return true;	//숫자면 true
	}
}
