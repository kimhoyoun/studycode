package day1230.org.homework.Ex12;

import java.util.Scanner;

abstract class Shape {
	Shape next;

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
	private Shape head = null;
	private Shape last = null;

	public void insert() {
		System.out.print("Line(1), Rect(2), Circle(3) >> ");
		int no = sc.nextInt();
		Shape node = null;

		switch (no) {
		case 1:
			node = new Line();
			break;
		case 2:
			node = new Rect();
			break;
		case 3:
			node = new Circle();
			break;
		default:
			System.out.println("해당 사항 없습니다! 다시 선택해 주세요!");
			insert();
		}

		if (head == null) { // 입력이 처음이면
			head = node;
			last = head;
			return;
		}
		last.setNext(node);
		last = node;
	}

	public void delete() {
		Shape cur = head;
		Shape prev = null;
		System.out.print("삭제할 도형의 위치 >> ");
		int no = sc.nextInt();

		if (no == 1) { // 첫번째 요소 삭제 시 head를 두번째 값으로 치환
			if (head == last) { // 값이 하나라면 처음과 끝 모두 null 처리
				head = null;
				last = null;
				return;
			}
			head = head.getNext();
			return;
		}

		int i;
		for (i = 1; i < no; i++) {
			prev = cur;
			cur = cur.getNext();
			if (cur == null) {
				System.out.println("삭제 할 수 없습니다.");
				return;
			}
		}

		if (cur == last) { // 삭제할 값이 마지막이면(현재의 다음이 null이면 last이므로)
			prev.setNext(null);
			last = prev; // 마지막 값을 이전 값으로 치환
			return;
		}
		// 삭제할 요소가 중간 일 때 이전의 다음을 현재의 다음 값을 참조하도록 하여
		// 현재값과 링크 해제
		prev.setNext(cur.getNext());

	}

	public void print() {
		Shape cur = head;
		while (cur != null) {
			cur.draw();
			cur = cur.getNext();
		}
	}

	public void run() {
		System.out.println("그래픽 에디터 beauty을 실행합니다.");

		while (true) {

			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				insert();
				break;
			case 2:
				delete();
				break;
			case 3:
				print();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("해당 사항 없습니다!");
				num = 0;
				break;
			}
		}
	}
}

class ShapeLinkedList{
	private Shape start, last, node, cur;
	private int size =0;
	public void append(Shape shape) {
		size++;
		if(start == null) {
			start = shape;
			last = shape;
			return;
		}
		node = shape;
		last.setNext(node);
		last = node;
	}
	
	public void showAll() {
		cur = start;
		while(cur != null) {
			cur.draw();
			cur = cur.getNext();
		}
	}

	public void remove(int i) {
		size--;
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
}


public class MethodOverridingEx {

	public static void main(String[] args) {
		ShapeLinkedList linkedList = new ShapeLinkedList();
		
		linkedList.append(new Circle());
		linkedList.append(new Rect());
		linkedList.append(new Circle());
		linkedList.append(new Line());
		linkedList.append(new Circle());
		
		linkedList.showAll();
		
		linkedList.remove(3);
		System.out.println(linkedList.size());
	}
	public static void main03(String[] args) {
		GraphicEditor ge = new GraphicEditor();

		ge.run();
	}

	public static void main02(String[] args) {
		Shape start, last, node;
		start = new Line();
		last = start;
		node = new Rect();
		last.next = node;
		last = node;
		node = new Line();
		last.next = node;
		last = node;
		node = new Circle();
		last.next = node;
		last = node;
		Shape cur = start;

		while (cur != null) {
			cur.draw();
			cur = cur.next;
		}
	}

	static void paint(Shape p) {

		p.draw();
	}

	public static void main01(String[] args) {
		Line line = new Line();
		paint(line);
	}

}
