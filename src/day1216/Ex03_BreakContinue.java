package day1216;

import java.util.Scanner;

public class Ex03_BreakContinue {
	static Scanner sc = new Scanner(System.in);

	public static void main00(String[] args) {
		// beak label

		aa: for (int i = 1; i <= 10; i++) {
				for (int j = 1; j <= 10; j++) {
					// label이 지정된 반복문을 break하여 바깥 for문을 break 한다.
					if (j % 3 == 0)
						break aa; // label aa의 반복문 break
					System.out.print(i * j + " ");
				}
				System.out.println();
			}
	}

	// break, continue 응용
	public static void main(String[] args) {
		int age = 0;

		// 잘못입력받았을 경우 다시입력하도록 try ~ catch문 사용
		while (true) {
			try {
				System.out.print("나이 입력 : ");
				age = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("다시입력");
				// 스캐너의 버퍼에 남은 값을 제거하기 위해 사용
				sc.nextLine();
				continue;
			}
		}

		if (age < 20) {
			System.out.println("미성년자에게는 술을 팔지 않습니다.");
		} else {
			System.out.println("맛있게 드세요");
		}
	}

}
