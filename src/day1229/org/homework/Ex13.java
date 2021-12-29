package day1229.org.homework;

interface Ex13_Shape {
	final double PI = 3.14;							// 상수
	void draw();									// 도형을 그리는 추상 메소드
	double getArea();								// 도형의 면적을 리턴하는 추상 메소드
	default public void redraw() {					// 디폴트 메소드
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}

class Ex13_Circle implements Ex13_Shape{
	int r;
	
	public Ex13_Circle() {
		
	}
	
	public Ex13_Circle(int r) {
		this.r = r;
	}
	
	@Override
	public void draw() {
		System.out.println("Circle");
	}

	@Override
	public double getArea() {
		return r*r*PI;
	}
	
}
public class Ex13 {

	public static void main(String[] args) {
		Ex13_Shape donut = new Ex13_Circle(10); // 반지름 10인 원 객체
		donut.redraw();
		System.out.println("면적은 "+donut.getArea());
	}

}
