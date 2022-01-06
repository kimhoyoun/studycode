package day220106.org.miniproj.controller;

import day220106.org.miniproj.R;
import day220106.org.miniproj.ViewContainer;
import day220106.org.miniproj.model.PhoneDAO;

public class PhoneController {
	private static ViewContainer vc = new ViewContainer();
	private static PhoneDAO dao = new PhoneDAO();

	public void start() {
			
		vc.run(R.MENU);
		
		switch(R.no) {
		case 1:
			vc.run(R.INPUT);
			if(!(dao.input(R.phoneVo)))
				vc.run(R.ERROR);
			break;
		case 2:
			R.phoneList = dao.print();
			vc.run(R.PRINT);
			break;
		case 3:
			vc.run(R.SEARCH);
			R.phoneVo = dao.search(R.phoneVo);
			vc.run(R.PRINTONE);
			break;
		case 4:
			vc.run(R.SEARCH);
			R.phoneVo = dao.search(R.phoneVo);
			vc.run(R.UPDATE);
			dao.update(R.phoneVo);
			break;
		case 5:
			vc.run(R.SEARCH);
			R.phoneVo=dao.search(R.phoneVo);
			vc.run(R.DELETE);
			if(R.phoneVo != null) {
				dao.delete(R.phoneVo);
			}
			break;
		case 6:
			System.out.println("주소록이 종료되었습니다");
			System.exit(0);
		default: System.out.println("해당사항 없습니다! 다시입력해 주세요!");
		}
		dao.save();
		R.no = 0;
		start();
	}
}
