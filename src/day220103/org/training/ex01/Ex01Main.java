package day220103.org.training.ex01;

import java.util.Vector;

import day220103.org.training.Ex;

class Ex01 extends Ex{
	public Ex01() {
		start();
	}

	@Override
	public void run() {
		Vector<Integer> v = new Vector<>();
		System.out.print("정수(-1이 입력될 때 까지) >> ");
		while(true) {
			int num =sc.nextInt();
			if(num == -1) {
				break;
			}
			v.add(num);
		}
	
		int max = 0;
		for(int i =0; i<v.size(); i++) {
			if(max < v.get(i)) {
				max = v.get(i);
			}
		}
		System.out.println("가장 큰 수는 "+max);
		
	}
}

public class Ex01Main {
	public static void main(String[] args) {
		new Ex01();
	}

}
