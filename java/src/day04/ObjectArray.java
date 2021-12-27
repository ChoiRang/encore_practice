package day04;

public class ObjectArray {
	public static void main(String[] args) {
		Movie[] movies = new Movie[100];	//movies 객체는 없고 movies 배열객체 1개를 만듬, 배열은 여러개의 변수 묶음	
		int count = 0;
		movies[count++] = new Movie("지옥", "연상호", 300);			//movie 객체를 만들고 그 주소값이 movies[0] 에 저장된다.
		System.out.println("count = " + count);
		movies[count++] = new Movie("오징어 게임", "황동혁", 200);
		System.out.println("count = " + count);
		movies[count++] = new Movie("유체이탈자", "윤제근", 100);
		System.out.println("count = " + count);

//		전체출력
//		for(int i = 0; i < count; i++) {
//			movies[i].printInfo();
//		}
		
		// 검색 : 영화제목 : 오징어게임
		
		for(int i =0; i <count; i++) {
			if(movies[i].getTitle() == "오징어 게임") {
				System.out.println("오징어 게임 번호는 " + i);
			}
		}
		
		//수정 : 유체이탈자의 제작비를 150으로 수정하기 
		String movieTitle = "유체이탈자";
		int findIndex = -1;			//검색 후에도 -1이 그대로 이면 검색 실패
		for(int i =0; i <count; i++) {
			if(movies[i].getTitle() == movieTitle) {
				findIndex = i;
				break;
			}
		} if(findIndex == -1) {
			System.out.println(movieTitle + "검색실패!");
		}  else {
			System.out.println(movieTitle+" 찾았음! 번호는 : " + findIndex);
			movies[findIndex].setProductCost(150);
		}

		//삭제
		System.out.println("==========삭제==========");
		movieTitle = "오징어 게임";			//재사용
		findIndex = -1;
		for(int i =0; i <count; i++) {
			if(movies[i].getTitle() == movieTitle) {
				findIndex = i;
				break;
			}
		} if(findIndex == -1) {
			System.out.println(movieTitle + "검색실패!");
		}  else {
			System.out.println(movieTitle+" 찾았음! 번호는 : " + findIndex);
			//해당 번호 삭제하기, 순서유지 없이 빠르게
			movies[findIndex] = movies[count-1];	//마지막 데이터 덮어씌우기
			movies[count-1] = null;					//마지막 데이터 지우기
			count--;								//갯수1 차감
		}
		//전체출력
		for(int i = 0; i < count; i++) {
			movies[i].printInfo();
		}
	
	
	}//End main
}//End Class
