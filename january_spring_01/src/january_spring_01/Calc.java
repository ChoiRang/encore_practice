package january_spring_01;

import org.springframework.stereotype.Component;

@Component("calc")
public class Calc {
	public int plus(int i, int j) {
		return i + j;
	}

}
