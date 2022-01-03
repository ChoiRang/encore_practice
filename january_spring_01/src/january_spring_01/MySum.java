package january_spring_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mysum")
public class MySum {
	int number = 0;
	@Autowired	//���ų� �ڽ� Ÿ���� ã�� ����, �������̸� ����
	@Qualifier("myBackupFile")	//�̸����� ã�� ����
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
