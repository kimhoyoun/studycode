package day1223.ch05.ex03;
class People{
	private String name;
	private int age;
	private String job;
	
	// People 생성자
	
	People(){
		
	}
	People(String name, int age, String job){
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	public void showInfo() {
		System.out.printf("이름 : %s, 나이 : %d, 직업 : %s",name,age, job);
	}
	
	public void setInfo(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
}
public class Ch05Ex05 {

	public static void main(String[] args) {
		People p1 = new People("홍길동",23,"의적");
		p1.showInfo(); // 필드의 값을 출력
		
		People p2 = new People();
		p2.setInfo("이순신",35,"장군");
		p2.showInfo();
	}

}
