package january_spring_01;

import org.springframework.stereotype.Component;

@Component	//�������� �⺻ �̸��� = myBackupNetwork �� ��(ù �� �ҹ���)
public class MyBackupNetwork extends MyBackup{
	@Override
	public void log(String string) {
		System.out.println("��Ʈ��ũ ��� : " + string);
	}
}
