package day1214;

public class Add {
	public static boolean isInt(String s) {
		try {
			Integer.parseInt(s);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
	public static void main(String[] args) {
		int i =0;
		int sum = 0;
		for(i =0; i<args.length; i++) {
			if(isInt(args[i])) {
				sum+=Integer.parseInt(args[i]);
			}
		}
		System.out.println(sum);
	}

}
