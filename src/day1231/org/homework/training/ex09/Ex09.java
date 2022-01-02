package day1231.org.homework.training.ex09;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = { "가위", "바위", "보", "그만" };
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while (true) {

			int n = (int) (Math.random() * 3+1);
			System.out.print("철수[가위(1) 바위(2) 보(3) 끝내기(4)] >> ");
			int num = sc.nextInt();
			
			String user =str[num-1];
			String com = str[n-1];
			if (user.equals("그만")) {
				break;
			}
			if (user.equals(com)) {
				System.out.printf("철수(%s) , 컴퓨터(%s)\n비겼습니다.\n", user, com);
				continue;
			}

			String win = "";
			switch (user) {
			case "가위":
				win = com.equals("바위") ? "컴퓨터" : "철수";
				break;
			case "바위":
				win = com.equals("보") ? "컴퓨터" : "철수";
				break;
			case "보":
				win = com.equals("가위") ? "컴퓨터" : "철수";
				break;
			}
			System.out.printf("철수(%s) , 컴퓨터(%s)\n%s가 이겼습니다.\n", user, com, win);
		}
		System.out.println("게임을 종료합니다..");
	}
}
