package day1227.org.mymvc.view;

import day1227.org.mymvc.Binding;
import day1227.org.mymvc.model.StudentVo;

public class StudentOne extends StudentView{
	@Override
	public void display() {
		System.out.println(":::::::::::::::::::::::::: 상세 검색 ::::::::::::::::::::::::::");
		title();
			System.out.println(Binding.studentVo);
	}
}
