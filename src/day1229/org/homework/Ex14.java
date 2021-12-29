package day1229.org.homework;


interface Ex14_Shape {
	final double PI = 3.14;							// 상수
	void draw();									// 도형을 그리는 추상 메소드
	double getArea();								// 도형의 면적을 리턴하는 추상 메소드
	default public void redraw() {					// 디폴트 메소드
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}

class Ex14_Circle implements Ex14_Shape{
	int r;
	
	public Ex14_Circle() {
		
	}
	
	public Ex14_Circle(int r) {
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

class Ex14_Oval implements Ex14_Shape{
	private int a, b;
	public Ex14_Oval() {
		
	}
	
	public Ex14_Oval(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public void draw() {
		System.out.printf("%dx%d에 내접하는 타원입니다.\n",a,b);
	}

	@Override
	public double getArea() {
		return PI*a*b;
	}
	
}

class Ex14_Rect implements Ex14_Shape{
	private int width, height;
	
	public Ex14_Rect() {
		
	}
	public Ex14_Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public void draw() {
		System.out.printf("%dx%d크기의 사각형 입니다.\n",width,height);
	}

	@Override
	public double getArea() {
		return width*height;
	}
	
}


public class Ex14 {

	public static void main(String[] args) {
		Ex14_Shape[] list = new Ex14_Shape[3];
		list[0] = new Ex14_Circle(10);
		list[1] = new Ex14_Oval(20,30);
		list[2] = new Ex14_Rect(10,40);
		
		for(int i =0; i<list.length; i++) 
			list[i].redraw();
		for(int i =0; i<list.length; i++) 
			System.out.println("면적은 " + list[i].getArea());
	}

}
	