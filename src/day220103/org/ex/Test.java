package day220103.org.ex;

import java.util.HashMap;

class JClass{
	<T>T take(T[] s, int index){
		if(index > s.length){
			System.out.println("인덱스가 범위를 벗어났습니다.");
			return null;
		}
		return s[index];
	}
}

public class Test {
	
	static int func(HashMap<String, Integer> h){
		return h.size();
	}
	public static void main(String[] args) {
		JClass js = new JClass();
		
		String[] s = new String[] {"a", "b", "c"};
		System.out.println(js.take(s, 2));
	}

}
