package day1227.org.saram.view;

import day1227.org.saram.R;
import day1227.org.saram.model.SaramVo;

public class SaramDetail extends SaramView {
	@Override
	public void display() {
		if(R.type == R.SEARCH) {
			System.out.println("::::::::::::: 사람 정보 검색 ::::::::::::::");
			System.out.print("검색 할 이름 >> ");
			String name = scan.next();
			R.saramVo = new SaramVo(0, name, null, null);
			// controller로 이동
		}else {
			System.out.println("::::::::::: 사람 정보 상세 보기 :::::::::::");			
			System.out.println(R.saramVo);
		}
	}
}
