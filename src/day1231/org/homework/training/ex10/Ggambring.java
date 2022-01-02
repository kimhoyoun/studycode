package day1231.org.homework.training.ex10;

import java.util.Scanner;

public class Ggambring {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Person[] p = new Person[2];
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
