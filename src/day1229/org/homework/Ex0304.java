package day1229.org.homework;

import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src);

	abstract protected String getSrcString();

	abstract protected String getDestString();

	protected double ratio; // 비율

	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + getDestString() + "입니다");
		scanner.close();
	}
}

// Ex03
class Won2Dollar extends Converter {
	public Won2Dollar(int ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		return src / ratio;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "원";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "달러";
	}

}

// Ex04
class Km2Mile extends Converter {

	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src / ratio;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "Km";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "mile";
	}

}

public class Ex0304 {

	public static void main03(String[] args) {
		// Ex03
		Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
		toDollar.run();

	}

	public static void main04(String[] args) {
		// Ex04
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}
}
