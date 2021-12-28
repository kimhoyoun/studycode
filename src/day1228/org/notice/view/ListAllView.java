package day1228.org.notice.view;

import day1228.org.notice.R;
import day1228.org.notice.model.NoticeVo;

public class ListAllView extends NoticeView {
	@Override
	public void display() {
		System.out.println("--------------------------- ALL List ----------------------------");
		for(NoticeVo vo : R.nArr) {
			System.out.println(vo);
		}
	}
}
