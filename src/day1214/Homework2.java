package day1214;

import java.util.Scanner;

public class Homework2 {
	public static Scanner sc = new Scanner(System.in);

	public static void main16(String[] args) {
		String str[] = { "가위", "바위", "보" };
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while (true) {

			int n = (int) (Math.random() * 3);
			System.out.print("가위 바위 보! >> ");
			String user = sc.next();
			if(user.equals("그만")) {
				break;
			}
			if (user.equals(str[n])) {
				System.out.printf("사용자 = %s , 컴퓨터 = %s, 비겼습니다.\n", user, str[n]);
				continue;
			}

			String win = "";
			switch (user) {
			case "가위":
				win = str[n].equals("바위") ? "컴퓨터" : "사용자";
				break;
			case "바위":
				win = str[n].equals("보") ? "컴퓨터" : "사용자";
				break;
			case "보":
				win = str[n].equals("가위") ? "컴퓨터" : "사용자";
				break;
			}
			System.out.printf("사용자 = %s , 컴퓨터 = %s, %s가 이겼습니다.\n", user, str[n], win);
		}
		System.out.println("게임을 종료합니다..");
	}

	public static void main15(String[] args) {
		// 다른 클래스파일에 있습니다.
	}

	public static void main14(String[] args) {
		String cource[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };

		while (true) {
			System.out.print("과목 이름 >> ");

			String str = sc.next();
			if (str.equals("그만")) {
				break;
			}
			int i = 0;
			for (i = 0; i < cource.length; i++) {
				if (cource[i].equals(str))
					break;
			}
			if (i >= cource.length) {
				System.out.println("없는 과목 입니다.");
			} else {
				System.out.printf("%s의 점수는 %d\n", cource[i], score[i]);
			}

		}
	}

	public static void main13(String[] args) {
		int n = 1;
		while (n > 0 && n < 100) {
			if ((n % 10 == 3) || (n % 10 == 6) || (n % 10 == 9)) {
				if ((n / 10 == 3) || (n / 10 == 6) || (n / 10 == 9))
					System.out.printf("%2d 박수짝짝 \n", n);
				else
					System.out.printf("%2d 박수짝 \n", n);
			}
			n++;
		}
	}

	public static void main12(String[] args) {
		// 다른클래스파일에 있습니다.
	}

	public static void main11(String[] args) {
		// 다른클래스파일에 있습니다.
	}

	public static void main10(String[] args) {
		int[][] arr = new int[4][4];
		int count = 0;

		while (count < 10) {
			int n1 = (int) (Math.random() * 4);
			int n2 = (int) (Math.random() * 4);

			if (arr[n1][n2] == 0) {
				arr[n1][n2] = (int) (Math.random() * 10 + 1);
				count++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public static void main09(String[] args) {
		int[][] arr = new int[4][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 10 + 1);
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main08(String[] args) {
		int num = 0;
		System.out.print("정수 몇개? ");
		num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
			System.out.printf("%3d ", arr[i]);
			if (i % 10 == 9)
				System.out.println();
		}

	}

	public static void main07(String[] args) {
		int[] num = new int[10];
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10 + 1);
			System.out.print(num[i] + " ");
			sum += num[i];
		}
		System.out.println("\n평균은 " + (float) sum / num.length);

	}

	public static void main06(String[] args) {
		int money = 0;
		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		System.out.print("금액을 입력하시오 >> ");
		money = sc.nextInt();

		for (int i = 0; i < unit.length; i++) {
			if (money >= unit[i]) {
				System.out.printf("%d원짜리 %d개 \n", unit[i], money / unit[i]);
				money %= unit[i];
			}
		}
	}

	public static void main05(String[] args) {
		int[] num = new int[10];

		System.out.print("양의 정수 10개를 입력하시오 >> ");
		for (int i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
		}
		System.out.print("3의 배수는 ");
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 3 == 0) {
				System.out.print(num[i] + " ");
			}
		}

	}

	public static void main04(String[] args) {
		System.out.print("소문자 알바벳 하나를 입력하시오 >> ");
		// 한문자 입력받기
		char c = sc.next().charAt(0);
		// 입력받은 알파벳이 'a'부터 몇번째 인지 알기위해 'a'의 ASCII Code 97을 c의 ASCII Code에서
		// 빼주고 그만큼 반복함.
		for (int i = 0; i <= (int) c - 97; i++) {
			// 'a'부터 입력받은 c까지 출력하고 하나씩 줄어들도록 반복 조건을 아래처럼 설정
			for (int j = 97; j <= (int) c - i; j++) {
				// int값 j를 문자로 출력하기 위해 (char)로 형변환
				System.out.print((char) j);
			}
			System.out.println();
		}

	}

	public static void main03(String[] args) {
		System.out.print("점수를 입력하시오 >> ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main02(String[] args) {
		int n[][] = { { 1 }, { 1, 2, 3 }, { 1 }, { 1, 2, 3, 4 }, { 1, 2 } };

		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main01(String[] args) {
//		(1) 0부터 100미만까지 짝수들의 총합
//		(2) 
//		package homework_Ex.day12_14;
//
//		public class WhileTest {
//			public static void main(String[] args) {
//				int sum =0, i=0;
//				while(i<100) {
//					sum = sum+i;
//					i += 2;
//				}
//				System.out.println(sum);
//			}
//
//		}
//		(3) 
//		package homework_Ex.day12_14;
//
//		public class ForTest {
//			public static void main(String[] args) {
//				int sum = 0;
//				for(int i=0; i<100; i+=2) {
//					sum = sum+i;
//				}
//				System.out.println(sum);
//			}
//		}

//		(4)
//		package homework_Ex.day12_14;
//
//		public class DoWhileTest {
//			public static void main(String[] args) {
//				int sum = 0, i = 0;
//				do {
//					sum = sum+i;
//					i+=2;
//				}while(i<100);
//				
//				System.out.println(sum);
//			}
//		}

	}

}
