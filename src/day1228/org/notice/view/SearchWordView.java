package day1228.org.notice.view;

import day1228.org.notice.R;

public class SearchWordView extends NoticeView {
	@Override
	public void display() {
		System.out.println("--------------------------- SEARCH WORD ----------------------------");
		System.out.println("단어를 입력해 주세요!");
		System.out.print("입력 >> ");
		String s = sc.next();
		
		R.word = s;
	}
}
