package day220103.org.training.ex03;

import java.util.HashMap;

import day220103.org.training.Ex;

class Ex03 extends Ex{
	
	public Ex03() {
		start();
	}
	
	@Override
	public void run() {
		HashMap<String, Integer> nations = new HashMap<>();
		
		System.out.println("나라 이름과 인구를 입력하세요.(예 : Korea 5000)");
		while(true) {
			System.out.print("나라 이름, 인구 >> ");
			String s = sc.next();
			if(s.equals("그만"))
				break;
			int p = sc.nextInt();
			
			
			nations.put(s,p);
		}
		while(true) {
			System.out.print("인구 검색 >> ");
			String search = sc.next();
			if(search.equals("그만"))
				break;
			
			if(nations.containsKey(search)) {
				System.out.printf("%s의 인구는 %d\n",search,nations.get(search));
			}else {
				System.out.printf("%s 나라는 없습니다.\n",search);
			}
		}
		System.out.println("프로그램 종료");
	}
}

public class Ex03Main {
	public static void main(String[] args) {
		new Ex03();
	}
}
