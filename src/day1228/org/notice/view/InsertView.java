package day1228.org.notice.view;

import day1228.org.notice.DateGet;
import day1228.org.notice.R;
import day1228.org.notice.model.NoticeVo;

public class InsertView extends NoticeView{
	@Override
	public void display() {
		System.out.println("----------------------------- INSERT ------------------------------");
		System.out.print("User >> ");
		String user = sc.next();
		System.out.print("Message >> ");
		String message = sc.next();
		String date = new DateGet().getDate();
		
		R.noticeVo = new NoticeVo(0,user,message,date);
		System.out.println("입력 완료!");
	}
}
