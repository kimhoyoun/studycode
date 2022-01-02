package day1231.org.homework.training.ex07;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex07_StringTokenizer {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		while(true) {			
			System.out.print(">> ");
			String str = sc.nextLine();
			if(str.equals("그만")) {
				break;
			}
			StringTokenizer st = new StringTokenizer(str," ");
			int i = st.countTokens();
			System.out.println("어절 개수는 "+i);
			
		}
		System.out.println("종료합니다....");
	}

}
