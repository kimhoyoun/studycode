package day1231.org.homework.training.challenge;

public class Alpha {
	private char al;
	StringBuffer sb = new StringBuffer("");
	
	public Alpha(char al) {
		this.al = al;
	}
	
	public void plus() {
		sb.append("-");
	}
	
	public char getAl() {
		return al;
	}
	
	@Override
	public String toString() {
		return String.format("%s%s", getAl(),sb);
	}
}
