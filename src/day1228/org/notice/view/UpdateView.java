package day1228.org.notice.view;

import day1228.org.notice.DateGet;
import day1228.org.notice.R;

public class UpdateView extends NoticeView {
	@Override
	public void display() {
		System.out.println("----------------------------- UPDATE ------------------------------");
		System.out.println(R.noticeVo);
		
		System.out.print("이름을 수정하시겠습니까? (y/n) >> ");
		char yn = sc.next().charAt(0);
		if(yn == 'y'|| yn == 'Y') {
			System.out.print("새 이름 입력 >> ");
			String newUser = sc.next();
			R.noticeVo.setUser(newUser);
		}
		System.out.print("메세지를 수정하시겠습니까? (y/n) >> ");
		yn = sc.next().charAt(0);
		if(yn == 'y'|| yn == 'Y') {
			System.out.print("새 메세지 입력 >> ");
			sc.nextLine();
			String newMessage = sc.nextLine();
			R.noticeVo.setMessage(newMessage);
		}
		System.out.println("날짜 및 시간이 수정되었습니다. ");
		String newDate = new DateGet().getDate();
		R.noticeVo.setRegDate(newDate);
		
		}
		
	}

