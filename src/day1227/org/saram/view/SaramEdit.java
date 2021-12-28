package day1227.org.saram.view;

import day1227.org.saram.R;

public class SaramEdit extends SaramView {
	@Override
	public void display() {
		System.out.println("::::::::::::: 사람 정보 수정 ::::::::::::::");
		// 내코드
		// switch - case로 하면 한번에 여러항목을 수정하기위해 번거로운 과정을 거쳐야 한다.
		// 각각 수정하겟냐고 물어보고 y면 수정 n이면 넘어가도록 짜는것이 더 효율적!!
		// 제어문이 들어간다고 controller로 가는게 아니라 view에서도 처리 가능!
		
//		int no =0;
//		if (R.saramVo == null) {
//			System.out.println("검색된 학생이 없습니다.");
//		} else {
//			System.out.println("어떤걸 수정하시겠습니까>");
//			System.out.println("1.이름 2.전화번호 3.이메일");
//			System.out.print("선택 >> ");
//			no = scan.nextInt();
//			switch (no) {
//			case 1: 
//				System.out.println("새로운 이름을 입력해 주세요!");
//				System.out.print("이름 >> ");
//				String newName = scan.next();
//				R.saramVo.setName(newName);
//				break;
//			case 2:
//				System.out.println("새로운 전화번호를 입력해 주세요!");
//				System.out.print("전화번호 >> ");
//				String newPhone = scan.next();
//				R.saramVo.setPhone(newPhone);
//				break;
//			case 3:
//				System.out.println("새로운 이메일을 입력해 주세요!");
//				System.out.print("이메일 >> ");
//				String newEmail = scan.next();
//				R.saramVo.setEmail(newEmail);
//				break;
//			}
//			System.out.println("수정이 완료 되었습니다!");
//		}
		
		// 강사님 코드
		if(R.saramVo == null) {
			System.out.println("검색 결과 없습니다!");
			return;
		}
		System.out.println(R.saramVo);
		System.out.print("새 이름 >> ");
		R.saramVo.setName(scan.next());
		System.out.print("새 전화번호 >> ");
		R.saramVo.setPhone(scan.next());
		System.out.print("새 이메일 >> ");
		R.saramVo.setEmail(scan.next());
		
	}
}
