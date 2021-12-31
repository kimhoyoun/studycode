package day1231.org.homework;

public class Practice {
	public static void main01(String[] args) {
//		1.
//		(1) 다른 패키지에 작성된 클래스를 사용할 대 import문 사용
//			컴파일러에게 그 클래스 경로를 알려주는 문이다.
//		(2) import java.util.Random은 Random 클래스의 경로명만 포함하고
//			import java.util.*은 패키지 내 모든 클래스를 포함함.
//		(3) 사용하고자 하는 클래스 경로를 모두 입력하면 사용할 수 있다.
//		(4) java.lang 패키지에 속한 클래스들은 import 없이도 사용할 수 있다. 
//			java.lang 패키지에 속한 클래스들로는 Object, String, Math, System
	}

	public static void main02(String[] args) {
//		2. 4번
	}

	public static void main03(String[] args) {
//		3. 
//		public class ParacticeEx03 {
//			public static void main(String[] args) {
//				java.util.StringTokenizer st = new java.util.StringTokenizer("a=3,b=5,c=6", ",");
//				while(st.hasMoreTokens()){
//					System.out.println(st.nextToken());
//				}
//			}
//		}

	}

	public static void main04(String[] args) {
//		4.
//		public class ParacticeEx03 {
//			public static void main(String[] args) {
//				java.util.StringTokenizer st = new java.util.StringTokenizer("a=3,b=5,c=6", ",=");
//				int sum = 0;
//				while(st.hasMoreTokens()){
//					String token = st.nextToken();
//					System.out.println(token);
//					char c = token.charAt(0);
//					if(Character.isDigit(c)) {
//						sum += Integer.parseInt(token);
//					}
//				}
//				System.out.println("합은 "+sum);
//			}
//		}
	}

	public static void main05(String[] args) {
//		5.
//		(1) package device;
//		(2) package app;
//			import device TV;
//		(3) device.TV.class
//			app.Home.class
	}

	public static void main06(String[] args) {
//		6.
//		(1) String s1 = Integer.toString(20);
//		(2)	double d = Double.parseDouble("35.9");
//		(3) boolean b = Boolean.parseBoolean("true");
//		(4) String s2 = Integer.toBinaryString(30);
//		(5) String c = Character.toString('c');
	}

	public static void main07(String[] args) {
//		7.
//		String a= "가나다라";
//		System.out.println(a == "가나다라");
		// 결과 : true
		// "가나다라" 문자열은 스트링 리터럴 테이블에 저장되고,
		// String a의 레퍼런스 a는 리터럴 테이블을 가리키므로
		// "가나다라" 문자열의 레퍼런스와 레퍼런스 a의 값은 일치하므로 true 반환
		
//		String b = new String(a);
//		System.out.println(a==b);
		// new String에 의해 생성된 객체는 힙에 생성되므로 String b는 힙영역을 가리킴
		// 그러므로 a와 b의 레퍼런스 값은 서로 달라서 false 반환
	}

	public static void main08(String[] args) {
//		8.
//		a : "      Oh,  Happy      "
//		b : "Oh, Happy"
//		c : "Oh, Happy Day."
	}

	public static void main09(String[] args) {
//		9.
//		(1) b
//		(2) c, e
	}

	public static void main10(String[] args) {
//		(1) 3.14를 Double.valueOf(3.14)로 처리(auto boxing)
//		(2) Double형 Warapper 객체의 PI값을 double형 pi에 저장(auto unboxing)
//		(3) Integer.valueOf(5)를 int형 5로 auto unboxing해서 3과 더한값을 출력
//		(4) Character.valuOf('c')를 auto unboxing해서 'c'와 비교 후 참값 반환
	}

	public static void main11(String[] args) {
//		11
//		(1) (int)(100+Math.random()*156)
//		(2) new Random().nextInt(156)+100
	}

	public static void main12(String[] args) {
//		12.
//		Calendar date = Calendar.getInstance();
//		date.clear();
//		date.set(Calendar.YEAR,2020);
//		date.set(Calendar.MONTH, 12);
//		date.set(Calendar.DATE, 25);
//		System.out.println("약속 날짜는 "+date.get(Calendar.YEAR)+"년 "+(date.get(Calendar.MONTH)+1)+"월 "+ date.get(Calendar.DATE)+"일");
	}

}
