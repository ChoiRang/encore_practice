package december_January.day03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		//현재시간 추출하기
		Date d = new Date();
		int y = d.getYear();
		System.out.println(y);	//121 ->1900 년 이후 지나온 연도
		System.out.println(1900 +y);
		System.out.println("월 = " + d.getMonth());
		System.out.println("월 = " + (d.getMonth() +1));
		System.out.println("일 = " + d.getDate());
		///
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH시");
		System.out.println(sdf.format(d));
		///
		Calendar c = Calendar.getInstance();
	}
}
