package day220103.org.training;

import java.util.Scanner;

abstract public class Ex {
	static public Scanner sc = new Scanner(System.in);
	abstract public void run();
	public void start() {
		System.out.println("----- 예제 실행 -----");
		run();
	}
}
