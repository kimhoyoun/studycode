package day220103.org.ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

abstract class Ex {
	abstract public void run();
	public void start() {
		System.out.println("----- 예제 실행 -----");
		run();
	}
}

class Ex01 extends Ex {

	@Override
	public void run() {
		System.out.println("정수 값만 다루는 제네릭 벡터 생성"); 
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.println("v.size() =>"+v.size());
		System.out.println("v.capacity() => "+v.capacity());
		v.add(5); // 5 삽입
		v.add(4); // 4 삽입
		v.add(-1); // -1 삽입
		

		// 벡터 중간에 삽입하기
		v.add(2, 100); // 4와 -1 사이에 정수 100 삽입
		System.out.println("v.size() =>"+v.size());
		System.out.println(v);
		
		for(Integer i:v) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		int sum =0;
		for(int i =0; i<v.size(); i++) {
			sum += v.elementAt(i);
		}
		
		System.out.println("sum => "+sum);

	}
}

class Point{
	private int x,y;
	public Point() {
		this(0,0);
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
}

class Ex02 extends Ex{
	@Override
	public void run() {
		System.out.println(">>> Point 객체를 요소로만 가지는 벡터 생성");
		Vector<Point> v = new Vector<Point>();
		v.add(new Point(2,3));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		int findIdx = v.indexOf(new Point(-5,20)); // equals(), hashCode() 재정의
		System.out.println(v);
		v.remove(findIdx);
		System.out.println(v);
		
	}
}

class Ex03 extends Ex{
	@Override
	public void run() {
		System.out.println(">>> 문자열만 삽입가능한 ArrayList 컬렉션");
		ArrayList<String> a = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<4; i++) {
			System.out.print("이름을 입력하세요 >> ");
			a.add(sc.next());
		}
		System.out.println("저장완료!");
		int longIndex = 0; // index는 -1이 될 수 없다.
		for(int i =0; i<a.size(); i++) {
			String name = a.get(i);
			System.out.print(name + " ");
			if(name.length()>a.get(longIndex).length())
				longIndex = i;
		}
		System.out.println();
		System.out.println("제일 긴 이름 => "+ a.get(longIndex));
	}
}

class Ex04 extends Ex{
	@Override
	public void run() {
		Vector<Integer> v = new Vector<>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		
		System.out.println("Iterator를 이용한 모든 정수 출력");
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		
		System.out.println("Iterator를 이용하여 모든 정수 더하기");
		int sum = 0;
		// 앞부분에서 다 돌렸기때문에 처음부터 다시 돌리려면 그 위치에서 새로 받아야 함.
		it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합 : "+sum);
	}
}

class Ex05 extends Ex{
	@Override
	public void run() {
		// 영어 단어와 한글 단어의 쌍을 지정하는 HashMap 컬렉션 생성
		HashMap<String, String> dic = new HashMap<>();
		
		// 3개의 (key,value)쌍을 dic에 저장
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		// 영어 단어를 입력받고 한글 단어 검색 "exit"입력받으면 종료
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("찾고 싶은 단어는? ");
			String eng = sc.next();
			if(eng.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			
			// HashMap에서 'Key'eng의 'Value' kor 검색
			String kor = dic.get(eng);
			if(kor == null)
				System.out.println(eng + "는 없는 단어 입니다.");
			else
				System.out.println(kor);
		}
		sc.close();
	}
}

class Ex06 extends Ex{
	@Override
	public void run() {
		// 사용자 이름과 점수를 기록하는 HashMap 컬렉션 생성
		HashMap<String, Integer> javaScore = new HashMap<>();
		
		// 5개의 점수 저장
		javaScore.put("김성동", 97);
		javaScore.put("황기태", 88);
		javaScore.put("김남윤", 98);
		javaScore.put("이재문", 70);
		javaScore.put("한원선", 99);
		
		System.out.println("HashMap의 요소 개수 "+ javaScore.size());
		
		// 모든 사람의 점수 출력
		// javaScore에 들어 있는 모든 (key, value)쌍 출력
		// key문자열을 가진 집한 Set 컬렉션 리턴
		// map은 순서가 없기때문에 Set에 저장될 때 무작위 순서로 저장됨
		Set<String> keys = javaScore.keySet();
		System.out.println(keys);
		// key 문자열을 순서대로 접근할 수 있는 Iterator 리턴
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			int score = javaScore.get(name);
			System.out.println(name + " : "+score);
		}
		
	}
}

class Student{
	int id;
	String tel;
	public Student(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
}

class Ex07 extends Ex{
	@Override
	public void run() {
		// 학생 이름과 Student 객체를 쌍으로 저장하는 HashMap 컬렉션 생성
		HashMap<String, Student> map = new HashMap<>();
		
		// 3명의 학생 저장
		map.put("황기태", new Student(1, "010-111-1111"));
		map.put("이재문", new Student(2, "010-222-2222"));
		map.put("김남윤", new Student(3, "010-333-3333"));
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름 >> ");
			String name = sc.next();
			if(name.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			Student student = map.get(name); // 이름에 해당하는 Student 객체 검색
			if(student == null) {
				System.out.println(name + "은 없습니다.");
			}else {
				System.out.println("id : " + student.id + ", 전화 : "+student.tel);
			}
		}
	}
}
public class Ch07Ex {
	public Ch07Ex() {
		// 생성자는 필드를 초기화 한다.
		// 예제 구현 메소드 별도로 만든다.
		Ex ex = new Ex07();
		ex.start();
	}

	public static void main(String[] args) {
		// 메인에 직접 구현하기보다는 객체에 구현 해 보자.
		// 생성자에서 시작 하도록 한다.
		new Ch07Ex();

	}
}
