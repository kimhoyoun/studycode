package day1229.org.homework.game;

public class Bear extends GameObject{
	
	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@Override
	protected void move() {
		System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
		char m = sc.next().charAt(0);
	
		switch(m) {
		case 'a':
			if(x == 0) {
				System.out.println("더이상 왼쪽으로 갈 수 없습니다. 다시 선택");
				move();
			}
			x-=1;
			break;
		case 's':
			if(y==9) {
				System.out.println("더이상 아래로 갈 수 없습니다. 다시 선택");
				move();
			}
			y+=1;
			break;
		case 'd':
			if(y==0) {
				System.out.println("더이상 위로 갈 수 없습니다. 다시 선택");
				move();
			}
			y-=1;
			break;
		case 'f':
			if(x==19) {
				System.out.println("더이상 오른쪽으로 갈 수 없습니다. 다시 선택");
				move();
			}
			x+=1;
			break;
		default : System.out.println("잘못입력했습니다. 다시 선택!"); 
				move();
			}
		
	}

	@Override
	protected char getShape() {
		return 'B';
	}

}
