package day1229.org.homework;

import java.util.Arrays;
import java.util.Scanner;

interface Stack{
	int length(); // 현재 스택에 저장된 개수 리턴
	int capacity(); // 스택의 전체 저장 가능한 개수 리턴
	String pop(); // 스택의 톱(top)에 실수 저장
	boolean push(String val); // 스택의 톱(top)에 저장된 실수 리턴
}

class StringStack implements Stack{
	private int top =0; // 저장된 수
	private String[] list; // 스택을 저장할 배열선언
	
	public StringStack() {
		
	}
	public StringStack(int capacity) {
		list = new String[capacity];
	}
	
	@Override
	public int length() {
		return top;
	}

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return list.length;
	}

	@Override
	public String pop() {
		
		if(top-1<0) {
			return null;
		}
		return list[--top];			
		
	}

	@Override
	public boolean push(String val) {
		if(top>=capacity()) {
			return false;
		}else {
			list[top++] = val;
			return true;
		}
	}

	
}
public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int cap = sc.nextInt();
		StringStack s = new StringStack(cap);
		
		while(true) {
			System.out.print("문자열 입력 >> ");
			String str = sc.next();
			
			if(str.equals("그만")) {
				break;
			}
			
			if(!s.push(str)) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		while(true) {
			String str = s.pop();
			if(str == null) {
				break;
			}
			System.out.print(str+ " ");
		}
		System.out.println();
	}
}
