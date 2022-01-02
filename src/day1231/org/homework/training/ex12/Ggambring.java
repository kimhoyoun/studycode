package day1231.org.homework.training.ex12;

import java.util.Scanner;

import day1231.org.homework.training.ex10.Person;

public class Ggambring {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("겜블링 겜임에 참여할 선수 숫자 >> ");
		int personNum = sc.nextInt();
		Person[] p = new Person[personNum];
		for(int i = 0; i<p.length; i++) {
			System.out.print((i+1)+"번째 선수 이름 >> ");
			p[i] = new Person(sc.next());
		}
		sc.nextLine();
		
		int n = 0;
		while(true) {
			System.out.printf("[%s]:<Enter>",p[n].getName());
			sc.nextLine();
			int[] num = new int[3];
			for(int i =0; i<3; i++) {
				num[i] = (int) (Math.random() * 3+1);
			}
			if(num[1] == num[0] && num[2] == num[0]) {
				System.out.printf("      %d  %d  %d %s님이 이겼습니다!\n",num[0],num[1],num[2],p[n].getName());				
				break;
			}else {
				System.out.printf("      %d  %d  %d 아쉽군요!\n",num[0],num[1],num[2]);				
			}
			
			n = (n==1)? 0 : n+1;
		}
	}

}
