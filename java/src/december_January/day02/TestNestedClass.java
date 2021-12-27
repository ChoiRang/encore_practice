package december_January.day02;

public class TestNestedClass {
	int i = 6;		//=> TestNestedClass를 객체 생성해야 잡힘 // static 은 메인 실행전 static 영엑에 먼저 실행됨
	static int j= 7;
	public static void main(String[] args) {
		// i =7; 
		MyStudent std1 = new MyStudent();
		MyEmp emp1 = new MyEmp();
		
	}
	
	static class MyEmp{
		String name, dept;
	}


}
