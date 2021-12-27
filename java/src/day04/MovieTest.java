package day04;

public class MovieTest {
	public static void main(String[] args) {
		Movie movie1 = new Movie("기생충","봉준호", 13000);
		Movie movie2 = new Movie("인터스텔라","크리스토퍼 놀란", 15000);
		
		movie1.printInfo();
		System.out.println("==========");
		movie2.printInfo();
		System.out.println("==========");
		
		System.out.println("영화 : "+ movie1.getTitle() + ", 감독 : "+ movie1.getDirectorName());
		System.out.println("영화 : "+ movie2.getTitle() + ", 감독 : "+ movie2.getDirectorName());
	}
}

