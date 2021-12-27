package december_January.day06;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TestStudentSerialization {
	public static void main(String[] args) throws IOException {
		//학생 객체를 리스트에 추가, 파일에 저장
		Student st1 = new Student("홍길동","컴공","010-111",4);
		
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(st1);
		st1 = new Student("홍길동", "소공", "010-223", 3);
		extracted(st1);
		
	}

	private static void extracted(Student st1) throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("student.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		oos.writeObject(st1);
		oos.flush();
		oos.close();
		System.out.println("객체저장성공");
	}
}
