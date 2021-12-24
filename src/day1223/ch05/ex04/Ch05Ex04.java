package day1223.ch05.ex04;

class Person{
	private String name;
	
	public Person() {
		System.out.println(">>> 사람의 생성자 호출");
	}
	public Person(String name) {
		this.name = name;
		System.out.println(">>> 사람의 매개변수가 있는 생성자 호출");
	}
}

class Student extends Person{
	public Student() {
		System.out.println(">>> 2. 학생의 생성자 호출");
	}
}

class WorkStudent extends Student{
	public WorkStudent() {
		System.out.println(">> 3. 근로학생의 생성자 호출!");
	}
}
public class Ch05Ex04 {

	public static void main(String[] args) {
		Person p = new Person();
		Student s = new Student();
		WorkStudent w = new WorkStudent();
	
	}

}
