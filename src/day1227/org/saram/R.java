package day1227.org.saram;

import day1227.org.saram.controller.SaramController;
import day1227.org.saram.model.SaramVo;
import day1227.org.saram.view.InsertView;
import day1227.org.saram.view.MenuView;
import day1227.org.saram.view.SaramDelete;
import day1227.org.saram.view.SaramDetail;
import day1227.org.saram.view.SaramEdit;
import day1227.org.saram.view.SaramListView;
import day1227.org.saram.view.SaramView;

// 데이터 바인딩을 위한 클래스 R
public class R {
	// 값이 변하므로 final x
	// menu 선택값 no
	public static int no;
	public static SaramVo saramVo;
	public static SaramVo[] saramArr;
	// 검색
	public static final int SEARCH = 0;
	// 상세정보
	public static final int DETAIL = 1;
	public static int type = 0;
	public static String searchName ="";
	
	// 값이 고정되므로 fianl o
	public static final SaramView menuView = new MenuView();

	public static final SaramView insertView = new InsertView();
	public static final SaramView saramDelete = new SaramDelete();
	public static final SaramView saramDetail = new SaramDetail();
	public static final SaramView saramEdit = new SaramEdit();
	public static final SaramView saramListView = new SaramListView();
	
	public static final SaramController saramController = new SaramController();
}
