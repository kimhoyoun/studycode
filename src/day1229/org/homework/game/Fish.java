package day1229.org.homework.game;

public class Fish extends GameObject{
	int count = 0;
	
	public Fish(int startX, int startY, int distance) {
		super(startX, startY, distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void move() {
		
		int m = (int)(Math.random()*4+1);
	
		switch(m) {
		case 1:
			if(x == 0) {
				return;
			}
			x-=1;
			break;
			
		case 2:
			if(y==9) {
				return;
			}
			y+=1;
		case 3:
			if(x==19) {
				return;
			}
			x+=1;
		case 4:
			if(y==0) {
				return;
			}
			y-=1;
		default : break;
		}
		
	}
		
	

	@Override
	protected char getShape() {
		// TODO Auto-generated method stub
		return '@';
	}

}
