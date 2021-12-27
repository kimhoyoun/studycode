package day1224.ex05;
// 강사님 코드

import java.util.Scanner;
//------ Model ------
class Music {
	// 가수, 노래
	private String type;
	private String song;
	public Music(String song, String type) {
		this.type = type;
		this.song = song;
	}
	
	public String getSong() {
		return song;
	}

	public void play() {
		System.out.printf("%s type의 %s가 실행됩니다. ", type, song);
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
		System.out.printf("가수는 %s입니다.\n", name);
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

class DataAccessModel{
	public static final int MAX = 12;
	private Music[] musicList = new Music[MAX];
	private int top = 0;
	
	// 음악 추가
	public void appendMusic(Music music) {
		// top이 MAX이상이면 추가 불가능
		if(music != null) {
			musicList[top++] = music;
			System.out.println(">>> 음악 추가 성공 : "+ music.getSong());
		}
	}
	
	// 음악 제거
	public Music removeMusic(int idx) {
		// top이 0이하이면 제거가 불가능.
		Music music = musicList[idx];
		for(int i = idx; i<top-1; i++) {
			musicList[i] = musicList[i+1];
		}
		top--;
		musicList[top] = null;
		return music;
	}
	
	// 음악 검색
	public Music findMusic(Music music) {
		Music findmusic = null;
		for(int i =0; i<top; i++) {
			if(music.getSong().equals(musicList[i].getSong())) {
				findmusic = musicList[i];
			}
		}
		return findmusic;
	}
	
	// 모든 음악 실행
	public Music[] getAllMusic() {
		return musicList;
	}
}
//----------------- end of Model(데이터 저장 구조) -----------------

// 객체간의 데이터를 바인딩 해주는 클래스 R
class R{
	public static int no;
	public static Music music;
	public static Music[] musicList;
	
	public static ViewPage menu = new Menu();
	public static ViewPage input = new Input();
	public static ViewPage listPage = new MusicList();
	public static ViewPage delete = new DeleteMusic();
	
	public static DataAccessModel dam = new DataAccessModel();
	
}

//----------------- View(화면에 보여지는 내용) -----------------

class ViewPage{
	// 뷰페이지 구현하는 부분 - 모든 뷰들의 부모
	
	protected final Scanner sc = new Scanner(System.in);
	public void display() {
		System.out.println("------- 실행 화면 -------");
	}
}

class Menu extends ViewPage{
	@Override
	public void display() {
		System.out.println("--------------- MENU ---------------");
		System.out.println("1.음악삽임 2.모든음악실행 3.음악제거 4.음악찾기 5.종료");
		int no =sc.nextInt();
		R.no = no;
	}
}

// 지문을 보여주는 부분
// 입력 부분
class Input extends ViewPage{
	@Override
	public void display() {
		System.out.println("--------------- 노래 추가 ---------------");
		System.out.print("노래제목 : ");
		String title = sc.next();
		System.out.print("노래제목 : ");
		String name = sc.next();
		R.music = new NCSMusic(title,name);
	}
}

// 목록을 보여주는 부분
class MusicList extends ViewPage{
	@Override
	public void display() {
		System.out.println("--------------- 노래 목록 ---------------");
		for(Music music : R.musicList) {
			if(music == null) break;
			music.play();
		}
	}
}

// 삭제하시겠습니까? 부분
class DeleteMusic extends ViewPage{
	@Override
	public void display() {
		System.out.println("--------------- 노래 삭제 ---------------");
	}
}

// JSP, HTML page를 실행시키는 브라우저 역할
class ViewContainer{
	// 뷰를 실행 하는 부분
	// 제어하는 곳
		public void run(ViewPage view) {
//			System.out.println("--- 화면 실행 ---");
			view.display();
		}
	
}
//----------------- end of View -----------------

//----------------- Controller(제어문) -----------------
class MusicPlayer {
	ViewContainer vc = new ViewContainer();
	
	public void action() {
		if(R.no == 0) {
			vc.run(R.menu);
		}
		
		switch(R.no) {
		case 1: 
			vc.run(R.input);
			if(R.music != null) {
				R.dam.appendMusic(R.music);
			}
			break;
		case 2: 
			R.musicList = R.dam.getAllMusic();
			vc.run(R.listPage); break;
		case 3: vc.run(R.delete); break;
		case 4: System.out.println("준비중...");
		case 5: System.out.println("끝!"); System.exit(0); break;
		}
		
		R.no = 0;
		action(); // 재귀호출을 이용 반복문 대신 사용 가능
	}

}


//----------------- end of Controller -----------------
public class MainCls {
	public static void main(String[] args) {
		// View를 만들고 view 테스트
		MusicPlayer player = new MusicPlayer();
		player.action();
	}
	
	public static void model_test(String[] args) {
		DataAccessModel dam = new DataAccessModel(); // DAO 패턴
		dam.appendMusic(new DanceMusic("엄정화","페스티발","디스코")); // VO 또는 DTO 패턴
		dam.appendMusic(new DanceMusic("조용필","바람의노래","트로트"));
		dam.appendMusic(new NCSMusic("아무튼 노래","팝"));
		dam.appendMusic(new NCSMusic("좋은 배경음악","재즈"));
		
		dam.removeMusic(2);
		
		Music[] musicList = dam.getAllMusic();
		for(int i = 0; i<musicList.length; i++) {
			if(musicList[i]==null)break;
			System.out.print(i+ "> ");
			musicList[i].play();
		}
		// 검색된 노래 플레이
		Music m1 = dam.findMusic(new Music("바람의노래",null));
		m1.play();
	}
}