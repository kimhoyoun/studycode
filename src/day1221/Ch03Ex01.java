package day1221;

import java.util.Scanner;

public class Ch03Ex01 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int month = 0, day=0;
		int total =0;
		int nextMonth = 0, nextDay = 0;
		
		System.out.print("월 입력 >>");
		month = sc.nextInt();
		while(month<1||month>12) {
			System.out.println("월 입력 오류: 범위를 벗어났습니다!");
			System.out.print("월 다시 입력(1~12사이) >>");
			month = sc.nextInt();
		}
		System.out.print("일 입력 >>");
		day = sc.nextInt();
		while(day<1||day>days[month-1]) {
			System.out.println("일 입력 오류: 범위를 벗어났습니다!");
			System.out.printf("일 다시 입력(1~%d사이) >>",days[month-1]);
			day = sc.nextInt();
		}
		
		System.out.printf("%d월은 %d일까지 있다. \n",month, days[month-1]);
		System.out.printf("%d월의 남은 날짜는 %d일이다.\n",month,days[month-1]-day);
		// 1월 1일부터 입력날짜까지 total에 누적
		total = day; 	
		for(int i =0; i<month-1; i++) {
			total+= days[i];
		}
		System.out.printf("1월 1일부터 %d월 %d일은 %d일 지났습니다.\n",month, day, total);
		
		
		// 1년중 남은 날짜 구하기
		total = days[month-1] -day;
		for(int i =month; i<days.length;i++) {
			total+= days[i];
		}
		System.out.printf("%d월 %d일 이후 1년의 남은 날짜는 %d일입니다.\n",month,day,total);
		
		// 현재 달의 남은 날짜로 total 초기화
		System.out.print("몇일 후 날짜를 알고 싶나요? >>> ");
		int dd = sc.nextInt();
		// 만약 현재 달의 남은 날짜보다 적은 숫자가 들어오면 그냥 현재달의 day+dd이다. 추가하면댐
//		if(days[month-1]-day<dd) {
//			nextDay = day + dd;
//			total = nextDay;
//		}else {
//			total = dd-(days[month-1]-day); 
//		}
		
		total = dd-(days[month-1]-day); 
		// 12월이면 다음달은 1월이므로
		// 증가했는데 12보다 크면 12로 나눠서 12보다 큰 값이되지 않게함(out of boundary exception 방지)
		int i = month%12;
		for(; total>days[i];i++,i%=12) { 	
			total -= days[i];
		}
		nextMonth = i+1;
		nextDay = total;
		System.out.println(dd+"일 후는 "+nextMonth+"월 "+nextDay+"일");
	}

}
