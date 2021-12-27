package day1227.org.mymvc.model;

import static java.lang.System.out;

public class StudentDao {
	public static final int MAX = 100;
	public static final StudentVo[] sArr = new StudentVo[MAX];
	
	public static int top = 0;
	public static int sequenceNo = 1;
	
	static {
		sArr[top++] = new StudentVo(sequenceNo++, "KIM", 60, 60, 75);
		sArr[top++] = new StudentVo(sequenceNo++, "PARK", 90, 100, 95);
		sArr[top++] = new StudentVo(sequenceNo++, "LEE", 90, 80, 80);
		rank(sArr);
	}
	
		
	// rank 계산
	static void rank(StudentVo[] studentVo) {
		for(int i =0; i<top; i++) {
			int r = top;
			for(int j =0; j<top; j++) {
				if(studentVo[i].getSum() >studentVo[j].getSum()) {
					r--;				
				}
				// 총점이 같다면 no(번호)가 낮은 사람의 등수가 더 높게
				if((studentVo[i].getSum() == studentVo[j].getSum())&&(studentVo[i].getNo()<studentVo[j].getNo())) {
					r--;
				}
			}
			studentVo[i].setRank(r);
		}
	} // end of rank
	
	public void insert(StudentVo vo) {
		// top이 MAX보다 클경우 용량초과이므로 더이상 입력 불가하도록 함. 
		if(top >= MAX) {
			System.out.println("더이상 입력이 불가능합니다!");
			return;
		}
		vo.setNo(sequenceNo++);
		sArr[top++] = vo;
		rank(sArr);
	}
	
	// 한명 검색
	public StudentVo search(StudentVo vo) {
		for(int i =0; i<top; i++) {
			if(sArr[i].getName().equals(vo.getName())){
				StudentVo newStudent = new StudentVo();
				newStudent.setNo(sArr[i].getNo());
				newStudent.setName(sArr[i].getName());
				newStudent.setKor(sArr[i].getKor());
				newStudent.setEng(sArr[i].getEng());
				newStudent.setMath(sArr[i].getMath());
				newStudent.math();
				newStudent.setRank(sArr[i].getRank());
				return newStudent;
			}
		}
		return null;
	}
	
	// 모두 출력(no)
	public StudentVo[] outAll() {
		StudentVo[] studentAll= new StudentVo[top];
		for(int i =0; i<studentAll.length; i++) {
			StudentVo tempStudent = new StudentVo();
			tempStudent.setNo(sArr[i].getNo());
			tempStudent.setName(sArr[i].getName());
			tempStudent.setKor(sArr[i].getKor());
			tempStudent.setEng(sArr[i].getEng());
			tempStudent.setMath(sArr[i].getMath());
			tempStudent.math();
			studentAll[i] = tempStudent;
		}
		rank(studentAll);
		return studentAll;
	}
	
	// 모두 출력(rank)
	public StudentVo[] outAll_Rank() {
		StudentVo[] tempAll = new StudentVo[top];
		for(int i=1; i<tempAll.length+1; i++) {
			for(int j =0; j<tempAll.length; j++) {
				if(sArr[j].getRank() == i) {
					StudentVo tempStudent = new StudentVo();
					tempStudent.setNo(sArr[j].getNo());
					tempStudent.setName(sArr[j].getName());
					tempStudent.setKor(sArr[j].getKor());
					tempStudent.setEng(sArr[j].getEng());
					tempStudent.setMath(sArr[j].getMath());
					tempStudent.math();
					tempAll[i-1] = tempStudent; 
				}
			}
		}
		rank(tempAll);
		return tempAll;
	}
	
	// 이름은 바뀔 수 도 있으니 바뀌지않는 번호 검색해서 값 수정
	public void modify(StudentVo vo) {
		if(vo == null) {
			return;
		}else {
			
			for(int i =0; i<top; i++) {
				if(sArr[i].getNo()==(vo.getNo())) {
					sArr[i] = vo;
					sArr[i].math();
				}
			}
			rank(sArr);
		}
	}
	
	public void delete(StudentVo vo) {
		if(vo == null) {
			return;
		}else {	
			for(int i =0; i<top; i++) {
				if(sArr[i].getName().equals(vo.getName())) {
					for(int j = i; j<top-1; j++) {
						sArr[j] = sArr[j+1];
					}
					sArr[top-1]=null;
					top--;
				}
			}
			rank(sArr);
		}
	}
}
