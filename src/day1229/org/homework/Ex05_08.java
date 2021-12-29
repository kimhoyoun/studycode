package day1229.org.homework;

// Ex05
//class Point{
//	private int x, y;
//	public Point(int x, int y) {
//		this.x =x;
//		this.y = y;
//	}
//	public int getX() {
//		return x;
//	}
//	public int getY() {
//		return y;
//	}
//	
//	protected void move(int x, int y) {
//		this.x = x; 
//		this.y = y;
//	}
//}
//
//class ColorPoint extends Point{
//	String color;
//	public ColorPoint(int x, int y, String color) {
//		super(x, y);
//		this.color = color;
//	}
//	
//	public void setXY(int x, int y) {
//		move(x,y);
//	}
//	public void setColor(String color) {
//		this.color = color;
//	}
//	
//	@Override
//	public String toString() {
//		return color+"색의 ("+getX()+","+getY()+")의 점";
//	}
//}

// Ex06
class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x =x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	protected void move(int x, int y) {
		this.x = x; 
		this.y = y;
	}
}

class ColorPoint extends Point{
	String color = "BLACK";
	
	public ColorPoint() {
		super(0,0);
	}
	
	public ColorPoint(int x, int y) {
		super(x,y);
	}
	
	public void setXY(int x, int y) {
		move(x,y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return color+"색의 ("+getX()+","+getY()+")의 점";
	}
}

// Ex07
class Point3D extends Point{
	int z;
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}
	public void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	
	public void moveUp() {
		z++;
	}
	
	public void moveDown() {
		z--;
	}

	@Override
	public String toString() {
		return "("+getX()+","+getY()+","+getZ()+")의 점";
	}
	
	
}

// Ex08
class PositivePoint extends Point{
	public PositivePoint() {
		super(0,0);
	}
	
	public PositivePoint(int x, int y) {
		super(x, y);
		if(x<0||y<0) {
			super.move(0, 0);
		}
	}
	
	@Override
	protected void move(int x, int y) {
		if(x>0&&y>0) {
			super.move(x,y);
		}
	}

	@Override
	public String toString() {
		return "("+getX()+","+getY()+")의 점";
	}
	
}
public class Ex05_08 {

	public static void main05(String[] args) {
//		ColorPoint cp = new ColorPoint(5,5,"YELLOW");
//		cp.setXY(10,20);
//		cp.setColor("RED");
//		String str = cp.toString();
//		System.out.println(str+"입니다.");
		
	}
	
	public static void main06(String[] args) {
		ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint cp = new ColorPoint(10,20);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}
	
	public static void main07(String[] args) {
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp(); // z 축으로 위쪽 이동
		System.out.println(p.toString() + "입니다.");
		
		p.moveDown(); // z 축으로 아래쪽 이동
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(100,200,300);
		System.out.println(p.toString() + "입니다.");
	}
	
	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(-5, 5); // 객체 p는 음수 공간으로 이동되지 않음.
		System.out.println(p.toString() + "입니다.");
		
		PositivePoint p2 = new PositivePoint(-10,-10);
		System.out.println(p2.toString() + "입니다.");
		
		
	}
}
