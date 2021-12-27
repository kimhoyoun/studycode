package day1227.org.mymvc.view;

import day1227.org.mymvc.Binding;
import day1227.org.mymvc.model.StudentVo;

public class StudentOutAll extends StudentView{
	@Override
	public void display() {
		if(Binding.type == Binding.OUTNO) {
			System.out.println(":::::::::::::::::::::::::: 번호 순서 출력 ::::::::::::::::::::::::::");
			title();
		}else {
			System.out.println(":::::::::::::::::::::::::: Rank 순서 출력 ::::::::::::::::::::::::::");
			title();
		}
			for(StudentVo vo : Binding.sArr) {
				System.out.println(vo);
			}
	}
}
