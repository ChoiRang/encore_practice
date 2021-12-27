package december_January.day02;

public class JavaTest {
	public static void main(String[] args) {
		Member m1 = new Member("홍길동",30);
//		m1.setData("홍길동",30);
		A a1 = new A();
		A a2 = new A();
		a1.i = 5;
		System.out.println(a1.i);
		System.out.println(a2.i);
		System.out.println(A.title);
		A.prn1();
	
	}
}

class A{
	int i;
	static final String title = "똔또냥!";

	static void prn1() {
		//System.out.println(i);
		//Cannot make a static reference to the non-static field i 
		// =>  스태틱 메서드 내부에서는 static 변수와 메서드만 사용이 가능하다. 같은 클래스의 instance 변수 접근 불가
		System.out.println(title);	//static은 메인 메서드가 실행되기 전에 메모리에 먼저 생성된다.
	}

}