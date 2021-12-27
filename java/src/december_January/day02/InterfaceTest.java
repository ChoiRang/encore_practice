package december_January.day02;

public class InterfaceTest {
	public static void main(String[] args) {
		FlyStudent st1 = new FlyStudent("홍길동", "컴공");
		st1.fly();
		System.out.println(st1.getInfo());
		
		Flyable f1 = st1;
		f1.fly();
		
	}
}

class MyStudent{
	String name, sub;
	
	public String getInfo() {
		return name + "," + sub;
	}
}

class FlyStudent extends MyStudent implements Flyable{

	public FlyStudent(String name, String sub) {
		this.name = name;
		this.sub = sub;
	}

	@Override
	public void fly() {
		System.out.println("투투투투퉅툿");
	}
	
}


interface Flyable{
	public abstract void fly();	//날아갈때의 동작 출력
}