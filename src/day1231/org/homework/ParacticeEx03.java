package day1231.org.homework;


public class ParacticeEx03 {
	public static void main(String[] args) {
		java.util.StringTokenizer st = new java.util.StringTokenizer("a=3,b=5,c=6", ",=");
		int sum = 0;
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			System.out.println(token);
			char c = token.charAt(0);
			if(Character.isDigit(c)) {
				sum += Integer.parseInt(token);
			}
		}
		System.out.println("합은 "+sum);
	}
}
