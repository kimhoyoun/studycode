package day1214;

public class WhileTest {

	public static void main(String[] args) {
//		(1) 0부터 100미만까지 짝수들의 총합
		
		int sum =0, i=0;
		while(i<100) {
			sum = sum+i;
			i += 2;
		}
		System.out.println(sum);
	}

}
