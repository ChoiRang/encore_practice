package january_spring_01;

import java.util.ArrayList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestHello_Annotation {
	public static void main(String[] args) {
		//스프링 컨테이너 부르기
		BeanFactory context =
				new GenericXmlApplicationContext("classpath:/config/spring_Annotation.xml");
		MyLotto mlt = (MyLotto)context.getBean("lotto");
		ArrayList nums = mlt.getNumbers();//중복되지 않는 6개숫자 반환
		System.out.println(nums);
	}//end main
}//end class
