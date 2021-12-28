package day1228.org.notice.view;

import day1228.org.notice.R;
import day1228.org.notice.model.NoticeVo;

public class SearchView extends NoticeView {
	@Override
	public void display() {
		System.out.println("--------------------------- SEARCH USER----------------------------");
		System.out.println("검색할 사람의 이름을 입력해 주세요!");
		System.out.print("이름 >> ");
		String name = sc.next();
		
		R.noticeVo = new NoticeVo(0,name,"","");
	}
}
