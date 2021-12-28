package day1228.org.notice.view;

import day1228.org.notice.R;

public class ListOneView extends NoticeView {
	@Override
	public void display() {
		if(R.noticeVo == null) {
			System.out.println("메세지를 찾을 수 없습니다.");
			return;
		}
		System.out.println("--------------------------- LIST One ----------------------------");
		System.out.println(R.noticeVo);
	} 
	
}
