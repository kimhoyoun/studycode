package day220103.org.training.ex04;

import java.util.Vector;

import day220103.org.training.Ex;

class Ex04 extends Ex{
	public Ex04() {
		start();
	}
	@Override
	public void run() {
		Vector<Integer> v = new Vector<>();
		while(true) {
			System.out.print("강수량 입력 (0입력시 종료) >> ");
			int sum=0;
			int n = sc.nextInt();
			if(n==0) {
				break;
			}
			
			v.add(n);
			for(int i = 0; i<v.size(); i++) {
				System.out.print(v.get(i)+ " ");
				sum += v.get(i);
			}
			System.out.println();
			System.out.printf("현재 평균 %d\n",sum/v.size());
		}
	}
}

public class Ex04Main {

	public static void main(String[] args) {
		new Ex04();
	}

}
