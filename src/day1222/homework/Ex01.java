package day1222.homework;

public class Ex01 {

	public static void main01(String[] args) {
//		1. 4
	}

	public static void main02(String[] args) {
//		2. 4
	}

	public static void main03(String[] args) {
//		3. 3
	}

	public static void main04(String[] args) {
//		4. 2
	}

	public static void main05(String[] args) {
//		5. 1
	}

	public static void main06(String[] args) {
//		6. 
//		(1)
//		Class TV{
//			private int size;
//			private String manufacturer;
//			public TV() {
//				this(32,"LG");
//			}
//			public TV(String manufacturer) {
//				this(32,manufacturer);
//			}
//			public TV(int size, String manufacturer) {
//				this.size = size;
//				this.manufacturer = manufacturer;
//				System.out.println(size + "인치 "+manufacturer);
//			}
//		}
//		(2)
//		new TV();  => 32인치 LG
//		new TV("삼성");  => 32인치 삼성
		
//		(3)
//		new TV(65,"삼성");
		
//		(4)
//		코드 재사용 감소
	}

	public static void main07(String[] args) {
//		7. 
//		private int age의 setter메소드를 만들어서 age값을 매개변수로 하여 값을 저장하고
//		public void setAge(int age) {
//			this.age = age;
//		}
//		getter메소드를 만들어서 age의 값을 반환받는다.
//		public int getAge() {
//			return age;
//		}
	}

	public static void main08(String[] args) {
//		8.
//		(1)
//		Class Power{
//			public int kick;
//			public int punch;
//			
//			public Power() {
//				
//			}
//			
//			public Power(int kick, int punch) {
//				this.kick = kick;
//				this.punch = punch;
//			}
//		}
//		public class Example{
//			public static void main(String[] args) {
//				Power robot = new Power(10,20);
//			}
//		}
//		(2)
//		Class Power{
//			private int kick;
//			private int punch;
//			
//			public void setKick(int kick) {
//				this.kick = kick;
//			}
//			public int getKick() {
//				return kick;
//			}
//			
//			public void setPunch(int punch) {
//				this.punch = punch;
//			}
//			
//			public int getPunch() {
//				return punch;
//			}
//		}
//		public class Example{
//			public static void main(String[] args) {
//				Power robot = new Power();
//				robot.setKick(10);
//				robot.setPunch(20);
//			}
//		}
	}

	public static void main09(String[] args) {
//		9.
//		소멸시킬수, 다행한, 레퍼런스, 가비지, 가비지컬렉션, System.gc()
	}

	public static void main10(String[] args) {
//		10.
//		(1) 
//		s가 가리키던 new String("Hello"+n);가 반복실행할수록 가비지 발생
//		(2)
//		가비지 발생하지 않음
	}

	public static void main11(String[] args) {
//		11. 4
		
	}

	public static void main12(String[] args) {
//		12. 1
	}

	public static void main13(String[] args) {
//		13. 
//		main이 static 타입이므로 f()함수를 static 타입으로 바꿔준다.
//		class Test{
//			static public int f(int a, int b) {
//				return a+b;
//			}
//		}
//		public static void main(String[] args) {
//			int sum = f(2,4);
//		}
	}

	public static void main14(String[] args) {
//		14. 
//		1) x++ : final이 붙은 변수는 변경되지 못한다.
//		2) extends Rect : final이 붙은 클래스는 상속받지 못한다.
//		3) public void f() {
//			System.out.println(super.x);
//		}
//		final이 붙은 메소드는 오버라이딩 되지 못한다.
	}

	public static void main15(String[] args) {
//		15.
//		가비지란 new 연산자를 이용하여 할당받아 사용하다 더이상 사용하지 않는 객체나 배열메모리
//		가비지 컬렉션
//		이유 : 가비지가 많아지면 가용 메모리가 줄어들어 프로그램 실행에 영향을 가비지를 제거해주는
//		가비지 컬렉션이 필요하다.
//		장점 
//		- 가비지를 줄여 가용 메모리의 양을 늘릴 수 있다.
//		단점
//		- 가비지가 제거되는 동안 프로그램이 멈춰 성능을 저하할 수 있다. 
	}

	public static void main16(String[] args) {
//					default		public		protected		private
//	같은 패키지 클래스	   o		  o				o  			   x
//	다른 패키지 클래스     x			  o 			x  			   x
	}
}
