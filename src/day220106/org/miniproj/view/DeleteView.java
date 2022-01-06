package day220106.org.miniproj.view;

import day220106.org.miniproj.R;

public class DeleteView extends PhoneView {
	@Override
	public void display() {
		System.out.println("--------------------------DELETE-------------------------");
		
		if(R.phoneVo == null) {
			System.out.println("해당 정보가 없습니다!");
			return;
		}
		
		System.out.printf("%s의 정보를 삭제하시겠습니까?? (y or n)>> ",R.phoneVo.getName());
		char ch = getLine().charAt(0);
		
		if((ch=='y'||ch=='Y')) {
			System.out.printf("%s의 정보가 삭제되었습니다!\n",R.phoneVo.getName());
		}else {
			System.out.printf("%s의 정보를 삭제하지 않고 마쳤습니다!\n",R.phoneVo.getName());
			R.phoneVo = null;
		}
	}
}
