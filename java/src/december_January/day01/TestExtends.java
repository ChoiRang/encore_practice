package december_January.day01;

public class TestExtends {
	public static void main(String[] args) {
		B b1 = new B();
		b1.name = "홍길동";
		b1.age = 30;
		
		C c1 = new C();
		c1.name = "김길동";
		c1.tel = "111-222";
	
		A a1 = b1;		//부모타입 변수에 자식타입 객체 저장
		System.out.println("a1.get"+a1.getInfo());
		System.out.println("b1.get"+b1.getInfo());
		//호출하는 메서드를 식제 객체가 재정의 하고 있으면 재정의된 메서드가 호출됨
		
		A a2 = c1;
		System.out.println("a2.get" + a2.getInfo());
		
		a1.name = "박길동";
		System.out.println(a1 instanceof B);	//true
		System.out.println(a1 instanceof C);	//false
		if(a1 instanceof B) {
			System.out.println("a1은 B 타입!" + a1);
			B b2 = (B)a1;	//Down Casting
			b2.age = 30;
		}
		
		if(a1 instanceof C) {								
			System.out.println("a1은 C 타입!" + a1);
			C c2 = (C)a1;	//Down Casting
			c2.tel = "111-223";
		}
		A[] arr = new A[3];
		arr[0] = b1;
		arr[1] = c1;
		arr[2] = new B();
		for(int i = 0; i < arr.length; i++) {
			System.out.println("i = " + i + ", " + arr[i].getInfo());		//부모 타입 배열에 자식 객체를 담음 =>결과 : 자식의 재정의된 메서드 호출됨
		}
		
	}
}//end class

class A{
	String name;
	
	public String getInfo() {
		return "name : " + name;
	}
}


class B extends A{
	int age;

	@Override
	public String getInfo() {
		return super.getInfo() + ", age : " + age ;
	}

	
}
class C extends A{
	String tel;
}