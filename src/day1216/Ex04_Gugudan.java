package day1216;

import java.util.Scanner;

public class Ex04_Gugudan {

	public static void main01(String[] args) {
		// 구구단 출력 프로그램.
		// 2단 ~ 9단까지 출력 프로그램 구현.
		for (int dan = 2; dan < 10; dan++) {
			System.out.printf("***%d단***\n", dan);
			for (int cnt = 1; cnt < 10; cnt++) {
				System.out.printf("%d * %d = %2d\n", dan, cnt, dan * cnt);
			}
			System.out.println();
		}
	}

	public static void main02(String[] args) {
		// 2중 for문 실행 전에 제목이 한줄로 출력 되도록 한다.
		for (int title = 2; title < 10; title++) {
			System.out.printf("***%d***\t", title);
		}
		System.out.println();
		// 4*1=4	5*1=5	6*1=6  과같이 각단의 결과를 세로로 표현하기 위한 코드
		// 4*2=8	5*2=10	6*2=12	
		for (int cnt = 1; cnt < 10; cnt++) {
			for (int dan = 2; dan < 10; dan++) {
				System.out.printf("%d*%d=%2d\t", dan, cnt, dan * cnt);
			}
			System.out.println();
		}
	}

	static Scanner sc = new Scanner(System.in);

	// static이 붙으면 이미 클래스가 만들어질 때 같이 만들어지기 때문에 그냥 쓸 수 있음
	// 안붙이면 객체를 생성해야 사용할 수 있다. (인스턴스)
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

	public static void main03(String[] args) {
		// 2중 for문 실행 전에 제목이 한줄로 출력 되도록 한다.
		int startDan = 2;
		int endDan = 9;
		// 시작단이 종료단 보다 큰 숫자여도 정상 출력 되도록 완성하시오.

		startDan = getDan("시작단 입력>> ");
		endDan = getDan("끝단 입력>> ");

		// 시작단이 끝단보다 클 때 두 값 치환
		if (endDan < startDan) {
			int temp = startDan;
			startDan = endDan;
			endDan = temp;
		}

		for (int title = startDan; title <= endDan; title++) {
			System.out.printf("***%d***\t", title);
		}
		System.out.println();
		for (int cnt = 1; cnt < 10; cnt++) {
			for (int dan = startDan; dan <= endDan; dan++) {
				System.out.printf("%d*%d=%2d\t", dan, cnt, dan * cnt);
			}
			System.out.println();
		}

	}

	public static void main04(String[] args) {
		// 과제1 : 3행 3열로 구구단 출력
		// 과제2 : 시작단, 종료단 기능과 함께하세요.
		
		// 타이틀을 3행 3열로 출력하기위해 각 행의 첫번째 열의 값이 2, 5, 8로 3씩 증가하기때문에
		// dan의 증가값을 3으로 해줌.
		for (int dan = 2; dan <= 9; dan += 3) {
			for (int i = 0; i < 3; i++) {
				// 9단까지만 출력하고 10단은 출력하지 않아야하므로 dan+i가 10이 아닐때만 출력
				if (dan + i != 10) {
					System.out.printf("***%d***\t", dan + i);
				}
			}
			System.out.println();
		}
	}

	public static void main05(String[] args) {
		// 과제1 : 3행 3열로 구구단 출력
		
		// 3개의 구구단값을 출력하고 그 다음값을 다음 행에 출력
		for (int dan = 2; dan <= 9; dan += 3) {
			// 제목먼저 출력
			for (int i = 0; i < 3; i++) {
				if (dan + i != 10) {
					System.out.printf("***%d***\t", dan + i);
				}
			}
			System.out.println();
			// 제목에 해당하는 단을 9까지 곱하고 그 값을 출력
			for (int cnt = 1; cnt <= 9; cnt++) {
				for (int i = 0; i < 3; i++) {
					if (dan + i != 10) {
						System.out.printf("%d*%d=%d\t", dan + i, cnt, (dan + i) * cnt);
					}
				}
				// 3개 단 출력하고 한줄 띄기
				System.out.println();
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// 과제2 : 시작단, 종료단 기능과 함께하세요.
		int startDan = 2;
		int endDan = 9;
		
		// 위에서 정의한 getDan()사용
		startDan = getDan("시작단 입력>> ");
		endDan = getDan("끝단 입력>> ");

		// 시작단이 끝단보다 클 때 두 값 치환
		if (endDan < startDan) {
			int temp = startDan;
			startDan = endDan;
			endDan = temp;
		}
		
		// 구구단의 시작값과 끝단을 입력받은 값으로 하여 반복.
		for (int dan = startDan; dan <= endDan; dan += 3) {
			// 몇단인지 먼저 출력하기 위해 타이틀을 출력하는 for문을 구구단을 출력하는 for문보다 먼저 작성
			for (int i = 0; i < 3; i++) {
				// 구구단의 끝단보다 큰 값은 출력하지 않도록 조건식 설정
				if (dan + i < endDan + 1) {
					System.out.printf("***%d***\t", dan + i);
				}
			}
			System.out.println();
			// 각 단이 9까지 곱한값을 출력하고 dan의 값이 바뀌도록 dan의값으로 제어되는 for문 안에 작성
			for (int cnt = 1; cnt <= 9; cnt++) {
				// 출력할 단을 값을 i를 더해 바꿔주면서 한줄에 dan단, (dan+1)단, (dan+2)단 *cnt 를 출력
				for (int i = 0; i < 3; i++) {
					// 구구단의 끝단보다 큰 값은 출력하지 않도록 조건식 설정
					if (dan + i < endDan + 1) {
						System.out.printf("%d*%d=%d\t", dan + i, cnt, (dan + i) * cnt);
					}
				}
				// 3개의 값 출력하고 줄바꿈
				System.out.println();
			}
			// 보기편하도록 한줄 더 띄워줌
			System.out.println();
		}

	}
}
