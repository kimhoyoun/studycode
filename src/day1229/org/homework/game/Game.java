package day1229.org.homework.game;

public class Game {
	// bear 객체 생성(처음 위치 0,0)
	public static GameObject bear;
	
	// Fish 객체 생성 (처음 위치 랜덤)
	static int n1,n2;
	public static GameObject fish;
	static int bx, by, fx, fy;
	
	static {
		bear = new Bear(0,0,1);
		n1 = (int)(Math.random()*20);
		n2 = (int)(Math.random()*10);
		fish = new Fish(n1,n2,1);
		
		bx = bear.getX();
		by = bear.getY();
		fx = fish.getX(); 
		fy = fish.getY();
	}
	
	public void print() {
		for(int i=0; i<10; i++) {
			for(int j =0; j<20; j++) {
				if((bx==j)&&(by==i)) {
					System.out.print(bear.getShape());
					continue;
				}
				if((fx==j)&&(fy==i)) {
					System.out.print(fish.getShape());
					continue;
				}
				System.out.print("-");
				
			}
			System.out.println();
		}
	}
	
	
	public void run() {
		System.out.println("** Bear의 Fish 먹기 게임을 시작합니다.**");
		int n = 1;
		while(true) {
			print();
			
			bear.move();
			if(n == 2 || n == 5) {
				fish.move();
			}
			
			
			bx = bear.getX();
			by = bear.getY();
			fx = fish.getX(); 
			fy = fish.getY();
			
			if((bx==fx)&&(by==fy)) {
				print();
				System.out.println("Bear Wins!!");
				System.exit(0);
			}
			if(n == 5) {
				n = 1;
			}else {
				n++;
			}
				
		}
	}
	
	
}
