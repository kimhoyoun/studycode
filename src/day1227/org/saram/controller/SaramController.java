package day1227.org.saram.controller;

import day1227.org.saram.R;
import day1227.org.saram.ViewContainer;
import day1227.org.saram.model.SaramDao;

public class SaramController {
	private ViewContainer vc = new ViewContainer();
	public static SaramDao dao = new SaramDao();
	public void action() {
//		System.out.println(">>>> SaramController 실행 ....");
		// no가 0이면 아직 선택이 안되었다.
		if(R.no == 0) {
			vc.run(R.menuView); // 동적 바인딩 처리된다.
		}
		
		switch(R.no) {
		case 1: 
			vc.run(R.insertView); 
			dao.insert(R.saramVo);
			break;
		case 2: 
			R.saramArr = dao.selectAll();
			vc.run(R.saramListView); 
			break;
		case 3: 
			vc.run(R.searchByName); 
			R.saramVo = dao.selectOne(R.saramVo);
			vc.run(R.saramDetail);
			break;
		case 4: 
			// 내코드
//			R.type = R.SEARCH;
//			vc.run(R.saramDetail);
//			R.saramVo = dao.selectOne(R.saramVo);
//			vc.run(R.saramEdit); 
//			dao.update(R.saramVo);			
			
			// 강사님 코드
			vc.run(R.searchByName);
			R.saramVo = dao.selectOne(R.saramVo);
			vc.run(R.saramEdit);
			if(R.saramVo != null) {
				dao.update(R.saramVo);
			}
			break;
		case 5: 
			// 내코드
//			R.type = R.SEARCH;
//			vc.run(R.saramDetail);
//			R.saramVo = dao.selectOne(R.saramVo);
//			vc.run(R.saramDelete); 
//			dao.delete(R.saramVo);
			
			vc.run(R.searchByName);
			R.saramVo = dao.selectOne(R.saramVo);
			vc.run(R.saramDelete);
			if(R.saramVo != null) {
				dao.update(R.saramVo);
			}
			break;
				
		case 6: System.out.println("프로그램 종료"); System.exit(0); break;
		default : System.out.println("해당 기능이 없습니다!");	
		}
		
		// 재귀 호출
		R.no = 0;
		action();
	}
}
