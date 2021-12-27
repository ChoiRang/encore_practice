package december_January.day06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TestObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//writeList();
		readLine();
		
	}

	private static void readLine() throws FileNotFoundException, IOException, ClassNotFoundException {
		//파일에서 List 를 읽어 복원하기
		FileInputStream fis = new FileInputStream("name.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<String> list = (ArrayList<String>)ois.readObject();
		
		System.out.println("복원된 리스트 = " + list);
	}

	private static void writeList() throws FileNotFoundException, IOException {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("홍길동");
		myList.add("김길동");
		myList.add("이길동");
		
		//파일에 저장
		FileOutputStream fos = new FileOutputStream("name.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		oos.writeObject(myList);
		oos.flush();
		oos.close();
		System.out.println("객체저장성공");
	}
}
