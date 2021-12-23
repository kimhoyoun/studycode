package day1222.homework;

import java.util.Arrays;

class ArrayUtil{
	public static int [] concat(int[] a, int[] b) {
		// 배열 a와 b를 연결한 새로운 배열 리턴 
		int[] narr = new int[a.length+b.length];
		
		for(int i =0; i<narr.length; i++) {
			if(i<a.length) {
				narr[i] = a[i];				
			}else {
				narr[i] = b[i-a.length];				
			}
		}
				
		return narr;
	}
	
	public static void print(int[] a) {
		// 배열 a 출략
		System.out.println(Arrays.toString(a));
	}
}
public class StaticEx {

	public static void main(String[] args) {
		int [] arr1 = {1,5,7,9};
		int [] arr2 = {3,6,-1,100,77};
		int [] arr3 = ArrayUtil.concat(arr1, arr2);
		ArrayUtil.print(arr3);
	}

}
