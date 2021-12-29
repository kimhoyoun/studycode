package day1229.org.homework;

public class Ex01 {
	public static void main01(String[] args) {
//		1. 
//		(1) int a, public void set(int a)
//		(2) int a, public void set(int a), int b, int c
//		(3) int a, public void set(int a), int b, int c, int d, int e
//		(4) 1
	}

	public static void main02(String[] args) {
//		2. 1
	}

	public static void main03(String[] args) {
		// Ex03_pencil class
	}

	public static void main04(String[] args) {
//		4. 서브 클래스, extends, super, istanceof, interface
	}

	public static void main05(String[] args) {
//		5. 2
	}

	public static void main06(String[] args) {
//		6. 
//		extends
//		super(size);
	}

	public static void main07(String[] args) {
//		7.
//		A
//		B: 11

	}

	public static void main08(String[] args) {
//		8.
//		class B의 생성자와 짝을 이룰 기본 생성자가 class A에 없다.
//		해결
//		1) public B() { super(0); b = 0;}
//		or 
//		2) class A{
//			....
//			public A() {
//				a = 0;
//			}
//		
//		}
		
	}

	public static void main09(String[] args) {
//		9.
//		1번 : void f() 를 abstract void f()로 수정
//		2번 : 오류 x
//		3번 : C 클래스에서 void f()를 재정의 해야한다.
//			  C 클래스 앞에 abstract를 붙여 추상 클래스로 만든다
//		4번 : C 클래스에서 B한테 상속받은 f()를 재정의 할 때
//		      반환형을 일치 시켜야 한다.
	}

	public static void main10(String[] args) {
		
//		@Override
//		public boolean isOdd() {
//			if(n()%2 == 1) {
//				return true;
//			}else {
//				return false;
//			}
//		}
//		를 추가해 준다.
	}

	public static void main11(String[] args) {
//		11.
//		(1) 2, 3
		
//		(2) true 
//			false
		
//		(3) true
//			true
	}

	public static void main12(String[] args) {
//		12
//		(1) Circle
//		(2) this.draw();
//		(3) super.draw();
	}

	public static void main13(String[] args) {
//		13
//		(1) 2, 4
//		(2) 
//		@Override
//		public void paint() {
//			System.out.println("반지름="+radius);
//		}
	}

	public static void main14(String[] args) {
//		14.	4
	}

	public static void main15(String[] args) {
//		15. 2
	}

	public static void main16(String[] args) {
//		16. 
//		interface
//		implements
//		@Override
//		public void on() {
//			System.out.println("켜졌습니다.");
//		}
//		@Override
//		public void off() {
//			System.out.println("종료합니다.");
//		}
//		public void watch() {
//			System.out.println("방송중입니다.");
//		}
	}
}
