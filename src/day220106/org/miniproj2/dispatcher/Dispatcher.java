package day220106.org.miniproj2.dispatcher;

import java.util.HashMap;


public class Dispatcher {
	private HashMap<String, Controller> map = new HashMap<>();
	// 메뉴를 보여준다.
	String[] menuItems = new String[] { "게시판", "갤러리", "주소록", "종료" };
	{
		map.put(menuItems[0], new BoardController());
		map.put(menuItems[1], new GalleryController());
		map.put(menuItems[2], new AddressController());
		map.put(menuItems[3], new EndController());
	}

	public DispatcherEx() {
		action();
	}

	private void action() {
		Menu.display(menuItems);
		map.get(menuItems[Menu.no - 1]).run(); // 선택 한 Controller가 실행된다.
		// if~else문이나 switch~case 문을 안써도 됨.

		// 재귀호출
		action();

	}
}
