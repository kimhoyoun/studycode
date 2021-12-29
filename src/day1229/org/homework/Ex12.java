package day1229.org.homework;

import java.util.Scanner;

abstract class Shape {
	private Shape next;

	public Shape() {
		next = null;
	}

	public void setNext(Shape obj) {
		next = obj;
	}

	public Shape getNext() {
		return next;
	}

	public abstract void draw();
}

class Line extends Shape {
	@Override
	public void draw() {
		System.out.println("Line");
	}

}

class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("Rect");
	}

}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

class GraphicEditor {
	public static Scanner sc = new Scanner(System.in);
	private Shape head, tail; // 처음과 끝의 값을 참조할 것

	public void run() {
		System.out.println("그래픽 에디터 beauty를 실행합니다.");
		while (true) {
		System.out.print("삽입(1), 삭제(2), 모두보기(3), 종료(4) >> ");
		int no = sc.nextInt();

			switch (no) {
			case 1: insert();break;
			case 2:	delete();break;
			case 3:	print();break;
			case 4:	System.out.println("beauty을 종료합니다."); System.exit(0);
			}
		}
	}
	
	public void insert() {
		Shape s; // 새로 만들 객체를 저장할 곳
		System.out.print("Line(1), Rect(2), Circle(3) >> ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : s = new Line(); break;
		case 2 : s = new Rect(); break;
		case 3 : s = new Circle(); break;
		default : System.out.println("잘못된 입력!"); return;
		}
		
		if(head == null) { // 처음 입력
			head = s; // 시작값에 저장 
			tail = s; // 끝값에 저장
		}else{
			tail.setNext(s); // 끝값의 다음 값에 저장
			tail = s; // 끝값이 s로 설정
		}
	}

	public void print() {
		Shape s; // draw() 실행할 것
		s = head; // 시작은 처음 값
		
		while(s != null) { // s의 값이 null이 아닐때까지 반복
			s.draw(); // s의 draw() 실행
			s = s.getNext(); // s의 다음값을 s에 저장 
							 // 루프가 반복될 때 마다 현재 draw실행하고
							 // 다음을 위해 현재값에 다음값을 참조
		}
	}
	
	public void delete() {
		System.out.print("삭제할 도형의 위치 >> ");
		int index = sc.nextInt();
		
		Shape prev, cur; // 이전값과 현재값을 참조할 Shape 타입 선언
		prev = head;
		cur = head; //시작값 부터 확인하기 위해 현재 head를 참조
		if(index == 1) { // 처음값을 삭제할 경우
			if(head==tail) { // 처음과 끝이 같다면 객체는 한개뿐. 
							 // 값이 하나라면 head(처음)와 tail(끝값)을 모두 삭제(null 참조)
				head = null;
				tail = null;
				return;
			}
			head = head.getNext(); // head가 참조하고있는 다음 값을 head로 설정
			return;
		}
		
		int i; // 위치를 나타낼 i 선언
		for(i = 1; i<index; i++) {
			prev = cur; // 루프가 도는 것을 예상해서 이전값을 현재값으로
			cur = cur.getNext(); // 현재값을 다음값으로
			if(cur == null) {
				// 생성된 객체 수가 삭제할 위치보다 작다면 cur은 null을 참조하게 됨
				// 그 상황은 index에 위치하는 값은 null 이며 그 값을 삭제할 수 없다.
				System.out.println("삭제할 수 없습니다."); // 
				return;
			}
		}
		// for문을 다 돌고 나오면 i는 index위치를 가리킴.
		// cur은 삭제할 위치에 있는 객체를 참조하고 있음.
		if(cur == tail) { // 삭제할 값이 끝값이라면 이전값으로 끝값을 변경
			prev.setNext(cur.getNext()); // 끝값의 next는 null이므로 마지막이전값의 다음값이 null을 참조하도록 함.
			tail = prev; // 끝값을 이전값으로 함.
		}else { // 삭제할 값이 끝값이 아니라면(중간값이라면)
			prev.setNext(cur.getNext()); // 삭제할 위치의 이전 값의 다음 값을
										 // 삭제할 값의 next를 참조하도록 하여 연결을 해준다.
		}
	}
}

public class Ex12 {

	public static void main(String[] args) {
		GraphicEditor editor = new GraphicEditor();
		editor.run();
	}

}
