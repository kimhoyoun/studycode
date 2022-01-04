package day220103.org.training.ex12;

import java.util.Vector;

import day220103.org.training.Ex;

class Word {
	private String eng;
	private String kor;

	public Word(String eng, String kor) {
		this.eng = eng;
		this.kor = kor;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}

}

class Ex12 extends Ex {
	public Ex12() {
		System.out.println("\"명품영어\"의 단어 테스트를 시작합니다.");
		start();
	}

	Vector<Word> v = new Vector<>();

	{
		v.add(new Word("love", "사랑"));
		v.add(new Word("animal", "동물"));
		v.add(new Word("line", "선"));
		v.add(new Word("people", "사람"));
		v.add(new Word("eye", "눈"));
		v.add(new Word("picture", "그림"));
		v.add(new Word("bear", "곰"));
		v.add(new Word("tiger", "호랑이"));
		v.add(new Word("rabbit", "토끼"));
		v.add(new Word("sing", "노래"));
		v.add(new Word("coffee", "커피"));
		v.add(new Word("phone", "전화기"));
		v.add(new Word("computer", "컴퓨터"));
		v.add(new Word("word", "단어"));
		v.add(new Word("mouse", "쥐"));
		v.add(new Word("house", "집"));
	}

	public int getNum(int num) {
		int no;
		while (true) {
			try {
				no = sc.nextInt();
				if (no == -1) {
					break;
				}
				while ((no < 1 || no > num)) {
					System.out.println("범위를 벗어났습니다!");
					System.out.print("다시입력 >> ");
					no = sc.nextInt();
				}
				break;
			} catch (Exception e) {
				System.out.println("숫자만 입력하세요!");
				System.out.print("다시입력 >> ");
				sc.next();
				continue;
			}
		}
		return no;
	}

	@Override
	public void run() {
		System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3 >> ");
		int no = getNum(3);

		switch (no) {
		case 1:
			quiz();
			break;
		case 2:
			insert();
			break;
		case 3:
			System.out.println("\"명품영어\"를 종료합니다...");
			System.exit(0);
		default:
			System.out.println("해당사항 없습니다!");
			run();
		}
		run();
	}

	public void quiz() {
		System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다. -1을 입력하면 종료합니다");
		// 모든 문제를 무작위로 뽑아서 정렬
		int[] arr = rand(v.size());

		for (int x = 0; x < v.size(); x++) {

			// 중복없는 난수 4개 발생
			int[] n = rand(4);

			// 정답위치 0~3
			int ans = (int) (Math.random() * 4);

			// 정답
			System.out.println(v.get(arr[x]).getEng() + "?");
			for (int i = 0; i < 4; i++) {
				int el = (int) (Math.random() * v.size());
				if (i == ans) {
					System.out.printf("(%d)%s ", i + 1, v.get(arr[x]).getKor());
				} else {
					if (arr[x] != el) {
						System.out.printf("(%d)%s ", i + 1, v.get(el).getKor());
					} else {
						i--;
					}
				}
			}
			System.out.print(" >>");
			int a = getNum(4);
			if (a == -1) {
				System.out.println("\"퀴즈\"를 종료합니다...");
				break;
			}
			// 정답 인덱스와 선택 인덱스 일치시 정답
			if ((a - 1) == ans) {
				System.out.println("Exellent !!");
			} else {
				System.out.println("No !!");
			}
		}
	}

	public void insert() {
		System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다");
		while (true) {
			System.out.print("영어 한글 입력 >> ");
			String eng = sc.next();
			if (eng.equals("그만")) {
				System.out.println("입력 종료");
				break;
			}
			String kor = sc.next();
			v.add(new Word(eng, kor));
		}
	}

	// 난수 발생
	public int[] rand(int num) {
		int[] n = new int[num];
		for (int i = 0; i < num; i++) {
			n[i] = (int) (Math.random() * v.size());
			for (int j = 0; j < i; j++) {
				if (n[i] == n[j]) {
					i--;
				}
			}
		}
		return n;
	}
}

public class Ex12Main {

	public static void main(String[] args) {
		new Ex12();
	}

}
