package day1228.org.notice;

import day1228.org.notice.model.NoticeVo;
import day1228.org.notice.view.DeleteView;
import day1228.org.notice.view.InsertView;
import day1228.org.notice.view.ListAllView;
import day1228.org.notice.view.ListOneView;
import day1228.org.notice.view.ListSelectView;
import day1228.org.notice.view.ListWordView;
import day1228.org.notice.view.MenuView;
import day1228.org.notice.view.NoticeView;
import day1228.org.notice.view.SearchView;
import day1228.org.notice.view.SearchWordView;
import day1228.org.notice.view.UpdateView;

public class R {
	public static int no;
	public static int ListNum;
	public static String word;
	public static NoticeVo noticeVo;
	public static NoticeVo[] nArr;
	
	public static final int NAME = 1;
	public static final int WORD = 2; 
	
	public static final NoticeView MENU = new MenuView();
	public static final NoticeView INSERT = new InsertView();
	public static final NoticeView SEARCH = new SearchView();
	public static final NoticeView SEARCHWORD = new SearchWordView();
	public static final NoticeView LISTSELECT = new ListSelectView();
	public static final NoticeView LISTALL = new ListAllView();
	public static final NoticeView LISTONE = new ListOneView();
	public static final NoticeView LISTWORD = new ListWordView();
	public static final NoticeView UPDATE = new UpdateView();
	public static final NoticeView DELETE = new DeleteView();
}
