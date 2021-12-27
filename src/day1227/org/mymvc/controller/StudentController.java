package day1227.org.mymvc.controller;

import day1227.org.mymvc.Binding;
import day1227.org.mymvc.ViewContainer;
import day1227.org.mymvc.model.StudentDao;

public class StudentController {
	
	ViewContainer vc = new ViewContainer();
	StudentDao dao = new StudentDao();
	
	public void start() {
		if(Binding.no == 0) {
			vc.run(Binding.menu);
		}
		
		switch(Binding.no) {
		case 1: 
			vc.run(Binding.insert); 
			dao.insert(Binding.studentVo);
			break;
		case 2: 
			vc.run(Binding.search); 			
			if(Binding.type == Binding.OUTNO) {
				Binding.sArr = dao.outAll();
			}else {
				Binding.sArr = dao.outAll_Rank();
			}
			vc.run(Binding.outAll);
			break;
		case 3: 
			vc.run(Binding.search);
			Binding.studentVo = dao.search(Binding.studentVo);
			vc.run(Binding.listOne);
			break;
		case 4: 
			vc.run(Binding.search);
			Binding.studentVo = dao.search(Binding.studentVo);
			vc.run(Binding.modify);
			dao.modify(Binding.studentVo);
			break;
		case 5: 
			vc.run(Binding.search);
			Binding.studentVo = dao.search(Binding.studentVo);
			vc.run(Binding.delete); 
			dao.delete(Binding.studentVo);
			break;
			
		case 6: 
			System.out.println("프로그램 종료"); 
			System.exit(0); 
			break;
		}
		Binding.no =0;
		start();
	}
	
	
	
}
