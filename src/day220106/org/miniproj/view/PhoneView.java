package day220106.org.miniproj.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class PhoneView{
	public abstract void display();
	
	protected String getLine() {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try {
			return br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}

	protected int getNum() {
		int num;
		while(true) {
			
		try {
			String s = getLine();
			StringBuffer s2 = new StringBuffer();
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (ch >= '0' && ch <= '9' || ch == '-') {
					s2.append(ch);
				}
			}
			num = Integer.parseInt(s2.toString());
			break;
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력하세요!");
			continue;
		}
		
		}
		return num;
	}
}
