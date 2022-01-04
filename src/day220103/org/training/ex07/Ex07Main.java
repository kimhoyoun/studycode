package day220103.org.training.ex07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import day220103.org.training.Ex;

class Ex07 extends Ex{
	public Ex07() {
		start();
	}
	
	@Override
	public void run() {
		HashMap<String, Double> m = new HashMap<>();
		
		System.out.println("미래장학금관리시스템입니다.");
		for(int i =0; i<5; i++) {
			System.out.print("이름과 학점>> ");
			String name = sc.next();
			double grade = sc.nextDouble();
			
			m.put(name,grade);
		}
		
		System.out.print("장학생 선발 학점 기준 입력 >> ");
		double cut = sc.nextDouble();
		
		Set<String> s = m.keySet();
		Iterator<String> it = s.iterator();
		System.out.print("장학생 명단 : ");
		while(it.hasNext()) {
			String str = it.next();
			double score = m.get(str);
			if(cut<score) {
				System.out.print(str+ " ");
			}
		}
	}
}

public class Ex07Main {
	public static void main(String[] args) {
		new Ex07();
	}
}
