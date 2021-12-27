package day1227.org.mymvc.view;


import java.util.Scanner;

public class StudentView {
	static String[] title = {"번호", "이름", "국어","영어","수학","총점","평균","학점","등수"};
	public static Scanner scan = new Scanner(System.in);
	public void display() {
		System.out.println("Student view display ...");
	}
	// 타이틀 출력하는 함수
	public void title() {
		for(String t : title) {
			System.out.printf("%s\t",t);
		}
		System.out.println();
	}
}
