package day1228.org.notice.view;

import day1228.org.notice.R;

public class DeleteView extends NoticeView{
	@Override
	public void display() {
		System.out.println("----------------------------- DELETE ------------------------------");
		System.out.print("정말로 삭제하시겠습니까? (y/n) >> ");
		char yn = sc.next().charAt(0);
		if(yn == 'n' || yn == 'N') {
			R.noticeVo = null;
		}else {
			System.out.println("메세지가 삭제 되었습니다!");
		}
	}
}
