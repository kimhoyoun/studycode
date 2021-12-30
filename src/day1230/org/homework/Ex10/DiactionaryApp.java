package day1230.org.homework.Ex10;

abstract class PairMap {
	protected String[] keyArray;
	protected String[] valueArray;

	abstract String get(String key);

	abstract void put(String key, String value);

	abstract String delete(String key);

	abstract int length();
}

class Dictionary extends PairMap {
	private int top;
	private int capacity;

	public Dictionary() {

	}

	public Dictionary(int capacity) {
		this.capacity = capacity;
		keyArray = new String[capacity];
		valueArray = new String[capacity];
		top = 0;
	}

	public int search(String key) {
		for (int i = 0; i < top; i++) {
			if (key.equals(keyArray[i])) {
				return i;
			}
		}
		return -1;
	}

	@Override
	String get(String key) {
		// keyArray에서 key와 같은 key가 있는지 검색.
		// 같은 key가 있다면 key와 같은 index의 value를 반환한다.
		
		for(int i =0; i<top; i++) {
			if(key.equals(keyArray[i])) {
				return valueArray[i];
			}
		}
		return null;
	}

	@Override
	void put(String key, String value) {
		// 1. keyArray에서 key와 같은 key가 있는지 검사하기
		// 1-1. keyArray의 0번지 부터 top전까지 순회하기
		// 2. 같은 key가 있다면 key와 같은 index의 valueArray에 value저장
		// 3. 없다면 top번지의 keyArray에 key저장, valueArray에 value저장
		// 4. 만약 top이 keyArray의 크기 이상이라면 (가변적 구조)
		// 4-1. 새 keyArray와 새 valueArray를 만들고 기존 값 복제 후 마지막 요소 추가
		
		boolean flag = false;
		for(int i =0; i<top; i++) {
			if(key.equals(keyArray[i])) {
				valueArray[i] = value;
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			try {
				keyArray[top] = key;
				valueArray[top] = value;
				// 예외처리를 하여 top이 Array의 길이보다 커지면 새로운 Array를 만들어
				// 기존값을 복사하고 새 Array를 참조하게한다.
			} catch (ArrayIndexOutOfBoundsException e) {
				String[] newKeyArray = new String[keyArray.length+capacity];
				String[] newValueArray = new String[valueArray.length+capacity];
				for(int i =0; i<top; i++) {
					newKeyArray[i] = keyArray[i];
					newValueArray[i] = valueArray[i];
				}
				keyArray = newKeyArray;
				valueArray = newValueArray;
				keyArray[top] = key;
				valueArray[top] = value;
			}finally {
				top++;
			}
		}
	}

	@Override
	String delete(String key) {
		// key의 위치를 찾아서 제거한다.
		String value = null;
		for(int i =0; i<keyArray.length; i++) {
			if(key.equals(keyArray[i])) {
				value = valueArray[i];
				for(int j = i; j<top-1; j++) {
					keyArray[j] = keyArray[j + 1];
					valueArray[j] = valueArray[j + 1];
				}
				keyArray[top - 1] = null;
				valueArray[top - 1] = null;
				top--;
			}
		}
		
		// keyArray.length - capacity > top
		// 배열을 줄여서 다시 만들고 복제하기
		if(keyArray.length-capacity > top) {
			String[] newKeyArray = new String[keyArray.length-capacity];
			String[] newValueArray = new String[valueArray.length-capacity];
			for(int i =0; i<top; i++) {
				newKeyArray[i] = keyArray[i];
				newValueArray[i] = valueArray[i];
			}
			keyArray = newKeyArray;
			valueArray = newValueArray;
		}
		
		return value;
	
	}

	@Override
	int length() {
		return top;
	}
	int capacity() {
		return keyArray.length;
	}
	
	@Override
	public String toString() {
		String mapValueStr = "{";
		for(int i =0; i<top; i++) {
			mapValueStr = mapValueStr + " " + keyArray[i] + " : "+valueArray[i] + ",";
		}
		mapValueStr = mapValueStr.substring(0,mapValueStr.length()-1) + "}";
		
		return mapValueStr;
	}
}

public class DiactionaryApp {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(5);
		System.out.println(dic.capacity());
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("최길동", "c++"); // 이재문의 값을 c++로 수정
		dic.put("박기태", "자바");
		dic.put("최재문", "파이썬");
		dic.put("이길동", "c++");
		System.out.println(dic);
		System.out.println(dic.capacity());
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		dic.delete("박기태");
		dic.delete("최재문");
		System.out.println("황기태의 값은 " + dic.get("황기태")); // null
		System.out.println(dic);
		System.out.println(dic.capacity());
	}

}
