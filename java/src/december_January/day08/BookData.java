package december_January.day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BookData {
	String fileName1 = "BookData.ser";
	String fileName2 = "UserData.ser";
	private ArrayList<BookInfo> bookArr = new ArrayList<BookInfo>();
	private ArrayList<UserInfo> userArr = new ArrayList<UserInfo>();

	public void bookInfoSave(ArrayList<BookInfo> bookArr) {
		try {
			FileOutputStream fos = new FileOutputStream(fileName1);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(bookArr);
			oos.flush();
			oos.close();
		} catch(FileNotFoundException e) {
			System.out.println("파일 생성 실패");
		} catch(IOException e) {
			System.out.println("파일 저장 실패");
		}
	}

	public ArrayList<BookInfo> bookInfoCall() {
		try {
			FileInputStream fis = new FileInputStream(fileName1);
			ObjectInputStream ois = new ObjectInputStream(fis);
			bookArr = (ArrayList<BookInfo>)ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			System.out.println("도서 데이터 파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("추출 실패");
		}	catch(ClassNotFoundException e) {
			System.out.println("해당 배열이 없습니다.");
		}
		return bookArr;
	}

	public void userInfoSave(ArrayList<UserInfo> userArr) {
		try {
			FileOutputStream fos = new FileOutputStream(fileName2);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(userArr);
			oos.flush();
			oos.close();
		} catch(FileNotFoundException e) {
			System.out.println("파일 생성 실패");
		} catch(IOException e) {
			System.out.println("파일 저장 실패");
		}
	}
	
	public ArrayList<UserInfo> userInfoCall() {
		try {
			FileInputStream fis = new FileInputStream(fileName2);
			ObjectInputStream ois = new ObjectInputStream(fis);
			userArr = (ArrayList<UserInfo>)ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			System.out.println("유저 데이터 파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("추출 실패");
		}	catch(ClassNotFoundException e) {
			System.out.println("해당 배열이 없습니다.");
		}
		return userArr;
	}

}
