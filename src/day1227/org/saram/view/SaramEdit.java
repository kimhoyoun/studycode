package day1227.org.saram.view;

import day1227.org.saram.R;

public class SaramEdit extends SaramView {
	@Override
	public void display() {
		System.out.println("::::::::::::: 사람 정보 수정 ::::::::::::::");
		int no =0;
		if (R.saramVo == null) {
			System.out.println("검색된 학생이 없습니다.");
		} else {
			System.out.println("어떤걸 수정하시겠습니까>");
			System.out.println("1.이름 2.전화번호 3.이메일");
			System.out.print("선택 >> ");
			no = scan.nextInt();
			switch (no) {
			case 1: 
				System.out.println("새로운 이름을 입력해 주세요!");
				System.out.print("이름 >> ");
				String newName = scan.next();
				R.saramVo.setName(newName);
				break;
			case 2:
				System.out.println("새로운 전화번호를 입력해 주세요!");
				System.out.print("전화번호 >> ");
				String newPhone = scan.next();
				R.saramVo.setPhone(newPhone);
				break;
			case 3:
				System.out.println("새로운 이메일을 입력해 주세요!");
				System.out.print("이메일 >> ");
				String newEmail = scan.next();
				R.saramVo.setEmail(newEmail);
				break;
			}
			System.out.println("수정이 완료 되었습니다!");
		}
	}
}
