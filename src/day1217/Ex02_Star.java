package day1217;

import java.util.Scanner;

public class Ex02_Star {

	public static void main01(String[] args) {
		// *
		// ***
		// *****
		// *******
		// *********

		for (int i = 0; i < 5; i++) {
			// 공백출력
			// (j<4-1) 공백갯수 (2*i+1) 별갯수
			// 두 값을 더해 공백먼저출력하고 별을 출력하도록 함.
			for (int j = 0; j < 4 - i + 2 * i + 1; j++) {
				System.out.print((j < 4 - i) ? " " : "*");
			}
			System.out.println();
		}
	}

	public static void main02(String[] args) {
		// *********
		// *******
		// *****
		// ***
		// *

		for (int i = 0; i < 5; i++) {
			// 공백출력
			// (i) 공백갯수 (9-2*i) 별갯수
			// 두 값을 더해 공백먼저출력하고 별을 출력하도록 함.
			for (int j = 0; j < 9 - i; j++) {
				System.out.print((j < i) ? " " : "*");
			}

			System.out.println();
		}
	}

	// 내 코드
	public static void main03(String[] args) {
		// *
		// ***
		// *****
		// *******
		// *********
		// *******
		// *****
		// ***
		// *

		for (int i = 0; i < 9; i++) {
			if (i < 5) {
				for (int j = 0; j < 5 - i; j++) {
					System.out.print((j < 4 - i) ? " " : "*");
				}
				System.out.println();
			} else {
				for (int j = 0; j < 9 - (i - 4); j++) {
					System.out.print((j < i - 4) ? " " : "*");
				}
				System.out.println();
			}
		}
	}

	// 강사님 코드 1
	// 1. 먼저 1 2 3 4 5 4 3 2 1 로 변하는 end 변수 정의
	// 2. 공백을 먼저 찍고
	// 3. 별찍는 코드를 짬.
	public static void main04(String[] args) {
		// 1. 먼저 1 2 3 4 5 4 3 2 1 로 변하는 end 변수 정의
		int end = 1;
		for (int i = 0; i < 9; i++) {
			// 2. 공백을 먼저 찍기
			// 5-end만큼 반복해서 공백을 찍어줌
			for (int j = 0; j < 5 - end; j++) {
				System.out.print(" ");
			}
			// 3. 별찍는 코드
			// 별의 갯수만큼 반복
			for (int j = 0; j < end * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
			// 1. 먼저 1 2 3 4 5 4 3 2 1 로 변하는 end 변수 정의
			end = i < 4 ? end + 1 : end - 1;
		}
	}

	// 강사님 코드 2
	// 1. 일단 9행 9열로 별을 찍는다.
	// 2. 기준(end)의 오른쪽 별 제거
	// 3. 기존의 왼쪽을 별 대신 공백출력
	public static void main05(String[] args) {
		int end = 4;
		// 기준정하는 end를 정하고 4보다 크면 별갯수 늘리고
		// 4보다 크면 별 갯수 줄이기
		for (int i = 0; i < 9; i++) {
			// 9-end로 반복횟수 줄여서 오른쪽 별지우기
			for (int j = 0; j < 9 - end; j++) {
				// j가 end보다 작으면 공백 출력해서 모양 만들기
				System.out.println(j < end ? " " : "*");
			}
		}
	}

	// 방법1
	public static void main06(String[] args) {
//		*********
//		 *******
//		  *****
//		   ***
//		    *
//		   ***
//		  *****
//		 *******
//		*********
		// 공백의 갯수를 정의할 end 선언
		int end = 0;
		for (int i = 0; i < 9; i++) {
			// 전체 9열에서 오른쪽 별을 공백만큼 제거(반복횟수 감소)하기위해
			// 9에서 end를 빼서 반복횟수 제어
			for (int j = 0; j < 9 - end; j++) {
				// j가 end 보다 작으면 공백출력 그외 별 출력
				System.out.print(j < end ? " " : "*");
			}
			System.out.println();
			// i에 따라 공백의 갯수를 변화 시킴
			end = i < 4 ? end + 1 : end - 1;
		}
	}

	// 방법2
	public static void main07(String[] args) {
		// 4를 기준으로 반절을 나눠주기위해 초기값 4를 갖는 end 선언
		int end = 4;
		for (int i = 0; i < 9; i++) {
			// 공백출력
			// 열의 기준(4)에서 end만큼 빼준만큼 반복하여 공백 출력
			for (int j = 0; j < 4 - end; j++) {
				System.out.print(" ");
			}
			// 별 출력
			// 별의 갯수만큼 (9부터 1, 1부터 9까지) 반복하여 별 출력
			for (int j = 0; j < 2 * end + 1; j++) {
				System.out.print("*");
			}

			System.out.println();
			// i값이 4(다섯번째 줄)일때를 기준으로 end 값이 4에서 증가하거나 감소하도록
			// 삼항연산자 사용
			end = (i < 4) ? end - 1 : end + 1;
		}
	}

	// 내 코드
	public static void main08(String[] args) {
//		*********  0  0 9      0
//		**** ****  1  1 8  -1  5
//		***   ***  2  3 6  -2  4-6
//		**     **  3  5 4  -2  3-7 
//		*       *  4  7 2  -2  2-8 
//		**     **  5  5 4  +2  3-7
//		***   ***  6  3 6  +2  4-6
//		**** ****  7  1 8  +2  5
//		*********  8  0 9  +2  0
		
		// 가운데(4열)를 기준으로 1증가하고 감소할 em변수를 초기값 0으로 선언 
		int em = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				// 4열을 기준으로 em만큼 떨어진 범위를 &&연산으로 지정하여
				// 그 범위만큼 공백을 출력하고 그외에는 별을 출력
				System.out.print((j > (4 - em)) && (j < (4 + em)) ? " " : "*");
			}
			System.out.println();
			// i가 보다 작을땐 em이 0부터 1씩 증가하고 4초과일때 1씩 감소하도록 정의
			em = i < 4 ? em + 1 : em - 1;
		}
	}

	// 강사님 코드
	public static void main09(String[] args) {
		int end = 5;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				// 별찍히는 경우
//				System.out.print((j<end||j>8-end)?"*":" ");

				// 공백 찍히는 경우
				System.out.print((j >= end && j < 9 - end) ? " " : "*");
			}
			System.out.println();
			end = i < 4 ? end - 1 : end + 1;
		}
	}

	static Scanner sc = new Scanner(System.in);

	// 사이즈입력 및 유효성검사
	public static void main(String[] args) {

		int size;
		while (true) {
			// 숫자가아닌 이상한값이 들어오면 다시 입력받도록 예외처리
			try {
				System.out.print("크기 입력(홀수만) >> ");
				size = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.print("숫자만 입력 하세요!\n");
				sc.next();
				continue;
			}
		}
		// 유효성 검사 : 5보다 크고 15보다는 작은 값만 허용, 홀수만 입력 받을 것.
		while (!((size % 2 == 1) && (size >= 5) && (size <= 15))) {
			try {
				// 범위 초과 일때
				if (!((size >= 5) && (size <= 15))) {

					System.out.println("5이상 15이하 값만 입력");
					System.out.print("크기 입력(홀수만) >> ");
					size = sc.nextInt();
					continue;
				}
				// 짝수 입력됐을 때
				System.out.println("홀수만 입력 하세요!");
				System.out.print("크기 입력(홀수만) >> ");
				size = sc.nextInt();
			// 숫자가아닌 이상한값이 들어오면 다시 입력받도록 예외처리
			} catch (Exception e) {
				System.out.print("숫자만 입력 하세요!\n");
				sc.next();
				continue;
			}
		}
		int end = size / 2 + 1;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print((j >= end && j < size - end) ? " " : "*");
			}
			System.out.println();
			end = i < (size / 2) ? end - 1 : end + 1;
		}
	}

}
