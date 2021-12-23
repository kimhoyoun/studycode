package day1217;

import java.util.Scanner;

public class Ex01_Gugu {

	public static void main01(String[] args) {
		// 12.17 과제 풀이
		// 과제1 : 3행 3열로 구구단 출력
		

		// 타이틀을 3행 3열로 출력하기위해 각 행의 첫번째 열의 값이 2, 5, 8로 3씩 증가하기때문에
		// dan의 증가값을 3으로 해줌.
		for (int dan = 2; dan <= 9; dan += 3) {
			for (int i = 0; i < 3; i++) {
				// 9단까지만 출력하고 10단은 출력하지 않아야하므로 dan+i가 10이 아닐때만 출력
				if (dan + i != 10) 
					System.out.printf("***%d***\t", dan + i);
			}
			System.out.println();
			for(int cnt=1; cnt<=9; cnt++) {
				for(int i=0; i<3; i++) {
					if(dan+i !=10) System.out.printf("%d*%d=%d\t",dan+i,cnt,(dan+i)*cnt);
				}
				System.out.println();
			}
		}
	}
	static Scanner sc = new Scanner(System.in);

	static int getDan(String message) {
		System.out.print(message);
		int dan = sc.nextInt();

		// 유효성 체크
		while (dan < 2 || dan > 9) {
			System.out.println("입력범위를 초과했습니다!");
			System.out.print(message);
			dan = sc.nextInt();
		}
		return dan;
	}
	// 과제2 : 시작단, 종료단 기능과 함께하세요.
	public static void main(String[] args) {
		int startDan = 2;
		int endDan = 9;
		startDan = getDan("시작단 입력>> ");
		endDan = getDan("끝단 입력>> ");

		// 시작단이 끝단보다 클 때 두 값 치환
		if (endDan < startDan) {
			int temp = startDan;
			startDan = endDan;
			endDan = temp;
		}
		
		for (int dan = startDan; dan <= endDan; dan += 3) {
			for (int i = 0; i < 3&&dan+i<=endDan; i++) {
				System.out.printf("***%d***\t", dan + i);
//				if (dan + i <= endDan) 
			}
			System.out.println();
			for(int cnt=1; cnt<=9; cnt++) {
				for(int i=0; i<3&&dan+i<=endDan; i++) {
					 System.out.printf("%d*%d=%d\t",dan+i,cnt,(dan+i)*cnt);
//					 if(dan+i <=endDan)
				}
				System.out.println();
			}
		}
	}
}
