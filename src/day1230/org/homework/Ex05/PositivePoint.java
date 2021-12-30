package day1230.org.homework.Ex05;

public class PositivePoint extends Point {
	
	public PositivePoint() {
		this(0,0);
	}
	
	public PositivePoint(int x, int y) {
		super(x, y);
		if(x<0||y<0) {
			super.move(0, 0);
		}
	}

	@Override
	protected void move(int x, int y) {
		if(x>=0 && y>=0) {
			super.move(x, y);			
		}
	}
	public static void main(String[] args) {
		
	}

}
