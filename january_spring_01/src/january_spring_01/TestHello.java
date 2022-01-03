package january_spring_01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestHello {
	public static void main(String[] args) {
		//call spring container
		BeanFactory context = 
//			new FileSystemXmlApplicationContext("applicationContext.xml");
//			new ClassPathXmlApplicationContext("/config/spring.xml");
//			new GenericApplicationContext("classpath");
		new GenericXmlApplicationContext("classpath:/config/spring_Annotation.xml");
		Hello h1 = (Hello)context.getBean("hello");
		h1.sayHello();
		
		Calc c1 = (Calc)context.getBean("calc");
		int i = c1.plus(2, 3);
		System.out.println(i);
		
		MySum ms = (MySum)context.getBean("mysum");
		ms.add(1);
		ms.add(2);
		int t = ms.getTotal();
		System.out.println(t);
				
	}
}
