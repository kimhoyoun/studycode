package day1215;

import java.io.IOException;
import java.util.Scanner;

public class Ex02_UpDown {
	
	static Scanner sc = new Scanner(System.in);
	
	static int getNum() {
		int num = 0;
		int ch = 0;
		try {
			while ((ch=System.in.read()) != '\n') {
				if(ch>='0'&& ch<='9') {
					num = num*10 +ch -'0';
				}
			}
		} catch (IOException e) {}
		return num;
	}
	
	// 정수 a와 b를 비교하는 compare() 함수
	public static int compare(int a, int b) {
		if(a == b) {
			return 0;
		} else if (a<b) {
			return 1;
		} else {
			return -1;
		}
	}
	// game()이 종료되었을 때 
	// 도전횟수(cnt)값을 확인해 실격인지 정답을 맞췄는지 판단하는 status() 함수
	static void status(int cnt) {
		if(cnt == 0) {
			System.out.println("기회를 모두 소진 했다. 실격 !");
		}
	}
	
	// 입력받은 userNum의 유효성 체크하는 함수
	static int getUserNum(int min, int max) {
		System.out.printf("사용자 입력(%d ~ %d사이) >>> ",min, max);
		int userNum = getNum();
		
		// 입력받은 userNum의 유효성 체크
		while(userNum<min||userNum>max) {
			System.out.println("입력 범위를 벗어 났습니다.");
			System.out.printf("다시 입력(%d ~ %d사이) >>> ",min, max);
			userNum = getNum();
		}
		
		return userNum;
	}
	public static void game() {
		// 컴퓨터가 1 ~ 100 사이의 랜덤한 숫자(난수) 선택 
		// 사용자가 5회 안에 맞추기
		int min =1, max = 100;
		int cnt = 5;
		int sysNum = (int)(min + Math.random()*100);
		System.out.println("시스템이 난수를 선택 했습니다.("+sysNum+")");
		
		// 도전횟수(cnt)가 남아있으면 while()문 실행
		while(cnt>0) {
			// 사용자가 입력 받아서 비교하기
			System.out.println("남은 시도 횟수 "+cnt);
			
			// 사용자가 입력한 값이 범위에 맞는지 확인하고
			// 유효한 값이면 그 값을 반환하는 getUserNum()을 사용하여 userNum 초기화
			int userNum = getUserNum(min, max);
			
			// 사용자가 입력한 수와 랜덤으로 설정된 수를 비교하여
			// 결과를 출력 (맞으면 0, 낮으면-1, 높으면 1)
			int result = compare(sysNum,userNum);
			
			// result 값을통해 사용자가 입력한 수가 어떤지 콘솔창에 출력
			// 맞았을 땐 while문 종료, 다를땐 상황 알려주고 max, min 값 변경
			if (result == 0) {
				System.out.println("빙고!");
				break;
			}
			else if(result == 1) {
				// 너무 큰 숫자 입력 -> max의 범위 변경
				System.out.println("너무 큰 숫자입니다!");
				max = userNum-1;
			}else {
				// min 범위 변경
				System.out.println("너무 작은 숫자입니다!");
				min = userNum+1;
			}
			// while문 한번 반복 될 때 마다 반복횟수 1씩 차감
			cnt--;
		} // end of while
		
		// 맞추고 나온건가? cnt가 다되어서 나온건가?
		// cnt가 0이면 맞추고 나온것, 0이 아니면 그냥 실격!
		status(cnt);
	}
	
	public static void main(String[] args) {
		// 높다 낮다 게임 (카드 맞추기)
		// 컴퓨터가 1 ~ 100 사이의 랜덤한 숫자(난수) 선택
		// 사용자가 5회 안에 맞추기
		// 재시도 가능하게 구현
		// --- 입력 된 숫자가 맞나? 틀리나? 판별
		// --- 맞으면 빙고, 틀리면 작다/크다를 출력
		
		// res
		// 0 : 같음
		// 1 : 뒤가 큼
		// 2 : 뒤가 작음
		
		while(true) {
			System.out.println("--- 게임 시작 ---");
			game();
			
			// 게임 재시작 or 종료
			System.out.print("계속 하시겠습니다?(y/n) >> ");
			char isLoop = sc.next().charAt(0);			
			
			// 유효성 평가
			while(!(isLoop == 'n'||isLoop =='y')) {
				System.out.println("y또는 n만 입력하세요!");
				System.out.print("계속 하시겠습니다?(y/n) >> ");
				isLoop = sc.next().charAt(0);				
			}
			
			if(isLoop=='n') {
				break;
			}
		}
		System.out.println("수고했습니다!!!");
	}

}
