package day220105.org.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ch08Ex01_2 {
	
	// 문자열 입력
	public static String getLine() {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			return br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	// 숫자 입력
	public static int getNum() {
		String s = getLine();
		StringBuffer s2 = new StringBuffer();
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			// 음수도 받음.
			if(Character.isDigit(ch)||ch == '-') {
				s2.append(ch);
			}
		}
		
		return Integer.parseInt(s2.toString());
	}
	
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("주소 입력 : ");
		String name = getLine();
		System.out.print("나이 입력 : ");
		int age = getNum();
		
		System.out.println(name);
		System.out.println(age);
		
		
	}

}
