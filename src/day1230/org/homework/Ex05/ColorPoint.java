package day1230.org.homework.Ex05;

import java.awt.Color;

public class ColorPoint extends Point {
	String color;
	
	public ColorPoint() {
//		super(0,0);
//		this.color = "BLACK";
		this(0,0,"BLACK");
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	private void setColor(String color) {
		this.color = color;
	}
	
	private void setXY(int x, int y) {
		super.move(y, y);
	}
	
	@Override
	public String toString() {
		// 객체를 사용하면 자동으로 호출 된다.
		return String.format("%s색의 (%d,%d)의 점", color, getX(), getY());
	}
	
	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK
		System.out.println(zeroPoint + "입니다.");
		
		test01(null);
	}
	
	public static void test01(String[] args) {
		ColorPoint cp = new ColorPoint(5,5,"YELLO");
		cp.setXY(10,10);
		cp.setColor("RED");
		System.out.println(cp+"입니다.");
	}
	
}

	
