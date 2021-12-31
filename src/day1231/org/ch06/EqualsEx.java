package day1231.org.ch06;

import java.util.ArrayList;
import java.util.Arrays;

class EqualsPoint {
	int x, y;
	public EqualsPoint(int x, int y) {
		this.x = x; this.y = y;
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
		EqualsPoint other = (EqualsPoint) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
	
	@Override
	public String toString() {
		return String.format("point(%d,%d)",x,y);
	}
}


public class EqualsEx {
	
	public static void main(String[] args) {
		ArrayList<EqualsPoint> pList = new ArrayList<EqualsPoint>();
		pList.add(new EqualsPoint(2,3));
		pList.add(new EqualsPoint(4,5));
		pList.add(new EqualsPoint(6,7));
		pList.add(new EqualsPoint(8,9));
		pList.add(new EqualsPoint(1,2));
		
//		
//		System.out.println(pList.get(1));
//		pList.set(1,new EqualsPoint(100,200));
//		System.out.println(pList.get(1));
//		System.out.println(pList);
//		System.out.println("size => "+pList.size());
//		
//		// 컬렉션의 결과를 배열로 쉽게 변경할 수 있다.
//		EqualsPoint[] arr = new EqualsPoint[pList.size()];
//		pList.toArray(arr);
//		System.out.println(Arrays.toString(arr));
		
//		indexOf(); <-- 같은 요소가 있다면 index 반환, 아니면 -1 반환
		// ArrayList에서 객체의 위치를 찾기위해서는 equals()를 재정의 해야한다.
		// 다른 컬렉션에서도 검색이 가능하게 하려면 hashcode()를 재정의 해야 한다.
		System.out.println(pList.indexOf(new EqualsPoint(8,9)));
		System.out.println(pList.indexOf(new EqualsPoint(40,5)));
		
	}
	public static void main01(String[] args) {
		EqualsPoint a = new EqualsPoint(2,3);
		EqualsPoint b = new EqualsPoint(2,3);
		EqualsPoint c = new EqualsPoint(3,4);
	
		if(a == b) // false
			System.out.println("a==b");
		if(a.equals(b)) // true
			System.out.println("a is equal to b");
		if(a.equals(c)) // false
			System.out.println("a is equal to c");
	}

}
