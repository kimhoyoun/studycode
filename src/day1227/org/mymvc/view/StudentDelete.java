package day1227.org.mymvc.view;

import day1227.org.mymvc.Binding;

public class StudentDelete extends StudentView{
	@Override
	public void display() {
		if(Binding.studentVo == null) {
			System.out.println("입력한 학생정보가 없습니다.");
		}else {
			System.out.printf("\"%s\"학생정보가 삭제되었습니다.\n",Binding.studentVo.getName());
		}
		
	}
}
