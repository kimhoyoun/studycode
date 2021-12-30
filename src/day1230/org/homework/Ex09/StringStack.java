package day1230.org.homework.Ex09;

import java.util.Scanner;

interface Stack{
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}

public class StringStack implements Stack{
	private int top = 0;
	private String[] stack;
	
	public StringStack(int num) {
		stack = new String[num];
	}
	
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return top;
	}

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return stack.length;
	}

	@Override
	public String pop() {
		if(top-1<0) return null;
		
		return stack[--top];
	}

	@Override
	public boolean push(String val) {
		if(top >= capacity()) {
			return false;
		}
		stack[top++] = val;
		
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("스택의 용량을 입력해 주세요 >> ");
		int cap = sc.nextInt();
		
		StringStack stack = new StringStack(cap);
		
		while(true) {
			System.out.print("문자열 입력 >> ");
			String str = sc.next();
			
			if(str.equals("그만")) {
				break;
			}
			if(!stack.push(str))
				System.out.println("더이상 스택에 저장할 수 없습니다!");

		}
		sc.close();
		System.out.print("스택에 저장된 모든 문자열 팝 : ");

		while(true) {
			String str = stack.pop();
			if(str == null) {
				break;
			}
			System.out.print(str+ " ");
		}
		System.out.println();
	}
}
