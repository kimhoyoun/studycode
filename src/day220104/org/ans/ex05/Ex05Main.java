package day220104.org.ans.ex05;

import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;


public class Ex05Main {
	public static final int MAX = 4;
	public static Scanner sc;
	private Vector<Student> sv = new Vector<>();
	{
		sv.add(new Student("황기태","모바일","1","4.1"));
		sv.add(new Student("이재문","안드로이드","2","3.9"));
		sv.add(new Student("김남윤","웹공학","3","3.5"));
		sv.add(new Student("최찬미","빅데이터","4","4.25"));
	}
	
	public Ex05Main() {
		start();
	}
	
	private void start() {
		if(sc == null) {
			sc =new Scanner(System.in);
		}
//		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
//		// 4명의 학생 정보 입력
//		for(int i=0; i<MAX; i++) {
//			System.out.print(">> ");
//			String info = sc.nextLine();
//			StringTokenizer st = new StringTokenizer(info,",");
//			String 이름 = st.nextToken().trim();
//			String 학과 = st.nextToken().trim();
//			String 학번 = st.nextToken().trim();
//			String 평균 = st.nextToken().trim();
//			sv.add(new Student(이름,학과,학번,평균));
//		}
		
		Iterator<Student> it = sv.iterator();
		while(it.hasNext()) {
			System.out.println("---------------------");
			System.out.println(it.next().toString(0));
		}
		
		while(true) {
			System.out.print("학생이름 >> ");
			String 이름 = sc.nextLine();
			if("그만".equals(이름)) {
				System.out.println("프로그램 종료");
				break;
			}
			int idx = sv.indexOf(new Student(이름, null,null,null));
			if(idx != -1) {
				System.out.println(sv.get(idx));
			}else {
				System.out.println(이름+"학생은 없습니다.");
			}
		}
	}
	public static void main(String[] args) {
		new Ex05Main();
	}
}

















