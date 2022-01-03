package january_spring_01;

import java.util.ArrayList;
import java.util.HashSet;

import org.springframework.stereotype.Component;

@Component("lotto")
public class MyLotto {

	public ArrayList getNumbers() {
		ArrayList<Integer> lottos = new ArrayList<Integer>();
		HashSet<Integer> lottoCheck = new HashSet<Integer>();
		for(int i = 0; i < 6; i++) {
			if(lottoCheck.size() <= 6) {
				lottoCheck.add((int)(Math.random()*45+1));
			}
		}
		
		for(int number : lottoCheck) {
			lottos.add(number);
		}
		return lottos;
	}

}
