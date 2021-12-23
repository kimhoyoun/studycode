package day1222.homework;

import java.util.Scanner;

// 좌석 정보를 나타내는 Seat class
class Seat{
	// 좌석 이름
	String seatName;
	// 전체 자릿수
	int max = 10;
	// 예약자 수
	int res = 0;
	// 예약자 이름
	String name;
	// 예약자에게 번호부여할 String 배열
	String[] nameArr = new String[max];
	Scanner sc = new Scanner(System.in);
	
	// 좌석 이름을 매개변수로 받는 Seat class 생성자
	Seat(String seatName){
		this.seatName = seatName;
	}
	
	// 좌석 예약
	public void reservation() {
		// 좌석이 모두 차면 메세지 출력
		if(res == max) {
			showSeat();
			System.out.println("해당 좌석은 예약이 모두 완료되었습니다.");
			return;
		}
		
		// 좌석 현황 출력
		showSeat();
		System.out.print("이름 >> ");
		name = sc.next();
		System.out.print("번호 >> ");
		int num = sc.nextInt();
		// 입력받은 번호-1번 방에 name 저장 
		nameArr[num-1] = name;
		
		// 예약인원 1증가
		res++;
		System.out.println("예약이 완료되었습니다!");
		}
	
	// 조회
	public void showSeat() {
		System.out.printf("%s>> ",seatName);
		for(int i=0; i<10; i++) {
			// 좌석에 예약이없으면 ---출력, 있으면 이름 출력
			if(nameArr[i]!=null) {
				System.out.printf("%s ",nameArr[i]);
			}else {
				System.out.print("--- ");									
			}
		}
		System.out.println();
	}
	
	// 취소
	public void canSeat() {
		int index =-1;
		// 좌석 현황 출력
		showSeat();
		System.out.print("이름 >> ");
		name = sc.next();
		for(int i =0; i<nameArr.length; i++) {
			// 이름 일치 시 그때의 인덱스 저장
			if(name.equals(nameArr[i])) {
				index = i;
			}
		}
		
		// 이름이 없다면 알림메세지
		if(index == -1) {
			System.out.printf("%s는 %s좌석에 예약하지 않았습니다.\n",name, seatName);
		}else {
			// 이름 일치하는 좌석 공석처리
			nameArr[index] =null;
			System.out.printf("%s님 예약이 취소 되었습니다.\n",name);
		}
	}
}

// 콘서트 class
class Concert {
	Scanner sc = new Scanner(System.in);
	int num;
	String concertName;
	// S, A, B 좌석 생성
	Seat seatS = new Seat("S");
	Seat seatA = new Seat("A");
	Seat seatB = new Seat("B");
	
	Concert(String concertName){
		this.concertName = concertName;
		System.out.printf("%s콘서트홀 예약 시스템입니다.\n",concertName);
	}
	
	// 프로그램 시작
	public void run() {
		while(true) {
			System.out.printf("예약: 1, 조회: 2, 취소: 3, 끝내기: 4 >> ");
			num = sc.nextInt();
			switch(num) {
			case 1: reservation(); break;
			case 2: lookUp(); break;
			case 3: cancel(); break;
			case 4: end(); break;
			}
		}
	}
	
	// 예약
	public void reservation() {
		System.out.print("좌석구분 S(1), A(2), B(3) >> ");
		num = sc.nextInt();
		switch(num) {
		case 1 : seatS.reservation(); break;
		case 2 : seatA.reservation(); break;
		case 3 : seatB.reservation(); break;
		}
	}

	public void lookUp() {
		seatS.showSeat();
		seatA.showSeat();
		seatB.showSeat();
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}

	public void cancel() {
		System.out.print("좌석 S: 1, A: 2, B: 3 >> ");
		num = sc.nextInt();
		switch(num) {
		case 1 : seatS.canSeat(); break;
		case 2 : seatA.canSeat(); break;
		case 3 : seatB.canSeat(); break;
		}
	}

	public void end() {
		System.out.println("프로그램 종료");
		System.exit(0);
	}

}

// 메인 class
public class ReservationEx {

	public static void main(String[] args) {
		Concert concert = new Concert("명품");
			concert.run();			
	}
}
