package day1231.org.homework.training;

import java.util.Calendar;

public class CalendarMain {
	

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int nowTime = now.get(Calendar.HOUR_OF_DAY);
		
		System.out.printf("현재 시간은 %d시 %d분입니다.\n", now.get(Calendar.HOUR_OF_DAY),now.get(Calendar.MINUTE));
		if(nowTime>4 && nowTime<12) {
			System.out.println("Good Morning");
		}else if(nowTime<18) {
			System.out.println("Good Afternoon");
		}else if(nowTime<22) {
			System.out.println("Good Night");
		}
	}
}
