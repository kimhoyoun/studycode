package day1223.ch05.ex02;

class AAA extends Object{
	private int privateData;
	int defaultData;
	protected int protectedData;
	public int publicData;
}

class BBB extends AAA{
	public void set() {
		// private 멤버는 서브 클래스에 상속 x
//		privateData = 10;
		// 다른 패키지의 클래스에 있는 default 멤버는 접근 x
		defaultData = 100;
		protectedData = 100;
		publicData = 100;
	}
}
public class Ch05Ex02 {

	public static void main(String[] args) {
		AAA aaa = new AAA();
		System.out.println(aaa.toString());
	}

}
