package day1228.org.notice.view;

import day1228.org.notice.R;

public class ListSelectView extends NoticeView {
	@Override
	public void display() {
		int no =0;
		System.out.println("------------------------- LIST SELECT --------------------------");
		
		
		while(true) {
			try {
				System.out.println("검색할 항목을 선택해주세요!");
				System.out.println("1. 이름 2.단어");
				System.out.print("선택 >> ");
				no = sc.nextInt();
				
				while(no>2||no<1) {
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
		R.ListNum = no;
	}
}
