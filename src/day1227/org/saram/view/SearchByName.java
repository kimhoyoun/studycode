package day1227.org.saram.view;

import day1227.org.saram.R;
import day1227.org.saram.model.SaramVo;

public class SearchByName extends SaramView{
	@Override
	public void display() {
		System.out.println("::::::::::::: 사람 정보 검색 ::::::::::::::");
		System.out.print("검색 할 이름 >> ");
		String name = scan.next();
		R.saramVo = new SaramVo(0, name, null, null);
	}
}
