package day220104.org.ans.ex05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex05Main2 {
	public static final int MAX = 0;
	public static Scanner sc;
	private HashMap<String,Student> m = new HashMap<>();
	{
		m.put("황기태",new Student("황기태","모바일","1","4.1"));
		m.put("이재문",new Student("이재문","안드로이드","2","3.9"));
		m.put("김남윤",new Student("김남윤","웹공학","3","3.5"));
		m.put("최찬미",new Student("최찬미","빅데이터","4","4.25"));
	}
	
	public Ex05Main2() {
		start();
	}
	
	private void start() {
		if(sc == null) {
			sc =new Scanner(System.in);
		}
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		// 4명의 학생 정보 입력
		for(int i=0; i<MAX; i++) {
			System.out.print(">> ");
			String info = sc.nextLine();
			StringTokenizer st = new StringTokenizer(info,",");
			String 이름 = st.nextToken().trim();
			String 학과 = st.nextToken().trim();
			String 학번 = st.nextToken().trim();
			String 평균 = st.nextToken().trim();
			m.put(이름,new Student(이름,학과,학번,평균));
		}
		
//		Set<String> s = m.keySet();
//		Iterator<String> it = s.iterator();
//		while(it.hasNext()) {
//			System.out.println("---------------------");
//			System.out.println(m.get(it.next()).toString(0));
//		}
		
		// 정렬
		ArrayList<Student> sList = new ArrayList<>();
		sList.addAll(m.values());
		
		Collections.sort(sList,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(Integer.parseInt(o1.학번) > Integer.parseInt(o2.학번)) {
					return 1;
				} else if(Integer.parseInt(o1.학번) < Integer.parseInt(o2.학번))
					return -1;
				else
					return 0;
			}
			
		});
		
		for(int i =0; i<sList.size(); i++) {
			System.out.println("---------------------");
			System.out.println(sList.get(i).toString());
		}
		
		System.out.println("---------------------");
		while(true) {
			System.out.print("학생이름 >> ");
			String 이름 = sc.nextLine();
			if("그만".equals(이름)) {
				System.out.println("프로그램 종료");
				break;
			}
			Student std = m.get(이름);
			if(std != null) {
				System.out.println(std);
			}else {
				System.out.println(이름+"학생은 없습니다.");				
			}			
		}
	}
	public static void main(String[] args) {
		new Ex05Main2();
	}
}

















