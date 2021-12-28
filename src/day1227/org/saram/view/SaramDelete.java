package day1227.org.saram.view;

import day1227.org.saram.R;

public class SaramDelete extends SaramView {
	@Override
	public void display() {
		System.out.println(":::::::::::::: 사람 정보 삭제 :::::::::::::");
		if(R.saramVo == null) {
			System.out.println("검색된 사람이 없습니다.");
			return;
		}
		
		System.out.println(R.saramVo);
		System.out.println("정말로 삭제 하시겠습니까? [y/n]");
		char yn = scan.next().charAt(0);
		if(yn == 'n') {
			R.saramVo = null;
		}
		System.out.println("삭제가 완료 되었습니다.");
					
	}
}
