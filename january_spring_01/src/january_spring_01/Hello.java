package january_spring_01;

import org.springframework.stereotype.Component;

@Component("hello")
public class Hello {
	public void sayHello() {
		System.out.println("Hello");
	}
}
