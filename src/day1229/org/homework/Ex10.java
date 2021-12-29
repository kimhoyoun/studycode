package day1229.org.homework;

abstract class PairMap{
	protected String keyArray[];	// key들을 저장하는 배열
	protected String valueArray[];  // value 들을 저장하는 배열
	abstract String get(String key); // key 값을 가진 value 리턴, 없으면 null 리턴
	abstract void put(String key, String value); // key와 value를 쌍으로 저장, 기존에
//													key가 있으면, 값을 value로 수정
	abstract String delete(String key);			// key 값을 가진 아이템(value와 함께) 삭제,
//												삭제된 value 값 리턴
	abstract int length(); // 현재 저장된 아이템의 개수 리턴
}

class Dictionary extends PairMap{
	int top = 0;
	
	Dictionary(int size){
		keyArray = new String[size];
		valueArray = new String[size];
	}
	
	// key 값을 가진 value 리턴, 없으면 null 리턴
	@Override
	String get(String key) {
		for(int i=0; i<top; i++) {
			if(keyArray[i].equals(key)) {
				return valueArray[i];
			}
		}
		return null;
	}
	
	int search(String key) {
		for(int i=0; i<top; i++) {
			if(keyArray[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}
	
	// key와 value를 쌍으로 저장, 기존에 key가 있으면, 값을 value로 수정
	@Override
	void put(String key, String value) {
		int tf = search(key);
		if(tf!= -1) {
			valueArray[tf] = value;
			return;
		}
		keyArray[top] = key;
		valueArray[top] = value;
		top++;
		
	}
	// key 값을 가진 아이템(value와 함께) 삭제, 삭제된 value 값 리턴
	@Override
	String delete(String key) {
		int tf = search(key);
		if(tf!= -1) {
			for(int i= tf; i<top-1; i++) {
				keyArray[i] = keyArray[i+1];
				valueArray[i] = valueArray[i+1];
			}
			keyArray[top-1] = null;
			valueArray[top-1] = null;
			top--;
		}
		return null;
	}

	// 현재 저장된 아이템의 개수 리턴
	@Override
	int length() {
		return top;
	}
	
}
public class Ex10 {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "c++"); // 이재문의 값을 c++로 수정
		System.out.println("이재문의 값은 "+ dic.get("이재문"));
		System.out.println("황기태의 값은 "+ dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 "+dic.get("황기태"));
		
	}

}
