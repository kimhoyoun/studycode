package day220103.org.training.ex11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import day220103.org.training.Ex;

class Nation {
	private String country;
	private String capital;

	public Nation(String country, String capital) {
		this.country = country;
		this.capital = capital;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
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
		Nation other = (Nation) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		return true;
	}

}

class Ex11_01 extends Ex {
	public Ex11_01() {
		start();
	}

	Vector<Nation> v = new Vector<>();
	{
		v.add(new Nation("한국", "서울"));
		v.add(new Nation("미국", "워싱턴DC"));
		v.add(new Nation("그리스", "아테네"));
		v.add(new Nation("이탈리아", "로마"));
		v.add(new Nation("프랑스", "파리"));
		v.add(new Nation("일본", "도쿄"));
		v.add(new Nation("중국", "상하이"));
		v.add(new Nation("태국", "방콕"));
		v.add(new Nation("스페인", "마드리드"));
	}

	@Override
	public void run() {

		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");

		System.out.print("입력:1, 퀴즈:2, 종료:3 >> ");
		int no = sc.nextInt();

		switch (no) {
		case 1:
			insert();
			break;
		case 2:
			quiz();
			break;
		case 3:
			System.out.println("프로그램 종료");
			System.exit(0);

		}
		
		run();
	}

	public void insert() {
		System.out.printf("현재 %d개 나라와 수도가 입력되어 있습니다.\n", v.size());
		while (true) {
			System.out.printf("나라와 수도 입력%d >> ", v.size() + 1);
			String country = sc.next();
			if (country.equals("그만"))
				break;

			String capital = sc.next();

			if (v.contains(new Nation(country, null))) {
				System.out.println(country + "는 이미 있습니다!");
			} else {
				v.add(new Nation(country, capital));
			}
		}
	}

	public void quiz() {
		int index =0;
		while (true) {
			System.out.printf("%s의 수도는? >> ", v.get(index).getCountry());
			String capital = sc.next();
			if(capital.equals("그만")) {
				break;
			}
			
			if (capital.equals(v.get(index).getCapital())) {
				System.out.println("정답!");
			} else {
				System.out.println("아닙니다!");
			}
			index = (index>=v.size())?0:index+1;
			
		}
	}
}

class Ex11_02 extends Ex{
	public Ex11_02() {
		start();
	}
	HashMap<String, String> m = new HashMap<>();
	{	
		m.put("한국", "서울");
		m.put("미국", "워싱턴DC");
		m.put("그리스", "아테네");
		m.put("이탈리아", "로마");
		m.put("프랑스", "파리");
		m.put("일본", "도쿄");
		m.put("중국", "상하이");
		m.put("태국", "방콕");
		m.put("스페인", "마드리드");
	}
	@Override
	public void run() {
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		System.out.print("입력:1, 퀴즈:2, 종료:3 >> ");
		int no = sc.nextInt();
		switch (no) {
		case 1:
			insert();
			break;
		case 2:
			quiz();
			break;
		case 3:
			System.out.println("프로그램 종료");
			System.exit(0);
		}
	
		run();
	}
	
	public void insert() {
		System.out.printf("현재 %d개 나라와 수도가 입력되어 있습니다.\n", m.size());
		while (true) {
			System.out.printf("나라와 수도 입력%d >> ", m.size() + 1);
			String country = sc.next();
			if (country.equals("그만"))
				break;
			
			String capital = sc.next();

			if (m.containsKey(country)) {
				System.out.println(country + "는 이미 있습니다!");
			} else {
				m.put(country, capital);
			}
		}
	}

	public void quiz() {
		
		Set<String> s = m.keySet();
		Iterator<String> it = s.iterator();
		
		while (it.hasNext()) {
			
			String country = it.next();
			
			System.out.printf("%s의 수도는? >> ", country);
			String capital = sc.next();
			if(capital.equals("그만")) {
				break;
			}
			
			if (capital.equals(m.get(country))) {
				System.out.println("정답!");
			} else {
				System.out.println("아닙니다!");
			}
			
		}
	}
	
}
public class Ex11Main {

	public static void main(String[] args) {
		new Ex11_02();
	}

}
