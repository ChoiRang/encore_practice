package december_January.day03;

import java.util.Objects;

public class TestObject {
	public static void main(String[] args) {
		A a1 = new A();
		Object obj1 = a1;
		
		String s1 = "abc";
		String s2 = "abc";
		
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s1 == s3);
		System.out.println(s3.equals(s4));
		
		A a2 = new A();
		a2.i = 3;
		A a3 = new A();
		a3.i = 3;
		System.out.println(a2 == a3);		//false
		System.out.println(a2.equals(a3));	//값이 같아도 A 클래스에서 equals 재정의 하지 않으면 false 가 뜸
		//a2 는 this로 가고 a3 는 obj 로감
	}
}
	
class A extends Object{
	int i;

	@Override
	public int hashCode() {
		return Objects.hash(i);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		return i == other.i;
	}
	
	
	//Source -> Generate hashCode and equals
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof A) {
//			A a = (A)obj;
//			return this.i ==a.i;
//		}
//		return false;
//	}//end equals
}

class B {
	
}
