package day220103.org.training.ex06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import day220103.org.training.Ex;

class Location{
	private String name;
	private int ga;
	private int se;

	public Location(String name, int ga, int se) {
		this.name = name;
		this.ga = ga;
		this.se = se;
	}
	
	@Override
	public String toString() {
		return String.format("%s  %d  %d",name, ga, se);
	}
}
class Ex06 extends Ex{
	public Ex06() {
		start();
	}
	@Override
	public void run() {
		HashMap<String, Location> m = new HashMap<>();
		System.out.println("도기, 경도, 위도를 입력하세요.");
		for(int i =0; i<4; i++) {
			System.out.print(">> ");
			String name = sc.next();
			int ga = sc.nextInt();
			int se = sc.nextInt();
			
			m.put(name, new Location(name, ga, se));
		}
		
		Set<String> s = m.keySet();
		Iterator<String> it = s.iterator();
		System.out.println("---------------------");
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(m.get(name));
		}
		System.out.println("---------------------");
		
		while(true) {
			System.out.print("도시 이름 >> ");
			String name = sc.next();
			if(name.equals("그만"))
				break;
				
			Location l = m.get(name);
			if(l == null) {
				System.out.printf("%s는 없습니다\n",name);
			}else {
				System.out.println(l);				
			}
		}
	}
}

public class Ex06Main {
	public static void main(String[] args) {
		new Ex06();
	}
}
