package day1220.ch03;

import java.util.Arrays;

public class Ch03Ex22 {

	public static void main00(String[] args) {
		String[] name = {"오징어","꼴뚜기","대구","명태","거북이"};
		int[] price = {9000, 3000, 5000, 6000, 20000};
		
		for(int i =0; i<name.length; i++) {
			System.out.printf("%s의 가격은 %d원입니다. \n",name[i],price[i]);
		}
	}
	
	public static void main01(String[] args) {
		int[] arr= {10,20,30,40,50};
		// Arrays를 이용해서 순서대로 출력
		System.out.println(Arrays.toString(arr));
		
		// 반복문을 이용해서 arr배열의 요소값의 위치를 reverse 한다.
		for(int i =0; i<arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
	
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int [] arr = {7,3,2,8,1,6,9,4,5};
		System.out.println(Arrays.toString(arr));
		// 오름차순 정렬해서 출력하시오.
		// 선택 정렬
		for(int i =0; i<arr.length-1; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("선택정렬 arr1 : "+Arrays.toString(arr));	
		
		
		// 버블정렬
		int [] arr2 = {7,3,2,8,1,6,9,4,5};
		for(int i =0; i<arr2.length-1; i++) {
			for(int j = 0; j<arr2.length-1-i; j++) {
				if(arr2[j] > arr2[j+1]) {
					int temp = arr2[j];
					arr2[j] = arr2[j+1];
					arr2[j+1] = temp;
				}
			}
		}
		System.out.println("버블정렬 arr2 : "+Arrays.toString(arr2));	
		
		// 과제
		// 삽입정렬
		int [] arr3= {7,3,2,8,1,6,9,4,5};
		for(int i =1; i<arr3.length; i++) {
			int key = arr3[i];
			for(int j = i-1; j>=0; j--) {
				if(arr3[j] > key) {
					arr3[j+1] = arr3[j];
					arr3[j] = key;
				}
			}
		}
		System.out.println("삽입정렬 arr3 : "+Arrays.toString(arr3));	
	}
	// 내 코드
	public static void main03(String[] args) {
		final int SIZE = 6;
		int[] lotto1 = new int[SIZE];
	
		int num = (int)(1+Math.random()*45);
		lotto1[0] = num;
		
		for(int i=1; i<SIZE; i++) {
			num = (int)(1+Math.random()*45);
			int equal =0;
			
			for(int j =0; j<i; j++) {
				if(lotto1[j]==num) {
					equal++;
				}
			}
			
			if(equal == 0) {
				lotto1[i]=num;
			}else {
				i -=1;
			}
			
		}
		
		// 로또번호가 중복 없이 나오도록 개선하시오.
		System.out.println(Arrays.toString(lotto1));
		
		int[] lotto2 = new int[SIZE];
		
		for(int i =0; i<SIZE; i++) {
			num = (int)(1+Math.random()*45);
			for(int j =0; j<i; j++) {
				if(lotto2[j]==num) {
					num = (int)(1+Math.random()*45);
					j = -1;
				}
			}
			lotto2[i] = num;
		}
		System.out.println(Arrays.toString(lotto2));
		
		
		int[] lotto3 = new int[SIZE];
		num = (int)(1+Math.random()*45);
		int i = 0;
		
		while(i<SIZE) {
			num = (int)(1+Math.random()*45);
			for(int j =0; j<i; j++) {
				if(lotto3[j] == num) {
					num = (int)(1+Math.random()*45);
					j =-1;
				}
			}
			lotto3[i] = num;
			i++;
		}

		System.out.println(Arrays.toString(lotto3));
	}
	// 강사님 코드 1
	public static void main_lotto01(String[] args) {
		final int SIZE =6;
		int[] lotto = new int[SIZE];
		
		for(int i=0; i<SIZE; i++) {
			int num = (int)(1+Math.random()*45);
			// 새로 생성한 num의 값과 lotto배열에 저장된 요소를 비교한다.
			// num과 같은 값이 이미 있다면 다시 num을 생성한다.
			// 새로 생성한 num과 lotto의 요소를 비교한다. (계속 반복)
			for(int j =0; j<i; j++) {
				if(num == lotto[j]) {
					num = (int)(1+Math.random()*45);
					j = -1;
				}
			}
			
			lotto[i] = num;
		}
		
		System.out.println(Arrays.toString(lotto));
	}
	// 강사님 코드 2
	public static void main_lotto02(String[] args) {
		final int SIZE =6;
		int[] lotto = new int[SIZE];
		
		int cnt = 0;
		while(cnt<6) {
			lotto[cnt] = (int)(1+Math.random()*6);
			// cnt값을 증가 할것인가 말것인가에 대한 조건을 판단할 flag 선언
			// 같은값이 있으면 false, 그렇지 않으면 true
			boolean flag = true;
			for(int i =0; i<cnt; i++) {
				// 중복되면 for문 탈출하고 flag false
				if(lotto[cnt] == lotto[i]) {
					flag = false;
					break;
				}
			}
			// flag가 true일 때만 cnt 증가
			if(flag) {
				cnt++;
				
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
	
	public static void main_lotto3(String[] args) {
		// 1 ~ 45 까지 저장되어 있는 배열을 선언 (공이 있다고 생각)
		final int MAX = 6;
		int [] lotto = new int[6];
		int[] balls = new int[45];
		// 1 ~ 45값을 갖는 볼 생성
		for(int i =1; i<=45; i++) {
			balls[i-1] = i;
		}
		System.out.println("1~45까지의 공이 준비되었다.");
		// 1. balls의 index를 랜덤하게 선택한다.
		// 2. 그 index 위치의 번호가 0이 아니면 lotto 배열에 저장.
		// 3. 뽑아온 index 위치의 값을 0으로 변경.
		// 4. index위치의 값이 0이면 다른 랜덤한 index 선택.
		
		// 강사님 코드
		for(int i=0; i<lotto.length;) {
			int index = (int)(Math.random()*45); // 0 ~ 44까지의 난수 발생
			if(balls[index]!=0) {
				lotto[i] = balls[index];
				balls[index]=0;
				i++;
			}
		}
		System.out.println(Arrays.toString(lotto));
		
		// 내 코드
//		for(int i =0; i<6; i++) {
//			// 위치를 랜덤하게 뽑아서 그 위치의 공을 선택
//			int num = (int)(Math.random()*45);
//			// balls의 값이 0이면 num 다시 뽑고 i 1감소시키고 반복
//			if(balls[num] == 0) {
//				num = (int)(Math.random()*45);
//				i--;
//			// balls 값이 0이 아니면 해당 값 lotto에 저장하고 balls[num]값 0으로 바꿈.
//			}else {
//				lotto[i] = balls[num];
//				balls[num] = 0;
//			}
//		
//		}
//		System.out.println(Arrays.toString(balls));
//		System.out.println(Arrays.toString(lotto));
		

		
	}
}
