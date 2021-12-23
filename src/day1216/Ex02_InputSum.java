package day1216;

import java.util.Scanner;

public class Ex02_InputSum {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main01(String[] args) {
		// 여러개의 정수를 입력한다. 끝내려면 -1을 입력한다.
		// -1이 입력되기 전까지 숫자를 계속 입력 받는 프로그램.
		// 입력 받은 숫자 중 -1을 제외한 숫자들의 평균을 출력한다.
		// avg = 총점/count 필요
		
		int total=0;
		int count = 0;
		double avg =0.0;
		
		System.out.println("-1이 입력될때까지 연속적으로 숫자 입력 받기.");
		System.out.print("입력 >> ");
		int number = sc.nextInt();
		
		// number가 -1이 아닐때 count 1증가, 입력받은 값 누적
		while(number != -1) {
			count++;
			total += number;
			number = sc.nextInt();
		}
		System.out.println("입력 끝");
		
		// 평균을 소숫점 자리까지 나타내기위해 double형으로 형변환 후 계산
		avg = (double)total/count;
		System.out.printf("정수의 개수는 %d개, 평균은 %.1f\n",count, avg);
	}
	
	public static void main(String[] args) {
		// 단어를 입력 받는 프로그램 구현.
		// "끝"이라고 입력 될때까지 단어를 계속 입력 받는다.
		// 입력 된 단어들 중에서 가장 긴 단어를 출력한 프로그램을 while문을 이용해서 구현하라.
		
		String str = "";
		
		System.out.println("\"끝\"이 입력될때까지 연속적으로 단어 입력 받기.");
		System.out.print("입력 >> ");
		str = sc.next();
		// 길이가 최대인 문자열을 저장하기 위한 String 객체 mlong 선언
		String mlong ="";
		
		while(!str.equals("끝")) {
			
			// 입력받은 문자열의 길이와 현재 최대길이의 문자열의 길이를 비교하여
			// 입력받은 문자열의 길이가 더 길면 mlong을 입력받은 문자열로 저장
			if(str.length()>mlong.length()) {
				mlong = str;
			}
			str = sc.next();
			
		}
		System.out.println("입력 끝");
		System.out.printf("가장 긴 단어는 %d글자의 \"%s\" 입니다.",mlong.length(), mlong);
	}

}
