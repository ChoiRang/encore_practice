package january_spring_01;

import org.springframework.stereotype.Component;

@Component
public class MyBackup {

	public void log(String string) {
		System.out.println("backup 화면출력 : " + string);
	}

}
