package day1224.ex02;

class Shape{
	public Shape next;
	public Shape() { next = null;}
	
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	@Override
	public void draw() {
		super.draw();
		System.out.println("Line");
	}
}

class Rect extends Shape{
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}
public class ExOverriding {
	static void paint(Shape p) {
		p.draw(); // p가 가리키는 객체 내에 오버라이딩된 draw() 호출 (동적 바인딩)
	}
	public static void main(String[] args) {
		Line line = new Line();
		
		Shape p =new Shape();
		p.draw();
		line.draw();
		p.draw();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}

}
