package january_spring_01;

import org.springframework.stereotype.Component;

@Component
public class MyBackupFile extends MyBackup{
	@Override
	public void log(String string) {
		System.out.println("mybackup 파일출력 : " + string);
	}
	
}
