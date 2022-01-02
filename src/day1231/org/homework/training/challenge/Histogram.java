package day1231.org.homework.training.challenge;

import java.io.IOException;

public class Histogram {
	public static void main(String[] args) {
		Alpha[] al = new Alpha[26];

		for (int i = 0; i < al.length; i++) {
			al[i] = new Alpha((char) ('A' + i));
		}
		System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
		int ch;
		try {
			while ((ch = System.in.read()) != ';') {
				if (ch >= 'A' && ch <= 'z') {
					for (int i = 0; i < al.length; i++) {
						if ((ch == al[i].getAl()) || (ch == al[i].getAl() + 32)) {
							al[i].plus();
						}
					}
				}

			}
		} catch (IOException e) {}
		
		for(int i=0; i<al.length; i++) {
			System.out.println(al[i]);
		}
	}
}

// A : 65 a : 97    32차이