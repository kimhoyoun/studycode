package day220105.org.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ch08Ex01 {
	
	public static String getLine(){
		// 특수문자를 받아오기위해 InputStreamReader를 
		// BufferedReader로 한번더 감싸준다.
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			return br.readLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return null;
	
	}
	public static int getNum() {
		String s = getLine();
		StringBuffer s2 = new StringBuffer();
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='0'&&ch<='9'||ch=='-') {
				s2.append(ch);
			}
		}
		return Integer.parseInt(s2.toString());
	}
	
	public static void main(String[] args) {
		System.out.print("주소 입력 : ");
		String addr = getLine();
		System.out.print("나이 입력 : ");
		int age = getNum();
		
		System.out.println("입력된 나이는 "+addr);
		System.out.println("입력된 나이는 "+age);
	}
	public static void main01(String[] args) {
		Scanner sc = new Scanner("우리나라 대한민국 마세 나라 사랑 가족 사랑");
	
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		
	
	}

}
