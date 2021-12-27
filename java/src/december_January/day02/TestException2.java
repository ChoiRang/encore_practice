package december_January.day02;

public class TestException2 {
	public static void main(String[] args) {
		
		try {
			abc();
			System.out.println("클래스 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 로딩 실패");
			System.out.println(e);
		}
	
	}
	

	private static void abc() throws ClassNotFoundException{
			Class.forName("december_January.day02.Member2");
		
	}
	
}
