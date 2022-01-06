package day220106.org.miniproj;

import java.util.ArrayList;

import day220106.org.miniproj.model.PhoneVo;
import day220106.org.miniproj.view.DeleteView;
import day220106.org.miniproj.view.ErrorView;
import day220106.org.miniproj.view.InputView;
import day220106.org.miniproj.view.MenuView;
import day220106.org.miniproj.view.PhoneView;
import day220106.org.miniproj.view.PrintOneView;
import day220106.org.miniproj.view.PrintView;
import day220106.org.miniproj.view.SearchView;
import day220106.org.miniproj.view.UpdateView;

public class R {
	public static int num = 1;
	public static int no;
	public static int idx;
	public static PhoneVo phoneVo;
	public static ArrayList<PhoneVo> phoneList;
	
	
	public static final PhoneView MENU = new MenuView();
	public static final PhoneView INPUT = new InputView();
	public static final PhoneView PRINT = new PrintView();
	public static final PhoneView PRINTONE = new PrintOneView();
	public static final PhoneView SEARCH = new SearchView();
	public static final PhoneView DELETE = new DeleteView();
	public static final PhoneView UPDATE = new UpdateView();
	public static final PhoneView ERROR = new ErrorView();
	
}
