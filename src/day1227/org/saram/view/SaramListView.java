package day1227.org.saram.view;

import day1227.org.saram.R;
import day1227.org.saram.model.SaramVo;

public class SaramListView extends SaramView {
	@Override
	public void display() {
		System.out.println(":::::::::::::::: 사람 목록 ::::::::::::::::");
		// R.saramArr 출력
		for(SaramVo saram : R.saramArr) {
			System.out.println(saram);
		}
	}
}
