package day1227.org.saram.view;

import day1227.org.saram.R;

public class SaramDelete extends SaramView {
	@Override
	public void display() {
		System.out.println(":::::::::::::: 사람 정보 삭제 :::::::::::::");
		if(R.saramVo == null) {
			System.out.println("검색된 사람이 없습니다.");
		}else {
			System.out.println("삭제가 완료 되었습니다.");
		}			
	}
}
