package day220104.org.ans.ex05;

public class Student{
	String 이름;
	String 학과;
	String 학번;
	String 평균;
	
	public Student() {
		this("","","","");
	}
	
	public Student(String 이름, String 학과, String 학번, String 평균) {
		this.이름 = 이름;
		this.학과 = 학과;
		this.학번 = 학번;
		this.평균 = 평균;
		
	}

	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	
	@Override
	public String toString() {
		return 이름 +", "+ 학과+", "+ 학번+", "+ 평균;
	}
	
	public String toString(int i) {
		return "이름: "+이름+ "\n학과: "+학과+"\n학번: "+학번+"\n평균: "+평균;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((이름 == null) ? 0 : 이름.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (이름 == null) {
			if (other.이름 != null)
				return false;
		} else if (!이름.equals(other.이름))
			return false;
		return true;
	}
	
	
}