package day220106.org.miniproj.view;

import java.util.Iterator;

import day220106.org.miniproj.R;
import day220106.org.miniproj.model.PhoneVo;

public class PrintView extends PhoneView {
	@Override
	public void display() {
		System.out.println("--------------------------PRINT-------------------------");
		if (R.phoneList == null) {
			System.out.println("저장된 목록이 없습니다!");
			return;
		}
		System.out.println("저장된 목록을 출력합니다!");

		Iterator<PhoneVo> it = R.phoneList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
