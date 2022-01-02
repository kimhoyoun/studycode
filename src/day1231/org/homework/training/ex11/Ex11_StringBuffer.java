package day1231.org.homework.training.ex11;

import java.util.Scanner;

public class Ex11_StringBuffer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(">> ");
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		while (true) {

			System.out.print("명령 : ");
			String command = sc.next();
			if (command.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}
			int index = command.indexOf("!");
			if(index == 0) {
				System.out.println("잘못된 명령입니다!");
				continue;
			}
			String s1 = command.substring(0, index);
			String s2 = command.substring(index + 1, command.length());
			if (sb.indexOf(s1) == -1) {
				System.out.println("찾을 수 없습니다!");
				continue;
			}

			sb.replace(sb.indexOf(s1), sb.indexOf(s1) + s1.length(), s2);
			System.out.println(sb);
		}
	}
}
