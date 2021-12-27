package december_January.day08;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
	Scanner sc= new Scanner(System.in);
	BookData bd = new BookData();
	
	int menuNo;
	int index = -1;
	
	public void bookMainMenu(ArrayList<BookInfo> bookArr) {
		System.out.println("*** 도서 정보 관리 ***");
		System.out.println("(1)도서 등록 (2)도서정보 출력 (3)도서검색 (4)도서삭제");
		System.out.println("메뉴 번호 입력 >>");
		menuNo = sc.nextInt();
		if(menuNo == 1) {
			addBook(bookArr);
			bd.bookInfoSave(bookArr);
		} else if(menuNo == 2) {
			showBook(bookArr);
		}	else if(menuNo == 3) {
			searchBook(bookArr);
		}	else if(menuNo == 4) {
			deleteBook(bookArr);
		} else {
			System.out.println("1~4 번호를 입력하세요.");
			return;
		}
	}


	private void addBook(ArrayList<BookInfo> bookArr) {
		sc.nextLine();
		System.out.println("*** 도서 정보 등록하기 ***");
		System.out.println("도서 ISBN>>");
		String isbn = sc.nextLine();
		System.out.println("도서명>>");
		String name = sc.nextLine();
		System.out.println("출판사>>");
		String publisher = sc.nextLine();
		System.out.println("작가>>");
		String author = sc.nextLine();
		System.out.println("가격>>");
		int price = sc.nextInt();
		
		BookInfo bd = new BookInfo(isbn, name, publisher, author, price);
		bookArr.add(bd);
	}
	
	private void showBook(ArrayList<BookInfo> bookArr) {
		if(bookArr.size() == 0) {
			System.out.println("저장된 정보가 없습니다.");
		}
		for(int i =0; i <bookArr.size(); i++) {
			System.out.println(bookArr.get(i).toString());
		}
	}
	
	private void searchBook(ArrayList<BookInfo> bookArr) {
		sc.nextLine();
		System.out.println("검색할 도서 기준 (1)ISBN (2)도서명>>");
		int mark = sc.nextInt();
		sc.nextLine();
		System.out.println("검색할 도서 입력>>");
		String find = sc.nextLine();
		finder(bookArr, find, mark);
		search(bookArr, index);
	}

	private void deleteBook(ArrayList<BookInfo> bookArr) {
		sc.nextLine();
		System.out.println("삭제할 도서 기준 (1)ISBN (2)도서명>>");
		int mark = sc.nextInt();
		sc.nextLine();
		System.out.println("삭제할 도서 입력>>");
		String find = sc.nextLine();
		finder(bookArr, find, mark);
		delete(bookArr, index);
	}
	
	private void finder(ArrayList<BookInfo> bookArr, String finder, int mark) {
		if(mark == 1) {
			for(int i =0 ; i<bookArr.size(); i++) {
				if(bookArr.get(i).getIsbn().equals(finder)) {
					index = i;
					return;
				}
				System.out.println("없는 도서입니다.");
				return;
			}
		} else if(mark == 2) {
			for(int i =0 ; i<bookArr.size(); i++) {
				if(bookArr.get(i).getBookName().equals(finder)) {
					index = i;
				} else {
					System.out.println("없는 도서입니다.");
					return;
				}
			}
		} else {
			System.out.println("기준을 1 또는 2 입력하세요.");
		}
	}
	
	private void search(ArrayList<BookInfo> bookArr, int index) {
		if(index == -1) {
			return;
		}
		System.out.println("검색완료");
		System.out.println(bookArr.get(index).toString());
		index = -1;
	}
	
	private void delete(ArrayList<BookInfo> bookArr, int index) {
		if(index == -1) {
			return;
		}
		bookArr.remove(index);
		System.out.println("삭제 완료!");
		index = -1;
	}
	
}