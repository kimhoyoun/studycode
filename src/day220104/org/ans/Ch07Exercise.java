package day220104.org.ans;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Ch07Exercise {
	public Ch07Exercise() {
		ex04();
	}
	
	
	private void ex04() {
		// Vector에 강수량을 입력하고 평균을 구한다.
		Vector<Integer> v = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("강수량 입력 (0 입력시 종로) >> ");
			int num = sc.nextInt();
			if(num == 0) break;
			v.add(num);
			int sum = 0;
			
			Iterator<Integer> it = v.iterator();
			while(it.hasNext()) {
				int n = it.next();
				sum += n;
				System.out.print(n+ " ");
			}
			System.out.println("\n현재 평균 "+sum/v.size());
		}
		sc.close();
	}


	private void ex03() {
		// 나라 이름과 인구 입력
		HashMap<String, Integer> nations = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
		
		while(true) {
			System.out.print("나라 이름, 인구 >>");
			String 나라이름 = sc.next();
			if("그만".equals(나라이름)) {
				break;
			}
			int 인구 = sc.nextInt();
			nations.put(나라이름, 인구);
		}
		
		while(true) {
			// 인구 검색
			System.out.print("인구 검색 >> ");
			String 나라이름 = sc.next();
			if("그만".equals(나라이름))	break;
			if(nations.get(나라이름) != null) {
				int 인구 = nations.get(나라이름);
				System.out.println(나라이름 + "의 인구는 "+인구);				
			}else {
				System.out.println(나라이름+"은 없습니다!");
			}
			
			
		}
		sc.close();
	}

	
	
	public static void main(String[] args) {
		new Ch07Exercise();
	}

}
