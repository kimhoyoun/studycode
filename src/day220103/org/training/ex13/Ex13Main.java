package day220103.org.training.ex13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import day220103.org.training.Ex;
class Com{
	private String command;
	private String name;
	private String num;
	
	public Com(String command, String name, String num) {
		this.command = command;
		this.name = name;
		this.num = num;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return command + " " + name + " " + num;
	}
	
	
	
}
class Ex13 extends Ex{
	public static Scanner sc = new Scanner(System.in);
	public static int no = 1;
	// 명령저장
	private ArrayList<Com> program = new ArrayList<>();
	// 변수
	private HashMap<String, Integer> val = new HashMap<>();
	// 입력 종료 및 명령 시작
	private boolean flag = false;
	public Ex13() {
		start();
	}
	
	
	@Override
	public void run() {
		System.out.println("수퍼 컴이 작동합니다. 프로그램 입력해주세요. GO를 입력하면 작동합니다.");
		input();
		
		
	}
	
	public void input() {
		while(true) {
			System.out.print(">> ");
			String command = sc.next();
			String name = sc.next();
			String num = sc.next();
		
			if(command.toUpperCase().equals("GO")) {
				program.add(new Com(command,null,null));
				break;
			}
			program.add(new Com(command, name, num));
		}
		
	}
	
	public void run(Com c) {
		String go = c.getCommand();
		
		switch(go) {
		case "mov": mov(c); break;
		case "add": add(c); break;
		case "sub": sub(c); break;
		case "jn0": jn0(c); break;
		case "prt": prt(c); break;
		case "go": break;
		}
	}
	
	public int strToint(Com c) {
		int value;
		// 만약 값을 입력할 부분에 변수명이 나온다면
		// 그 변수명이 갖고 있는 value를 val HashMap에서 찾아서 대입
		try {
			value =Integer.parseInt(c.getNum());
		}catch(NumberFormatException e) {
			value = val.get(c.getNum());
		}
		
		return value;
	}

	private void mov(Com c) {
		int value = strToint(c);
		
		val.put(c.getName(), value);
		
	}


	private void add(Com c) {
		int value = strToint(c);
		
		val.put(c.getName(), val.get(c.getName())+value);
	}


	private void sub(Com c) {
		int value = strToint(c);
		
		val.put(c.getName(), val.get(c.getName())-value);
	}


	private void jn0(Com c) {
		// TODO Auto-generated method stub
		
	}


	private void prt(Com c) {
		// TODO Auto-generated method stub
		
	}




	
	
	
	
}

public class Ex13Main {

	public static void main(String[] args) {
		new Ex13();
	}

}
