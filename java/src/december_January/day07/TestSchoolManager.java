package december_January.day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class TestSchoolManager {
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<BookInfo> books = new ArrayList<BookInfo>();
	private static double bookVo = 0.1;
	
	public static void main(String[] args) {
		bookInfoCall();
		bookInfoSave();
		
		while(true) {
			mainMenu();
			int menuNo = sc.nextInt();
			sc.nextLine();
			if(menuNo == -999) {
				break;
			}
			numberCheck(menuNo);
		}
	}
	
	private static void numberCheck(int menuNumber) {
		if(menuNumber == 1) {
			bookregist();
			bookInfoSave();
		} else if(menuNumber == 2) {
			bookFind();
		} else if(menuNumber == 3) {
			bookRevise();
			bookInfoSave();
		} else if(menuNumber == 4) {
			bookDelete();
			bookInfoSave();
		} else if(menuNumber == 5) {
			bookPrintAll();
		} else {
			System.out.println("1~4 번호 입력");;
		}
	}

	private static void bookregist() {
		System.out.println("책 제목 입력 >>");
		String bookName = sc.nextLine();
		System.out.println("작가 입력 >>");
		String author = sc.nextLine();
		System.out.println("출판사 입력 >>");
		String corp = sc.nextLine();
		System.out.println("국제 표준 도서 번호 입력 >>");
		String isbn = sc.nextLine();
		System.out.println("책 가격 입력 >>");
		int price = sc.nextInt();
		sc.nextLine();
		
		BookInfo bk = new BookInfo(bookName, author, corp, isbn, price);
		books.add(bk);
	}

	private static void bookFind() {
		System.out.println("검색할 도서명 입력>>");
		String findName = sc.nextLine();
		for(BookInfo book : books) {
			if(book.getBookName().equals(findName)) {
				System.out.println("검색 성공");
				System.out.println("도서명 : " + book.getBookName());
				System.out.println("작가명 : " + book.getAuthor());
				System.out.println("출판사명 : " + book.getCorp());
				System.out.println("국제 표준 도서 번호 : " + book.getIsbn());
				System.out.println("가격 : " + book.getPrice());
				return;
			}
		}
		System.out.println("존재하지 않습니다.");
	}

	private static void bookRevise() {
		System.out.println("수정 할 학생의 번호 입력>>");
		int index = Integer.parseInt(sc.nextLine());
		if(index >= books.size()) {
			System.out.println("존재 하지 않는 번호입니다.");
			return;
		}
		System.out.println("수정할것 입력 1)이름 2)전화 3)과목 4)학년");
		int number = Integer.parseInt(sc.nextLine());
		System.out.println("수정할 값을 입력하세요.");
		if(number == 1 ) {
			System.out.println("도서명 수정중, 현재 : " + books.get(index).getBookName() + ", 수정할 값 입력");
			books.get(index).setBookName(sc.nextLine());
		} else if(number == 2) {
			System.out.println("저자 수정중, 현재 : " + books.get(index).getAuthor() + ", 수정할 값 입력");
			books.get(index).setAuthor(sc.nextLine());
		} else if(number == 3) {
			System.out.println("출판사, 현재 : " + books.get(index).getCorp() + ", 수정할 값 입력");
			books.get(index).setCorp(sc.nextLine());
		} else if(number == 4) {
			System.out.println("국제 표준 도서 번호 수정중, 현재 : " + books.get(index).getIsbn() + ", 수정할 값 입력");
			books.get(index).setIsbn(sc.nextLine());
		} else if(number == 5) {
			System.out.println("가격 수정중, 현재 학년 : " + books.get(index).getPrice() + ", 수정할 값 입력");
			books.get(index).setPrice(Integer.parseInt(sc.nextLine()));
		} else {
			System.out.println("1~4 사이의 숫자를 입력해주세요.");
			return;
		}
	}

	private static void bookDelete() {
		System.out.println("삭제할 번호 입력");
		int index = sc.nextInt();
		sc.nextLine();
		if(index >= books.size() || index < 0) {
			System.out.println("없는 번호입니다.");
		} else {
			books.remove(index);
		}
		
	}

	private static void bookPrintAll() {
		for(int i =0; i < books.size(); i++) {
			System.out.println(books.get(i).toString());
		}
	}

	private static void mainMenu() {
		System.out.println("(1)등록 (2)검색 (3)수정 (4)삭제 (5)전체출력 (-999)종료");
		System.out.println(" 현재 저장되어 있는 책의 갯수 : " + books.size() +", 버전" + bookVo);
		System.out.println("메뉴번호 입력 >>");
	}
	private static void bookInfoSave() {
		try {
			FileOutputStream fos = new FileOutputStream("bookinfo.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(books);
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("저장 실패");
		}
	}
	
	private static void bookInfoCall() {
		try {
		FileInputStream fis = new FileInputStream("bookinfo.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		books = (ArrayList<BookInfo>) ois.readObject();
		ois.close();
		} catch(FileNotFoundException e) 	{
			System.out.println("파일이 없습니다.");
		} catch (ClassNotFoundException e){
			System.out.println("해당 클래스 없음");
		}	catch(IOException e) {
			System.out.println("불러오기 실패");
		}
	}
}

//	private static void bookFind() {
//		System.out.println("검색할 도서명 입력>>");
//		String findName = sc.nextLine();
//		int findIndex = -1;
//		for(int i = 0; i < books.size(); i++) {
//			if(books.get(i).getBookName().equals(findName)) {
//				BookInfo bk = books.get(i);
//				findIndex = i;
//			}
//		}
//		if(findIndex == -1) {
//			System.out.println("찾으시는 도서가 없습니다.");
//			return;
//		} else {
//			System.out.println(books.get(findIndex).toString());
//		}
//	}