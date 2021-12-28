package day1228.org.notice.view;

import day1228.org.notice.R;

public class MenuView extends NoticeView {
	@Override
	public void display() {
		System.out.println("------------------------------ MENU ------------------------------");
		int no =0;
		
		while(true) {
			try {
				System.out.println("1.Insert 2.Print 3.Search 4.Update 5.Delete 6.Exit");
				System.out.print("선택 >> ");
				no = sc.nextInt();
				
				while(no>6||no<1) {
					System.out.println("범위를 벗어났습니다!");
					System.out.print("다시 선택 >> ");
					no = sc.nextInt();
				}
				break;
			}catch(Exception e) {
				System.out.println("숫자만 입력하세요!");
				sc.next();
				continue;
			}
		}
		R.no = no;
	}
}
