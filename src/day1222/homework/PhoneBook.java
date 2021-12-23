package day1222.homework;

import java.util.Scanner;

class Phone {
	private String name;
	private String tel;

	Phone() {

	}

	Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}

public class PhoneBook {
	static Phone[] intput() {
		System.out.print("인원수 >> ");
		int num = sc.nextInt();

		Phone[] phone = new Phone[num];

		for (int i = 0; i < phone.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈칸없이 입력 >> ");
			String name = sc.next();
			String tel = sc.next();
			phone[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");

		return phone;
	}

	static void search(Phone[] phone) {
		boolean flag = false;
		int index = -1;
		while (true) {

			System.out.print("검색할 이름 >> ");
			String name = sc.next();

			if(name.equals("그만")) {
				System.out.println("프로그램 종료! ");
				break;
			}
			
			for (int i = 0; i < phone.length; i++) {
				if (name.equals(phone[i].getName())) {
					index = i;
					break;
				} 
			}
			
			if(index == -1) {
				System.out.printf("%s 이 없습니다! \n", name);				
			}else {
				System.out.printf("%s의 번호는 %s입니다. \n", name, phone[index].getTel());				
			}
		}
	}

	static void run() {
		Phone[] phone = intput();
		search(phone);
		
	}

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		run();

	}

}
