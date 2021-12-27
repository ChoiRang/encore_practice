package december_January.day01.manage;

public class PersonTest {
	public static void main(String[] args) {
		int count = 0;
		Person[] parr = new Person[100];
		
		parr[count++] = new Emplo("홍길동", "111-222", "010-111", "총무부"); 
		parr[count++] = new Emplo("김길동", "111-333", "010-222", "관리부"); 
		parr[count++] = new Teacher("박길동", "111-444", "010-223", "자바"); 
		parr[count++] = new Teacher("이길동", "111-555", "010-332", "파이썬"); 
		parr[count++] = new Student("최길동", "111-666", "010-443", "자바 기기본"); 
		parr[count++] = new Student("강길동", "111-777", "010-553", "파이썬 중급"); 
	
		System.out.println("총인원 출력하기");
		for(int i = 0; i < count; i++) {
			System.out.println(parr[i].getInfo());
		}
	}
}
