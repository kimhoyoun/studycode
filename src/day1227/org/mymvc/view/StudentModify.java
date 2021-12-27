package day1227.org.mymvc.view;

import static java.lang.System.out;

import day1227.org.mymvc.Binding;
import day1227.org.mymvc.model.StudentVo;

public class StudentModify extends StudentView {
	public void display() {
		int no =0;
		if (Binding.studentVo == null) {
			System.out.println("검색된 학생이 없습니다.");
		} else {
			System.out.println("어떤걸 수정하시겠습니까>");
			System.out.println("1.이름 2.국어점수 3.영어점수 4.수학점수");
			System.out.print("선택 >> ");
			no = scan.nextInt();
			switch (no) {
			case 1: 
				System.out.println("새로운 이름을 입력해 주세요!");
				System.out.print("이름 >> ");
				String newName = scan.next();
				Binding.studentVo.setName(newName);
				break;
			case 2:
				System.out.println("새로운 국어 점수를 입력해 주세요!");
				System.out.print("국어점수 >> ");
				int newKor = scan.nextInt();
				Binding.studentVo.setKor(newKor);
				break;
			case 3:
				System.out.println("새로운 영어 점수를 입력해 주세요!");
				System.out.print("영어점수 >> ");
				int newEng = scan.nextInt();
				Binding.studentVo.setEng(newEng);
				break;
			case 4:
				System.out.println("새로운 수학 점수를 입력해 주세요!");
				System.out.print("수학점수 >> ");
				int newMath = scan.nextInt();
				Binding.studentVo.setMath(newMath);
				break;
			}
			System.out.println("수정이 완료 되었습니다!");
		}
	}
}
