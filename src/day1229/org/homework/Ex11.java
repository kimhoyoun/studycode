package day1229.org.homework;

import java.util.Scanner;

abstract class Calc{
	int a, b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	abstract int calculate();
}
class Add extends Calc{
	@Override
	int calculate() {
		return a+b;
	}
}
class Sub extends Calc{
	@Override
	int calculate() {
		return a-b;
	}
}
class Mul extends Calc{
	@Override
	int calculate() {
		return a*b;
	}
}
class Div extends Calc{
	@Override
	int calculate() {
		return a/b;
	}
}
public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char c = sc.next().charAt(0);
		
		Calc cal;
		
		switch(c) {
		case '+': 
			cal = new Add();
			cal.setValue(a,b);
			System.out.println(cal.calculate());
			break;
		case '-': 
			cal = new Sub();
			cal.setValue(a,b);
			System.out.println(cal.calculate());
			break;
		case '*': 
			cal = new Mul();
			cal.setValue(a,b);
			System.out.println(cal.calculate());
			break;
		case '/': 
			cal = new Div();
			cal.setValue(a,b);
			System.out.println(cal.calculate());
			break;
		}
	}

}
