package day1229.org.homework;
// Ex01
class Tv {
	private int size;

	public Tv(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class ColorTv extends Tv {
	int color;
	public ColorTv(int size, int color) {
		super(size);
		this.color = color;
	}
	
	public void printProperty() {
		System.out.println(getSize() + "인치 " + color+"컬러");
	}
}
// Ex02
class IPTV extends ColorTv{
	String ip;
	public IPTV(String ip,int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	@Override
	public void printProperty() {
		System.out.printf("나의 IPTV는 %s 주소의 %d인치 %d컬러\n",ip,getSize(),color);
	}
}
public class Ex0102 {
	public static void main01(String[] args) {
		// Ex01
		ColorTv myTv = new ColorTv(32, 1024);
		myTv.printProperty();	
	}
	
	public static void main02(String[] args) {
		// Ex02
		IPTV iptv = new IPTV("192.1.1.2",32,2048);
		iptv.printProperty();
	}
}
