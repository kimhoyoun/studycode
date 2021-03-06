package day1227.org.mymvc.view;

import day1227.org.mymvc.Binding;

public class MenuView extends StudentView{
	@Override
	public void display() {
		int no = 0;
		while (true) {
			try {
				System.out.println(":::::::::::::::::: MENU :::::::::::::::::::");
				System.out.println(" 1.입력 2.출력 3.검색 4.수정 5.삭제 6.종료");
				System.out.print("선택 >> ");
				no = scan.nextInt();
				while (no > 6 || no < 1) {
					System.out.println("범위를 넘었습니다.");
					System.out.print("다시 선택 : ");
					no = scan.nextInt();
				}
				break;
			} catch (Exception e) {
				System.out.println("숫자만 입력 하세요!");
				scan.next();
				continue;
			}
		} // end of while
		// no가 정상적으로 입력 되었다. => R의 no에 저장
		// R의 no에 바인딩 한다.
		Binding.no = no;
	}
}
