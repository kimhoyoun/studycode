package day1222.homework;

import java.util.Scanner;

public class Dictionary {
	private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public static String kor2Eng(String word) {
		int index = -1;
		for (int i = 0; i < kor.length; i++) {
			if (word.equals(kor[i])) {
				index = i;
			}
		}
		if (index == -1) {
			return null;
		} else {
			return eng[index];
		}
	}

	static void run() {
		String word = "";
		System.out.println("한영 단어 검색 프로그램입니다.");
		while (true) {

			System.out.print("한글 단어? ");
			word = sc.next();
			if (word.equals("그만")) {
				System.exit(0);
			}

			String eng = kor2Eng(word);

			if (eng == null) {
				System.out.printf("%s는(은) 저의 사전에 없습니다. \n", word);
			} else {
				System.out.printf("%s는(은) %s \n", word, eng);
			}

		}
	}

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		run();
	}

}
