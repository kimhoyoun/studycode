package day1227.org.mymvc.model;

public class StudentVo {
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	private int sum;
	private double avg;
	private int rank;
	private String grade;
	
	public StudentVo() {
		this(0,"",0,0,0);
	}
	
	public StudentVo(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		math();
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	// sum, avg, grade 결정
	public void math() {
		sum = kor+eng+math;
		avg = sum/3;
			
		switch ((int) avg / 10) {
		case 10:
		case 9:	grade = "A";break;
		case 8:	grade = "B";break;
		case 7:	grade = "C";break;
		case 6:	grade = "D";break;
		default:grade = "F";break;
		}
		
	}
	@Override
	public String toString() {
		return no + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math + "\t"
				+ sum + "\t" + String.format("%.2f",avg) + "\t" + rank + "\t" + grade;
	}

	
	
	
}
