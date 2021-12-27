package day1227.org.mymvc.view;

import day1227.org.mymvc.Binding;
import day1227.org.mymvc.model.StudentVo;

public class StudentListSelect extends StudentView {
	@Override
	public void display() {
		int no = 0;
		
		while (true) {
			try {
				System.out.println(":::::::::::::::: 전체 출력 ::::::::::::::::");
				System.out.println("1. No 순서 2.Rank 순서");
				System.out.print(">> ");
				no = scan.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("숫자만 입력하세요!");
				scan.next();
				continue;
			}
		}
		while (no > 2 || no < 1) {
			System.out.println("범위를 벗어났습니다!");
			System.out.print("다시 선택 >> ");
			no = scan.nextInt();
		}
		Binding.no =no;
	}
}