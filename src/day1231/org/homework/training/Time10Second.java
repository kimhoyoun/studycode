package day1231.org.homework.training;

import java.util.Calendar;
import java.util.Scanner;

public class Time10Second {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] name = { "황기태", "이재문" };
		int[] sum = { 0, 0 };
		System.out.println("10초에 가까운 사람이 이기는 게입입니다.");
		for (int i = 0; i < name.length; i++) {
			System.out.printf("%s 시작 <Enter>키 >> ", name[i]);
			sc.nextLine();
			System.out.printf("   현재 초 시간 == %d\n", Calendar.getInstance().get(Calendar.SECOND));
			sum[i] = Calendar.getInstance().get(Calendar.SECOND);
			System.out.print("10초 예상 후 <Enter>키 >> ");
			sc.nextLine();
			System.out.printf("   현재 초 시간 == %d\n", Calendar.getInstance().get(Calendar.SECOND));
			sum[i] = Calendar.getInstance().get(Calendar.SECOND)-sum[i];
			
			if(sum[i]<0) {
				sum[i] = 60 - Math.abs(sum[i]);
			}
		}
		System.out.printf("%s의 결과 %d, %s의 결과 %d, ",name[0],sum[0],name[1],sum[1]);
		if(Math.abs(10-sum[0])<Math.abs(10-sum[1])) {
			System.out.print("승자는 황기태");
		}else if (Math.abs(10-sum[0])>Math.abs(10-sum[1]))
			System.out.println("승자는 이재문");
		else
			System.out.println("비겼습니다.");
	}
}
