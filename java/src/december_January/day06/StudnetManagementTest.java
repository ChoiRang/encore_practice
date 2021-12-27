package december_January.day06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class StudnetManagementTest {
	private static ArrayList<Student> starr = new ArrayList<Student>();
	private static Scanner sc = new Scanner(System.in);
	private static double version = 0.2;
	private static int menuNo = -1;

	
	public static void main(String[] args) {
		try {
			studentInfoCall();
		} catch (IOException e) {
			System.out.println("학생정보 불러오기 실패");
		}
		while(menuNo != -999){
			printMainMenu();
			menuNo = sc.nextInt();
			sc.nextLine();	//숫자 읽고 남은 엔터키를 읽어내는 명령어
			if(menuNo ==1) {
				studentIn();
				studentInfoSave();
			} else if(menuNo == 2) {
				studentSearch();
			} else if(menuNo == 3) {
				studentModify();
				studentInfoSave();
			} else if(menuNo == 4) {
				studentDelete();
				studentInfoSave();
			}	else if(menuNo == -999) {
				System.out.println("프로그램 종료");
				break;
			}	else {
				System.out.println("1~4 또는 -999를 입력하세요.");
				return;
			}
		}
	
	}
	

	private static void printMainMenu() {
		System.out.println("학생 정보 관리 v" + version );
		System.out.println("(1)학생등록 (2)학생검색 (3)학생정보수정 (4)학생삭제 (-999)종료 ");
		System.out.println("등록학생수 : " + starr.size());
		System.out.print("번호를 입력하세요. >>");
	}

	/**학생정보 등록*/
	private static void studentIn() {
		System.out.println("학생 이름 입력>>");
		String name = sc.nextLine();
		System.out.println("학생 전화 입력>>");
		String tel = sc.nextLine();
		System.out.println("학생 과목 입력>>");
		String subject = sc.nextLine();
		System.out.println("학생 학년 입력>>");
		int grade = Integer.parseInt(sc.nextLine());
		
		Student s = new Student(name, tel, subject, grade);
		starr.add(s);
	}
	
	/**학생 검색 ( 안되는중 )*/
	private static void studentSearch() {
		System.out.println("검색할 학생 이름 입력>>");
		String student = sc.nextLine();
		for(int i =0; i < starr.size(); i++) {
			if(starr.get(i).getName().equals(student)){
				System.out.println("검색 성공," + i +" 번째");
				System.out.println(starr.get(i).toString());
				break;
			} else {
				System.out.println("검색 실패");
				break;
			}
		}
	}
	
	/**학생 수정*/
	private static void studentModify() {
		System.out.println("수정 할 학생의 번호 입력");
		int index = Integer.parseInt(sc.nextLine());
		if(index >= starr.size()) {
			System.out.println("존재 하지 않는 번호입니다.");
			return;
		}
		System.out.println("수정할것 입력 1)이름 2)전화 3)과목 4)학년");
		int number = Integer.parseInt(sc.nextLine());
		System.out.println("수정할 값을 입력하세요.");
		if(number == 1 ) {
			System.out.println("이름 수정중, 현재 이름 : " + starr.get(index).getName() + ", 수정할 값 입력");
			starr.get(index).setName(sc.nextLine());
		} else if(number == 2) {
			System.out.println("전화 수정중, 현재 전화번호 : " + starr.get(index).getTel() + ", 수정할 값 입력");
			starr.get(index).setTel(sc.nextLine());
		} else if(number == 3) {
			System.out.println("과목 수정중, 현재 과목명 : " + starr.get(index).getSubject() + ", 수정할 값 입력");
			starr.get(index).setSubject(sc.nextLine());
		} else if(number == 4) {
			System.out.println("학년 수정중, 현재 학년 : " + starr.get(index).getGrade() + ", 수정할 값 입력");
			starr.get(index).setGrade(Integer.parseInt(sc.nextLine()));
		} else {
			System.out.println("1~4 사이의 숫자를 입력해주세요.");
			return;
		}
		System.out.println("수정 완료");
		System.out.println(starr.get(index).toString());
	}
	
	/**학생 삭제*/
	private static void studentDelete() {
		System.out.println("삭제 할 학생의 번호 입력.");
		int index = Integer.parseInt(sc.nextLine());
		if(index >= starr.size()) {
			System.out.println("존재 하지 않는 번호입니다.");
			return;
		}
		starr.remove(index);
		System.out.println("삭제 완료.");
	}
	
	/**학생 정보 저장*/
	private static void studentInfoSave() {
		try {
			FileOutputStream fos = new FileOutputStream("studentInfo.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(starr);
			oos.flush();
			oos.close();
		} catch (IOException e) {
			System.out.println("저장 실패");
		}
	}
	
	/**학생 정보 불러오기*/
	private static void studentInfoCall() throws IOException {
		try {
			FileInputStream fis = new FileInputStream("studnetInfo.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			starr = (ArrayList<Student>)ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일찾기 실패");
		}	catch (ClassNotFoundException e) {
			System.out.println("클래스 찾기 실패");
		}	catch (IOException e) {
			System.out.println("불러오기 실패");
		}
		
	}
}
