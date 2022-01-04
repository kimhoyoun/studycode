package day220104.org.ans.ex06;

public class Location {
	private String 도시;
	private int 경도;
	private int 위도;
	
	public Location() {
		this("",0,0);
	}
	
	public Location(String 도시, int 경도, int 위도) {
		this.도시 = 도시;
		this.경도 = 경도;
		this.위도 = 위도;
	}
	
	
	public String get도시() {
		return 도시;
	}

	public void set도시(String 도시) {
		this.도시 = 도시;
	}

	@Override
	public String toString() {
		return 도시 + "   " + 경도 + "   " + 위도;
	}
	
	

}
