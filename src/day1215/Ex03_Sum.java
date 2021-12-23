package day1215;

public class Ex03_Sum {

	public static void main01(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10 = 55
		// while 문으로 구현
		final int MAX = 10;
		// 누적하는 변수는 0으로 초기화
		int sum = 0; // 1부터 10까지 누적
		int num = 1; // 1부터 10까지 하나씩 증가 용도
		while (num <= MAX) {
			sum += num;
			System.out.print(num);
			System.out.print(num != MAX ? "+" : "=");
			num++;
		}
		System.out.println(sum);
	}

	// 내가 짠 코드
	public static void main02(String[] args) {
		// 1+2-3+4-5+6-7+8-9+10 = 7
		final int MAX = 10;
		// 누적하는 변수는 0으로 초기화
		int sum = 0; // 1부터 10까지 누적
		int num = 1; // 1부터 10까지 하나씩 증가 용도
		while (num <= MAX) {

			sum = ((num % 2 != 0) && (num != 1)) ? sum - num : sum + num;

			if (num == 1) {
				System.out.print(num);
			} else if (num % 2 == 0) {
				System.out.print("+");
				System.out.print(num);
			} else {
				System.out.print("-");
				System.out.print(num);
			}
			num++;
		}
		System.out.println(" = " + sum);
	}

	// 강사님 코드
	public static void main03(String[] args) {
		// 1+2-3+4-5+6-7+8-9+10 = 7
		final int MAX = 10;
		final int MIN = 1;
		// 누적하는 변수는 0으로 초기화
		int sum = 0; // 1부터 10까지 누적
		int num = MIN; // 1부터 10까지 하나씩 증가 용도

		// 1. 1~10 까지 출력 (num을 증가하면서 출력)

		while (num <= MAX) {
			System.out.print(num);
			// num이 홀수이면
			if (num % 2 != 0) {
				// 삼항연산자를 사용해 코드 간결화
				// sum에 num이 홀수이고 1일땐 num을 대입,
				// 1이 아닐땐 sum에서 num만큼 차감
				sum = (num == MIN) ? num : sum - num;
				System.out.print("+");
				// num 이 짝수일때
			} else {
				sum += num;
				// 짝수일때 마지막 숫자(10)일땐 "="출력
				// 그외에는 "-" 출력
				System.out.print(num == MAX ? "=" : "-");
			}
			num++;
		}
		System.out.println(sum);
	}

	public static void main04(String[] args) {
		// 피보나치 수열 누적
		// 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 = 54
		final int MAX = 21;

		int prev = 0; // 이전
		int curr = 1; // 현재
		int next = 0; // 다음
		int sum = 0;
//		while문

		// curr 값이 MAX(21)보다 작거나 같을때 while문 수행
		while (curr <= MAX) {

			sum += curr;

			System.out.print(curr);
			// curr 값이 MAX와 동일하면 "="을 출력
			// 그외에는 "+" 출력
			System.out.print(curr == MAX ? "=" : "+");

			// 치환해서 증가하지
			// 다음항은 이전항 + 현재항
			next = curr + prev;
			// 현재항은 이전항으로 치환
			prev = curr;
			// 다음항은 현재항으로 지환(새로운 현재항)
			curr = next;

		}

//		// for문 변경
//		for(int p=0 ,c=1, n=0; c<=MAX; n=p+c, p=c, c=n) {
//			sum += c;
//			System.out.print(c);
//			System.out.print(c==MAX ? "=":"+");
//		}
//		
		System.out.println(sum);
	}
	
	// 내 코드
	public static void main05(String[] args) {
		// 피보나치 수열
		// 1 + 1 - 2 + 3 - 5 + 8 - 13 + 21 = 14
		final int MAX = 21;
		int prev = 0; // 이전
		int curr = 1; // 현재
		int next = 0; // 다음
		int sum = 0;
		// 반복되는 횟수를 나타내는 정수형 count 변수 선언하고 1로 초기화
		int count = 1;
		// curr이 MAX보다 작거나 같을때 while문 수행
		while (curr <= MAX) {

			System.out.print(curr);
			// while문 loop가 홀수번째로 진행할 때
			if ((count % 2 != 0)) {
				// 첫번째 루프이면 sum에 curr값 더하고
				// 그외에는 curr 값 차감
				sum = (count == 1) ? sum + curr : sum - curr;
				// 홀수번째 반복할 땐 "+" 출력
				System.out.print(" + ");

				// while문 loop가 짝수번째로 진행될 때
			} else {
				sum += curr;
				// curr 값이 MAX와 동일하면 "=" 출력
				// 그외에는 "-"출력
				System.out.print((curr == MAX) ? " = " : " - ");
			}

			// 다음항은 이전항 + 현재항
			next = curr + prev;
			// 현재항은 이전항으로 치환
			prev = curr;
			// 다음항은 현재항으로 지환(새로운 현재항)
			curr = next;
			
			// 루프가 끝나면 1증가
			count++;
		}
		System.out.println(sum);
	}
	
	// 강사님 코드
	public static void main(String[] args) {
		// 피보나치 수열
		// 1 + 1 - 2 + 3 - 5 + 8 - 13 + 21 = 14
		
		final int MAX = 21;
		int prev = 0; // 이전
		int curr = 1; // 현재
		int next = 0; // 다음
		int sum = 0;
		
		// flag 알고리즘
		boolean flag = true;
		
		while(curr<=MAX) {
			System.out.print(curr);
			
			
			if(flag) {
				sum = curr ==1? curr : sum - curr;
				System.out.print(" + ");
				flag = false;
			}else {
				sum += curr;
				System.out.print((curr == MAX) ? " = " : " - ");
				flag = true;
			}
			
			next = curr + prev;
			prev = curr;
			curr = next;
			
		}
		System.out.println(sum);
	}
}
