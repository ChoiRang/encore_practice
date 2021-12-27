package december_January.day06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
	public static void main(String[] args) {
		Set<Integer> setInt = new TreeSet<Integer>();
		
		while(setInt.size() < 6) {
				int r = (int)(Math.random()*45 +1);
				setInt.add(r);
		}
		System.out.println(setInt);
		//---
		for (;setInt.size() < 6;) {
			int r = (int)(Math.random()*45 +1);
			setInt.add(r);
		}
		System.out.println(setInt);
		//---
		
		
	}
}
