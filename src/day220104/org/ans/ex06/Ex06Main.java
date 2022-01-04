package day220104.org.ans.ex06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Ex06Main {
	public static final int MAX = 4;
	private HashMap<String, Location> m= new HashMap<>();
	private Scanner sc = new Scanner(System.in);
	
	public Ex06Main() {
		start();
	}
	
	private void start() {
		System.out.println("도시, 경도, 위도를 입력하세요.");
		for(int i = 0; i<MAX; i++) {
			System.out.print(">> ");
			String str = sc.nextLine();
			StringTokenizer st = new StringTokenizer(str,",");
			String 도시 = st.nextToken().trim();
			String 경 = st.nextToken().trim();
			String 위 = st.nextToken().trim();
			int 경도 = Integer.parseInt(경);
			int 위도 = Integer.parseInt(위);
			m.put(도시, new Location(도시,경도,위도));
		}
		
		Set<String> s = m.keySet();
		Iterator<String> it = s.iterator();
		System.out.println("---------------------");
		while(it.hasNext()) {
			String 도시 = it.next();
			System.out.println(m.get(도시));
		}
		
		System.out.println("---------------------");
		while(true) {
			System.out.print("도시 이름 >> ");
			String 도시 = sc.next();
			if("그만".equals(도시)) {
				System.out.println("프로그램 종료");
				break;
			}
			
			Location location = m.get(도시);
			if(location != null) {
				System.out.println(location);
			}else {
				System.out.println(도시 +"는 없습니다!");
			}
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		new Ex06Main();
		
	}

}
