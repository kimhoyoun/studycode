package day1227.org.mymvc.view;

import day1227.org.mymvc.Binding;
import day1227.org.mymvc.model.StudentVo;

public class InsertView extends StudentView{
	@Override
	public void display() {
		System.out.println(":::::::::::::::: 입력 기능 ::::::::::::::::");
		System.out.print("이름 >> ");
		String name = scan.next();
		System.out.print("국어 점수 >> ");
		int kor = scan.nextInt();
		System.out.print("영어 점수 >> ");
		int eng = scan.nextInt();
		System.out.print("수학 점수 >> ");
		int math = scan.nextInt();
		Binding.studentVo = new StudentVo(0,name,kor,eng,math);
		System.out.println("입력 완료!");
	}
}
