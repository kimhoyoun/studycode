package day1224.ex02;

class GrandParent{
	public void sound() {
		System.out.println("할배의 나팔 뿅!");
	}
}

class Parent extends GrandParent{
	@Override
	public void sound() {
		System.out.println("아베의 나팔 삐리리!");
	}
}

class Child extends Parent{
	@Override
	public void sound() {
		System.out.println("손자의 나팔 뿡뿌!");
	}
}
public class Ch05Ex03 {

	public static void main(String[] args) {
		GrandParent[] gp = new GrandParent[5];
		gp[0] = new GrandParent();
		gp[1] = new Parent();
		gp[2] = new Child();
		gp[3] = new Parent();
		gp[4] = new Child();
		
		for(GrandParent h : gp) {
			h.sound();
		}
	}

}
