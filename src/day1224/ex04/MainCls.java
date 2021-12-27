package day1224.ex04;
import java.util.Scanner;

class Music {
	// 가수, 노래
	private String type;
	private String song;
	public Music(String song, String type) {
		this.type = type;
		this.song = song;
	}
	public void play() {
		System.out.printf("%s type의 %s가 실행됩니다.", type, song);
	}
	
	public String getSong() {
		return song;
	}
}

class DanceMusic extends Music {
	private String name;
	public DanceMusic(String name, String song, String type) {
		super(song, type);
		this.name = name;
	}
	@Override
	public void play() {
		super.play();
		System.out.printf("가수는 %s입니다.", name);
	}
	
	
}

class NCSMusic extends Music {
	public NCSMusic(String song, String type) {
		super(song, type);
	}
	
	@Override
	public void play() {
		super.play();
		System.out.println("No Copyrignt Sound!");
	}
}

class MusicPlayer {
	private Music[] musicList = new Music[12];
	private int top = 0;
	
	public void appendMusic(Music music) {
		System.out.print("1.Dance 2.NCS 중 선택해주세요");
		int num = sc.nextInt();
		switch(num) {
		case 1: 
			System.out.println("DanceMusic을 선택했습니다!");
			System.out.print("song, type을 입력하세요 >> ");
			String mName = sc.next();
			String mSong = sc.next();
			String mType = sc.next();
			
			music = new DanceMusic(mName, mSong, mType);
			top++;
			System.out.println("음악이 추가 되었습니다!");
			break;
		case 2:
			System.out.println("NCSMusic을 선택했습니다!");
			System.out.print("name, song, type을 입력하세요 >> ");
			mSong = sc.next();
			mType = sc.next();
			
			music = new NCSMusic(mSong, mType);
			top++;
			System.out.println("음악이 추가 되었습니다!");
			break;
		}
		menu();
	}
	public Music removeMusic(int i) {
		// 음악 제거
		return null;
	}
	public Music findMusic(Music music) {
		// 음악 검색
		return null;
	}
	public void playAllMusic() {
		for(Music m : musicList) {
			m.play();
		}
		// 모든 음악 실행
	}
	Scanner sc = new Scanner(System.in);
	public void menu() {
		int index = -1;
		System.out.println("1.추가 2.전체곡실행 3.선택곡실행 4.제거 5.종료");
		System.out.print("선택>>> ");
		int num = sc.nextInt();
		switch(num) {
		case 1: 
			appendMusic(musicList[top]); 
			break;
		case 2: playAllMusic(); 
			break;
		case 3: 
			index = search();
			findMusic(musicList[index]); 
			break;
		case 4: 
			removeMusic(2);
			break;
		case 5:	System.exit(0);
		
		}
	}
	
	public int search() {
		System.out.print("song을 입력해 주세요 : ");
		String fsong = sc.next();
		int index = -1;
		for(int i = 0; i<top; i++) {
			if(fsong.equals(musicList[i].getSong())) {
				index = i;
			}
		}
		return index;
	}
}

public class MainCls {
	public static void main(String[] args) {
		
	}
}