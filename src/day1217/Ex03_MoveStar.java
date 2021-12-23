package day1217;

import java.util.Scanner;

public class Ex03_MoveStar {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		-1 입력하면 종료 그외에는 계속
//		크기 >> 5
//		*****
//		**  *
//		* * *
//		*  **
//		*****
//		
//		*****
//		** **  
//		*   * 
//		** **  
//		*****

//		크기 >> 7
//		*******
//		**    *
//		* *   *
//		*  *  *
//		*   * *
//		*    **
//		*******
//		
//		*******
//		* * * * 
//		**   **      
//		*     *
//		**   **
//		* * * *
//		*******

//		*********
//		*  * *  *    3 5
//		* *   * *   2   6
//		**     **   
//		*       *   2   6
//		**     **    3 5
//		* *   * *
//		*  * *  *
//		*********

		// 배열과 반복을 연습하는 주말 과제

		int size = inNum();
		boolean game = true;
		while(game) {
			stair(size);
			diamond(size);
			
			if(!start()) {
				break;
			}
			size = inNum();
		}
		System.out.println("프로그램 종료");
	}
	static boolean start() {
		int regame;
		while(true) {
		try {
			System.out.print("종료하려면 -1을 입력하세요. 그외 재시작 ");
			regame = sc.nextInt();
			break;
		} catch (Exception e) {
			System.out.print("숫자만 입력 하세요!\n");
			sc.next();
			continue;
			}
		}
		
		if(regame == -1) {
			return false;
		}
		return true;
	}
	static int inNum() {
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
		return size;
	}

	static void stair(int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == 0) {
					System.out.print("*");
				} else if (i == size-1) {
					System.out.print("*");
				} else {
					System.out.print((j==0)||(j==size-1)||(j==i)?"*":" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	static void diamond(int size) {

		int em = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == 0) {
					System.out.print("*");
				} else if (i == size-1){
					System.out.print("*");
				} else {
					System.out.print((j==0)||(j==size-1)||(j==size/2-em)||(j==size/2+em)?"*":" ");
				}
			}
			System.out.println();
			em = i<size/2? em + 1 : em - 1;
		}
		System.out.println();
	}
}
