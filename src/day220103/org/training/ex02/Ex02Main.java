package day220103.org.training.ex02;

import java.util.ArrayList;
import java.util.Iterator;

import day220103.org.training.Ex;

class Ex02 extends Ex{
	public Ex02() {
		start();
	}
	
	@Override
	public void run() {
		ArrayList<Character> grade = new ArrayList<>(6);
		
		System.out.print("6개 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");
		for(int i = 0; i<6; i++) {
			grade.add(sc.next().charAt(0));
		}
		
		Iterator<Character> it = grade.iterator();
		double sum = 0.0;
		while(it.hasNext()) {
			char c = it.next();
			double num = 0;
			
			switch(c){
				case 'A': num = 4.0;break;
				case 'B': num = 3.0; break;
				case 'C': num = 2.0; break;
				case 'D': num = 1.0; break;
				case 'F': num = 0.0; break;
				default : break;
			}
			sum += num;
		}
		System.out.println(sum/grade.size());
		
	}
	
	
}

public class Ex02Main {
	public static void main(String[] args) {
		new Ex02();
	}
}
