package day220106.org.miniproj.view;

import day220106.org.miniproj.R;
import day220106.org.miniproj.model.PhoneVo;

public class SearchView extends PhoneView {
	@Override
	public void display() {
		System.out.println("-------------------------SEARCH-------------------------");
		System.out.println("이름을 입력해주세요");
		System.out.print("이름 >> ");
		String name = getLine();
		
		R.phoneVo = new PhoneVo(0,name, null, null);
	}
}
