package january_spring_01;

import java.util.ArrayList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestHello_Annotation {
	public static void main(String[] args) {
		//������ �����̳� �θ���
		BeanFactory context =
				new GenericXmlApplicationContext("classpath:/config/spring_Annotation.xml");
		MyLotto mlt = (MyLotto)context.getBean("lotto");
		ArrayList nums = mlt.getNumbers();//�ߺ����� �ʴ� 6������ ��ȯ
		System.out.println(nums);
	}//end main
}//end class
