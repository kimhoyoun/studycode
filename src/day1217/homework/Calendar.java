package day1217.homework;

import java.util.Scanner;

public class Calendar {
	// 월 입력
	
	static int getNum() {
		int num;
		while(true) {
			try {
				num =sc.nextInt();
				break;
			}catch(Exception e) {
				System.out.println("숫자만 입력하세요!\n");
				sc.next();
				continue;
			}
		}
		return num;
	}
	static int getMonth() {
		 System.out.print("월 입력 >> ");
		 int month = getNum();
		// 과제 1 : 날짜입력 유효성 체크 구현.
		while (!((month >= 1) && (month <= 12))) {
			try {
				System.out.printf("잘못입력했습니다.(1 ~ 12 사이값 입력)\n");
				System.out.print("월 입력 >> ");
				month = sc.nextInt();
			} catch (Exception e) {
				System.out.print("숫자만 입력 하세요!\n");
				sc.next();
				continue;
			}
		}
		return month;
	}
	
	static int getDay(int month,int[]days) {
		System.out.print("일 입력 >> ");
		int day = getNum();

		// 과제 1 : 날짜입력 유효성 체크 구현.
		while (!((day >= 1) && (day <= days[month-1]))) {
			try {
				System.out.println("과제 1");
				System.out.printf("잘못입력했습니다.(%d월은 %d일까지 있습니다)\n",month,days[month-1]);
				System.out.print("일 입력 >> ");
				day = sc.nextInt();
			} catch (Exception e) {
				System.out.print("숫자만 입력 하세요!\n");
				sc.next();
				continue;
			}
		}
		
		return day;
	}
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int []days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int month = getMonth();
		int day = getDay(month, days);
		
		int total = days[month-1]-day;
		
		// 과제 2 : 0월 0일부터 1년의 남은 날짜는 00일입니다.
		for(int i = month; i<days.length; i++) {
			total += days[i];
		}
		System.out.println("과제 2");
		System.out.printf("%d월 %d일부터 1년의 남은 날짜는 %d입니다. \n",month,day,total);
		
		// 과제 3 : 입력월 일의 100일 후 날짜 출력.
		int nDay  = day;
		int nMonth = month;

		for(int i = 0; i<100; i++) {
			nDay += 1;
			if(nDay > days[nMonth-1]){
				nDay = 1;
				nMonth++;
				if(nMonth>12) {
					nMonth =1;
				}
			}
		}
		System.out.println("과제 3");
		System.out.printf("%d월 %d일부터 100일 후는 %d월 %d일 입니다.\n",month, day, nMonth, nDay);
		
		// 과제 4 : 확장해보기 - 특정 날짜(입력)후 날짜 출력
		System.out.println("과제 4");
		System.out.print("몇일 후 날짜를 알고싶나요?(정수입력)>> ");
		int next = getNum();
		nDay  = day;
		nMonth = month;

		for(int i = 0; i<next; i++) {
			nDay += 1;
			if(nDay > days[nMonth-1]){
				nDay = 1;
				nMonth++;
				if(nMonth>12) {
					nMonth =1;
				}
			}
		}
		System.out.printf("%d월 %d일부터 %d일 후는 %d월 %d일 입니다.\n",month, day, next, nMonth, nDay);
		
	}

}
