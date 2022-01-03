package january_spring_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mysum")
public class MySum {
	int number = 0;
	@Autowired	//같거나 자식 타입을 찾아 저장, 여러개이면 오류
	@Qualifier("myBackupFile")	//이름으로 찾아 저장
	private MyBackup backup;
	
//	public void setBackup(MyBackup backup) {
//		this.backup = backup;
//	}
	
	public void add(int i) {
		backup.log("i = " + i);
		number += i;
	}

	public int getTotal() {
		return number;
	}

}
