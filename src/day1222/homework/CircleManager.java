package day1222.homework;

import java.util.Scanner;

class Circle{
	private double x,y;
	private int radius;
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	public void show() {
		System.out.printf("(%.1f,%.1f)%d",x,y,radius);
	}
}
public class CircleManager {
	public static void main(String[] args) {
		int max = 0;
		int index = -1;
		Scanner sc = new Scanner(System.in);
		Circle[] c = new Circle[3];
		for(int i =0; i<c.length; i++) {
			System.out.print("x, y, radius >>> ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle(x,y,radius);
		}
		
		for(int i =0; i<c.length; i++) {
			if(max < c[i].getRadius()) {
				max = c[i].getRadius();
				index = i;
			}
		}
		System.out.print("가장 면적이 큰 원은 ");
		c[index].show();
		sc.close();
	}

}
