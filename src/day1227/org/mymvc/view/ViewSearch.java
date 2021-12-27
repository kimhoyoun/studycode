package day1227.org.mymvc.view;

import day1227.org.mymvc.Binding;
import day1227.org.mymvc.model.StudentVo;

public class ViewSearch extends StudentView{
	@Override
	public void display() {
		switch(Binding.no) {
		case 2:
			int no = 0;
			while (true) {
				try {
					System.out.println(":::::::::::::::: 학생 출력 ::::::::::::::::");
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
			Binding.type = no;
			break;
		case 3:
			System.out.println("::::::::::::: 상세 검색 ::::::::::::::");
			System.out.println("검색할 사람의 이름을 입력해 주세요!");
			System.out.print("이름 >>> ");
			String name = scan.next();
			Binding.studentVo = new StudentVo(0,name,0,0,0);
			break;
		case 4:
			System.out.println("::::::::::::: 정보 수정 ::::::::::::::");
			System.out.println("수정할 사람의 이름을 입력해 주세요!");
			System.out.print("이름 >>> ");
			name = scan.next();
			Binding.studentVo = new StudentVo(0,name,0,0,0);
			break;
		case 5:
			System.out.println("::::::::::::: 학생 삭제 ::::::::::::::");
			System.out.println("삭제할 사람의 이름을 입력해 주세요!");
			System.out.print("이름 >>> ");
			name = scan.next();
			Binding.studentVo = new StudentVo(0,name,0,0,0);
			break;
		}
	}
}
