package day1231.org.homework.training.ex08;

import java.util.Arrays;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
		String s = sc.nextLine();
		
		for(int i =1; i<=s.length(); i++) {
			System.out.print(s.substring(i));
			System.out.println(s.substring(0,i));
		}
	}

}
