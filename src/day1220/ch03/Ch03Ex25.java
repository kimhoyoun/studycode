package day1220.ch03;

public class Ch03Ex25 {
	
	private static void print(int[][] arr) {
		// 행열로 출력한다.
		for(int i=0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length;j++) {
				System.out.print((arr[i][j]==0)?"\t":arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main01(String[] args) {
		int[][] arr = new int[5][5];
		
		int num = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length;j++) {
				arr[j][i]=num++;
			}
		}
		print(arr);
	}
	
	public static void main02(String[] args) {
		int[][] arr = new int[5][5];
		int num = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j =0; j<i+1;j++) {
				arr[i][j]=num++;
			}
		}
		
		print(arr);
		System.out.println();
		
		
		int[][] arr1 = new int[5][5];
		num = 1;
		for(int i=0; i<arr1.length; i++) {
			for(int j =4-i; j<arr1.length;j++) {
				arr1[i][j]=num++;
			}
		}
		print(arr1);
	}
	
	public static void main(String[] args) {
		
//		1	2	3	4	5	
//			6	7	8		
//				9			
//			10	11	12		
//		13	14	15	16	17	
		
		int[][] arr = new int[5][5];
		int num = 1;
		for(int i =0; i<arr.length; i++) {
			int start = i<=2?i:4-i;
			int end = i<=2?4-i:i;
			for(int j = start; j<=end; j++) {
				arr[i][j] = num++;
			}
		}
		print(arr);
		
		// ---- 보너스 게임 ----
//		   1	2	3	4	5
//		   16	17	18	19	6
//		   15	24	25	20	7
//		   14	23	22	21	8
//		   13	12	11	10	9
	}

}
