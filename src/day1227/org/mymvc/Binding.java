package day1227.org.mymvc;

import day1227.org.mymvc.controller.StudentController;
import day1227.org.mymvc.model.StudentVo;
import day1227.org.mymvc.view.InsertView;
import day1227.org.mymvc.view.MenuView;
import day1227.org.mymvc.view.StudentDelete;
import day1227.org.mymvc.view.StudentListSelect;
import day1227.org.mymvc.view.StudentModify;
import day1227.org.mymvc.view.StudentOne;
import day1227.org.mymvc.view.StudentOutAll;
import day1227.org.mymvc.view.StudentView;
import day1227.org.mymvc.view.ViewSearch;

public class Binding {
	public static int no;
	public static int type;
	public static final int OUTNO = 1;
	public static final int OUTRANK = 2;
	
	
	public static StudentVo studentVo; 
	public static StudentVo[] sArr; 
	
	public static final StudentView menu = new MenuView();
	public static final StudentView insert = new InsertView();
	public static final StudentView listOne = new StudentOne();
	public static final StudentView listSelect = new StudentListSelect();
	public static final StudentView outAll = new StudentOutAll();
	public static final StudentView search = new ViewSearch();
	
	public static final StudentView modify = new StudentModify();
	public static final StudentView delete = new StudentDelete();
	
	public static final StudentController controller = new StudentController();
}
