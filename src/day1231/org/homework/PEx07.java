package day1231.org.homework;

import java.util.Calendar;
import java.util.Random;

public class PEx07 {

	public static void main(String[] args) {
//		String a= "가나다라";
//		System.out.println(a == "가나다라");
//		// 결과 : true
//		// "가나다라" 문자열은 스트링 리터럴 테이블에 저장되고,
//		// String a의 레퍼런스 a는 리터럴 테이블을 가리키므로
//		// "가나다라" 문자열의 레퍼런스와 레퍼런스 a의 값은 일치하므로 true 반환
//		
//		String b = new String(a);
//		System.out.println(a==b);
//		// new String에 의해 생성된 객체는 힙에 생성되므로 String b는 힙영역을 가리킴
//		// 그러므로 a와 b의 레퍼런스 값은 서로 달라서 false 반환
		
		Calendar date = Calendar.getInstance();
		date.clear();
		date.set(Calendar.YEAR,2020);
		date.set(Calendar.MONTH, Calendar.DECEMBER);
		date.set(Calendar.DATE, 25);
		System.out.println("약속 날짜는 "+date.get(Calendar.YEAR)+"년 "+(date.get(Calendar.MONTH)+1)+"월 "+ date.get(Calendar.DATE)+"일");
	}

}
