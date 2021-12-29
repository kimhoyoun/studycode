package day1229.org.example.ex01;

public class GoodCalc extends Calculator {

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] a) {
		int total =0;
		for(int i=0; i<a.length; i++) {
			total += a[i];
		}
		return (double)total/a.length;
	}

	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(5, 10));
		System.out.println(c.subtract(20, 10));
		System.out.println(c.average(new int[] {2,3,4,5,6,7}));
		
	}	

}
