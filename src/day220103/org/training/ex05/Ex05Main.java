package day220103.org.training.ex05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

import day220103.org.training.Ex;

class Student {
	private String name;
	private String subject;
	private String no;
	private String avg;

	public Student(String name, String subject, String no, String avg) {
		this.name = name;
		this.subject = subject;
		this.no = no;
		this.avg = avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getAvg() {
		return avg;
	}

	public void setAvg(String avg) {
		this.avg = avg;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {

		return String.format("%s, %s, %s, %s", name, subject, no, avg);
	}

}

class Ex05_01 extends Ex {
	public Ex05_01() {
		start();
	}

	@Override
	public void run() {
		ArrayList<Student> as = new ArrayList<>(4);

		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String info = sc.nextLine();
			StringTokenizer st = new StringTokenizer(info, ", ");
			String name = st.nextToken().trim();
			String subject = st.nextToken().trim();
			String no = st.nextToken().trim();
			String avg = st.nextToken().trim();
			
			as.add(new Student(name, subject, no, avg));
		}
		
		Iterator<Student> it = as.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("------------------------------");
			System.out.printf("이름 : %s\n", s.getName());
			System.out.printf("학과 : %s\n", s.getSubject());
			System.out.printf("학번 : %s\n", s.getNo());
			System.out.printf("학점평균 : %s\n", s.getAvg());
		}
		System.out.println("------------------------------");
		while (true) {
			System.out.print("학생 이름 >> ");
			String name = sc.next();
			if (name.equals("그만"))
				break;

			for (int i = 0; i < as.size(); i++) {
				if (name.equals(as.get(i).getName())) {
					System.out.println(as.get(i));
				}
			}
		}
	}
}

class Ex05_02 extends Ex {
	public Ex05_02() {
		start();
	}

	@Override
	public void run() {
		HashMap<String, Student> hm = new HashMap<>();

		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String info = sc.nextLine();
			StringTokenizer st = new StringTokenizer(info, ", ");
			String name = st.nextToken().trim();
			String subject = st.nextToken().trim();
			String no = st.nextToken().trim();
			String avg = st.nextToken().trim();
			
			hm.put(name, new Student(name, subject, no, avg));
		}
		Set<String> s = hm.keySet();
		Iterator<String> it = s.iterator();

		while (it.hasNext()) {
			String key = it.next();
			System.out.println("------------------------------");
			System.out.printf("이름 : %s\n", hm.get(key).getName());
			System.out.printf("학과 : %s\n", hm.get(key).getSubject());
			System.out.printf("학번 : %s\n", hm.get(key).getNo());
			System.out.printf("학점평균 : %s\n", hm.get(key).getAvg());

		}

		System.out.println("------------------------------");
		while (true) {
			System.out.print("학생 이름 >> ");
			String name = sc.next();
			if (name.equals("그만"))
				break;

			System.out.println(hm.get(name));
		}
	}
}

public class Ex05Main {
	public static void main(String[] args) {
		new Ex05_02();
	}
}
