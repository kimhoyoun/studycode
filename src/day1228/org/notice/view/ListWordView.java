package day1228.org.notice.view;

import day1228.org.notice.R;
import day1228.org.notice.model.NoticeVo;

public class ListWordView extends NoticeView {
	@Override
	public void display() {
		System.out.println("--------------------------- PRINT LIST ----------------------------");
		
		if(R.nArr == null) {
			System.out.printf("\"%s\"를 포함한 메세지를 찾을 수 없습니다!\n",R.word);
			return;
		}
		
		System.out.printf("\"%s\" 를 포함한 메세지 목록입니다. \n",R.word);
		for(NoticeVo vo : R.nArr) {
			if(vo == null) {
				return;
			}
			System.out.println(vo);
		}
	}
}
