package day1228.org.notice.controller;

import day1228.org.notice.R;
import day1228.org.notice.ViewContainer;
import day1228.org.notice.model.NoticeDao;

public class NoticeController {
	private static ViewContainer vc = new ViewContainer();
	private static NoticeDao dao = new NoticeDao();
	
	public void action() {
		vc.run(R.MENU);
		switch(R.no) {
		case 1: 
			vc.run(R.INSERT); 
			dao.insert(R.noticeVo);
			break;
		case 2:
			R.nArr = dao.selectAll();
			vc.run(R.LISTALL);
			break;
		case 3:
			vc.run(R.LISTSELECT);
			
			if(R.ListNum == 1) {
				vc.run(R.SEARCH);
				R.noticeVo = dao.selectOne(R.noticeVo);
				vc.run(R.LISTONE);				
			}else {
				vc.run(R.SEARCHWORD);
				R.nArr = dao.selectByWord(R.word);
				vc.run(R.LISTWORD);
			}
			
			break;
		case 4:
			vc.run(R.SEARCH);
			R.noticeVo = dao.selectOne(R.noticeVo);
			if(R.noticeVo !=null) {
				vc.run(R.UPDATE);
				dao.update(R.noticeVo);
			}
			break;
		case 5:
			vc.run(R.SEARCH);
			R.noticeVo = dao.selectOne(R.noticeVo);
			if(R.noticeVo !=null) {
				vc.run(R.DELETE);
				dao.delete(R.noticeVo);
			}
			break;
		case 6: System.out.println("프로그램 종료!"); System.exit(0); break;
		default : System.out.println("해당 사항 없습니다!");
		}
		
		R.no = 0;
		action();
	}
	
	
}
