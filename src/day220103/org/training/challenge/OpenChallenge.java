package day220103.org.training.challenge;

import java.util.Vector;

import day220103.org.training.Ex;

class Word{
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

class ExOpen extends Ex{
	public ExOpen() {
		start();
	}
	Vector<Word> v = new Vector<>();
	
	{
		v.add(new Word("love","사랑"));
		v.add(new Word("animal","동물"));
		v.add(new Word("line","선"));
		v.add(new Word("people","사람"));
		v.add(new Word("eye","눈"));
		v.add(new Word("picture","그림"));
		v.add(new Word("bear","곰"));
		v.add(new Word("tiger","호랑이"));
		v.add(new Word("rabbit","토끼"));
		v.add(new Word("sing","노래"));
		v.add(new Word("coffee","커피"));
		v.add(new Word("phone","전화기"));
		v.add(new Word("computer","컴퓨터"));
		v.add(new Word("word","단어"));
		v.add(new Word("mouse","쥐"));
		v.add(new Word("house","집"));
	}
	
	@Override
	public void run() {
		System.out.println("\"명품영어\"의 단어 테스트를 시작합니다.");
		System.out.println("현재 "+v.size()+"개의 단어가 들어 있습니다. -1을 입력하면 종료합니다");
			
		while(true) {
			// 중복없는 난수 4개 발생
			int[] n = rand();
			
			// 정답위치 0~3
			int ans = (int)(Math.random()*4);
			
			// 정답
			System.out.println(v.get(n[ans]).getEng()+"?");
			for(int i=0; i<4; i++) {
				System.out.printf("(%d)%s ",i+1,v.get(n[i]).getKor());
			}
			System.out.print(" >>");
			int a = sc.nextInt();
			if(a == -1) {
				System.out.println("\"명품영어\"를 종료합니다...");
				break;
			}
			// 정답 인덱스와 선택 인덱스 일치시 정답
			if((a-1) == ans) {
				System.out.println("Exellent !!");
				// 맞춘 정답 삭제
				v.remove(n[ans]);
			}else {
				System.out.println("No !!");
			}
		}
	}
	
	// 난수 발생
	public int[] rand() {
		int[] n = new int[4];
		for(int i =0; i<4; i++) {
			n[i] = (int)(Math.random()*v.size());
			for(int j =0; j<i; j++) {
				if(n[i] == n[j]) {
					i--;
				}
			}
		}
		return n;
	}
}

public class OpenChallenge {

	public static void main(String[] args) {
		new ExOpen();
//		Vector<Word> v = new Vector<>();
//		
//		
//			v.add(new Word("love","사랑"));
//			v.add(new Word("animal","동물"));
//			v.add(new Word("line","선"));
//			v.add(new Word("people","사람"));
//			v.add(new Word("eye","눈"));
//			v.add(new Word("picture","그림"));
//			v.add(new Word("bear","곰"));
//			v.add(new Word("tiger","호랑이"));
//			v.add(new Word("rabbit","토끼"));
//			v.add(new Word("sing","노래"));
//			v.add(new Word("coffee","커피"));
//			v.add(new Word("phone","전화기"));
//			v.add(new Word("computer","컴퓨터"));
//			v.add(new Word("word","단어"));
//			v.add(new Word("mouse","쥐"));
//			v.add(new Word("house","집"));
//		
//			int[] n = new int[4];
//			
//			for(int i =0; i<4; i++) {
//				n[i] = (int)(Math.random()*v.size());
//				for(int j =0; j<i; j++) {
//					if(n[i] == n[j]) {
//						i--;
//					}
//				}
//			}
//			
//			for(int i =0; i<4; i++) {
//				System.out.println(n[i]);
//			}
//			
		
		
	}

}
