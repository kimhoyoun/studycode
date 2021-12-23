package test;

import java.util.Scanner;

// 1.처음에 플레이어 클래스만들기
// 2.플레이어 클래서 멤버 변수 및 메서드 정의하기
// 3.이름 입력 - 반복문사용 
// 4.게임 시작하고 단어 입력 - 무한루프(while) 탈출조건생각해서 break;
//   - while 문안에서 해야할것
//		단어비교 - 메서드 사용
//		이전단어 최신화
// 		배열 인덱스가 초과되면 에러니까 다시 0부터 플레이어수-1이면 다시 0 처음에 비교? 마지막비교? => 마지막비교. 
//

public class WordGameApp {
	static Scanner sc = new Scanner(System.in);
	
	public static void run() {
		
		System.out.println("끝말잇기 게임을 시작합니다....");
		System.out.print("게임에 참가하는 인원은 몇명입니까?? >> ");
		int num = sc.nextInt();
		Player[] player = new Player[num];
		
		
		for(int i=0; i< num; i++) {
			System.out.print("참가자의 이름을 입력하세요 >> ");
			player[i] = new Player(sc.next());
		}
		
		String prevword = "아버지";
		
		System.out.printf("시작하는 단어는 %s입니다\n",prevword);
		int i =0;
		while(true) {
			System.out.printf("%s >>",player[i].getName());
			player[i].word = sc.next();
						
			if(!player[i].checkSuccess(prevword)) {
				System.out.printf("%s가 졌습니다.\n",player[i].getName());
				break;
			}
				
			prevword = player[i].word;
			
			// 사람수만큼 돌아야돼서 i값 변경
			if(i>=player.length-1) {
				i = 0;
			}else {
				i++;				
			}
			
		}
		System.out.println("게임종료!");
	}

	
	public static void main(String[] args) {
		run();
	}
}
