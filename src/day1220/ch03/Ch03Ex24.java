package day1220.ch03;

import java.util.Arrays;
import java.util.Scanner;

public class Ch03Ex24 {
static Scanner sc = new Scanner(System.in);
	public static void main01(String[] args) {
		String[] names = new String[3];
		
		// 이름 3개를 연속적으로 입력해서 출력하기
		for(int i=0; i<names.length; i++) {
			System.out.printf("%d번째 이름 입력 >> ",i);
			names[i] = sc.next();
		}
		
		System.out.println(Arrays.toString(names));
		//검색어 입력
		System.out.print("검색어 입력 >> ");
		String keyWord = sc.next();
		for(int i =0; i<names.length; i++) {
			if(names[i].indexOf(keyWord)!=-1) {
				System.out.println(names[i]);
			}
		}
	}
	public static void main(String[] args) {
		String[] names = {"홍길동","이순신","강감찬"};
		int[][] score = {{95,100},{100,95},{80,85}};
		
		// 성명	국어	영어	총점
		// 홍길동	95	100	195
		// 이순신	100	95	195
		// 강감찬	80	85	165
		String[] title = {"성명","국어","영어","총점"};
		
		for(int i =0; i<title.length; i++) {
			System.out.printf("%s\t",title[i]);
		}
		System.out.println();
		
		for(int i =0; i<names.length; i++) {
			int sum =0;
			System.out.printf("%s\t",names[i]);
			for(int j = 0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%d\t",score[i][j]);
			}
			System.out.printf("%d\n",sum);
		}
	}
}
