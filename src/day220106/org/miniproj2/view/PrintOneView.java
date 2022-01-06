package day220106.org.miniproj2.view;

import day220106.org.miniproj.R;

public class PrintOneView extends PhoneView{
	@Override
	public void display() {
		System.out.println("--------------------------PRINT-------------------------");
		System.out.println("검색된 사람의 정보를 출력합니다!");
		System.out.println(R.phoneVo);
			
	}
}
