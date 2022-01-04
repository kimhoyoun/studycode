package day220103.org.training.ex08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import day220103.org.training.Ex;

class Ex08 extends Ex{
	public Ex08() {
		start();
	}
	
	@Override
	public void run() {
		System.out.println("** 포인트 관리 프로그램입니다 **");
		HashMap<String, Integer> m = new HashMap<>();
		
		while(true) {
			System.out.print("이름과 포인트 입력>> ");
			String name = sc.next();
			if(name.equals("그만"))
				break;
			int point = sc.nextInt();
			
			if(m.get(name) ==null) {
				m.put(name,point);
			}else {
				m.replace(name, m.get(name)+point);
			}
			
			Set<String> s = m.keySet();
			Iterator<String> it = s.iterator();
			while(it.hasNext()) {
				String str = it.next();
				System.out.printf("(%s,%d)",str,m.get(str));
			}
			System.out.println();
		}
	}
}

public class Ex08Main {
	public static void main(String[] args) {
		new Ex08();
	}
}
