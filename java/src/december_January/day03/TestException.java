package december_January.day03;

public class TestException {
	public static void main(String[] args) {
		classLoading();
		classExecute();
		System.out.println("프로그램 종료");
	}

	private static void classExecute() {
		
	}

	private static void classLoading() {
		System.out.println("클래스 로딩전");
		try {
			Class.forName("java.lang.String");
			System.out.println("클래스 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 로딩 실패");
		}
		
	}
}
