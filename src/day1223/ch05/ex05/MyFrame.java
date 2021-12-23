package day1223.ch05.ex05;

import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame{
	// Frame을 상속받은 MyFrame은 Frame이다. (IS-A관계)
	public MyFrame(String title, int width, int height) {
		// 인스턴스 내부
		setTitle(title);
		this.setVisible(true);
		this.setSize(width,height);
		
		Toolkit tk = getToolkit().getDefaultToolkit();
		int sw = (int)tk.getScreenSize().getWidth();
		int sh = (int)tk.getScreenSize().getHeight();
		setLocation(sw/2 - this.getWidth()/2,sh/2-this.getHeight()/2);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				// 윈도우의 닫기 버튼을 클릭하면 발생되는 이벤트 핸들러
				MyFrame.this.dispose(); // 리소스 수거하기
				System.exit(0); // 프로그램 강제 종료
			}
		});
	}
	public static void main(String[] args) {
		Frame frame = new MyFrame("윈도우 생성 실습",600,400);
		// 여기는 인스턴스 외부
	}

}
