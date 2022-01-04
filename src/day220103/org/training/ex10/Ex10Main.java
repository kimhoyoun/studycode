package day220103.org.training.ex10;

import java.util.Iterator;
import java.util.Vector;

import day220103.org.training.Ex;

class Shape {
	public void draw() {
		System.out.println("Shape");
	}
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

class Ex10 extends Ex{
	public Ex10() {
		start();
	}
	Vector<Shape> v = new Vector<>();
	
	@Override
	public void run() {
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		
			System.out.print("삽입(1), 삭제(2), 모두보기(3), 종료(4)>> ");
			int no = sc.nextInt();
	
			switch(no) {
			case 1:	insert(); break;
			case 2: delete(); break;
			case 3: print(); break;
			case 4: 
				System.out.println("beauty를 종료합니다.");
				System.exit(0);
			}
		
		run();
	}
	
	public void insert() {
		System.out.print("Line(1), Rect(2), Circle(3) >> ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: 
			v.add(new Line()); break;
		case 2:
			v.add(new Rect()); break;
		case 3:
			v.add(new Circle()); break;
			
		default: System.out.println("해당사항 없습니다. 다시 선택 하세요!");
			insert();
		}
	}
	
	public void delete() {
		System.out.print("삭제할 도형의 위치 >> ");
		int num = sc.nextInt();
		if(num>v.size()) {
			System.out.println("삭제할 수 없습니다.");
			return;
		}
		v.remove(num-1);
	}
	
	public void print() {
		Iterator<Shape> it = v.iterator();
		while(it.hasNext()) {
			Shape s = it.next();
			s.draw();
		}
	}
}

public class Ex10Main {

	public static void main(String[] args) {
		new Ex10();
	}

}
