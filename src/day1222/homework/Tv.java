package day1222.homework;

public class Tv {
	String maker;
	int year;
	int inch;
	
	public Tv(String maker, int year, int inch) {
		this.maker = maker;
		this.year = year;
		this.inch = inch;
	}
	
	public void show() {
		System.out.printf("%s에서 만든 %d년형 %d인치 TV\n",maker, year, inch);
	}
	public static void main(String[] args) {
		Tv myTV = new Tv("LG",2017,32);
		myTV.show();
	}

}
