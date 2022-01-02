package day1231.org.homework.training.ex01;

public class MyPoint {
	int x, y;
	public MyPoint() {
		this(0, 0);
	}
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object obj) {
		MyPoint p = (MyPoint) obj;
		if(x == p.x && y == p.y) {
			return true;
		}else
			return false;
	}
	
	@Override
	public String toString() {
		return String.format("Point(%d,%d)", x,y);
	}
	
	public static void main(String[] args) {
		MyPoint p = new MyPoint(3,50);
		MyPoint q = new MyPoint(4,50);
		System.out.println(p);
		if(p.equals(q))
			System.out.println("같은 점");
		else
			System.out.println("다른 점");
	}
}
