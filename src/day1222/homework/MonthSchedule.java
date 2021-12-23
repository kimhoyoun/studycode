package day1222.homework;

import java.util.Scanner;

class Day {
	private String work;
	public void set(String work) {
		this.work = work;
	}
	public String get() {
		return work;
	}
	public void show() {
		if(work == null) {
			System.out.println("없습니다.");
		}else {
			System.out.println(work + "입니다.");
		}
	}
}

public class MonthSchedule {
	Scanner sc = new Scanner(System.in);
	Day[] days;
	
	MonthSchedule(int day) {
		this.days = new Day[day];
		for(int i =0; i<days.length; i++) {
			days[i] = new Day();
		}
	}
	
	
	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램");
		while(true) {
		System.out.print("할일(입력: 1, 보기: 2, 끝내기: 3) >> ");
		int num = sc.nextInt();
			switch(num) {
				case 1 : 
					input();
					System.out.println();
					break;
				case 2 : 
					view(); 
					System.out.println();
					break;
				
				case 3 : finish(); break;
			}
		}
	}
	
	private void input() {
		System.out.printf("날짜(1~%d)? ",days.length);
		int index = sc.nextInt();
		index--;
		System.out.print("할일(빈칸없이입력)? ");
		String work = sc.next(); 
		days[index].set(work);
	}
	
	private void view() {
		System.out.printf("날짜(1~%d)?",days.length);
		int index = sc.nextInt();
		System.out.printf("%d일의 할 일은 ",index);
		index--;
		days[index].show();
	}
	private void finish() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
		
	}
	
	
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
				
	}
}
