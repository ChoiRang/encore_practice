package january_spring_01;

import org.springframework.stereotype.Component;

@Component	//미지정이 기본 이름이 = myBackupNetwork 가 됨(첫 자 소문자)
public class MyBackupNetwork extends MyBackup{
	@Override
	public void log(String string) {
		System.out.println("네트워크 출력 : " + string);
	}
}
