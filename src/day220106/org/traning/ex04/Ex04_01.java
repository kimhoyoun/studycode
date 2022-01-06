package day220106.org.traning.ex04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04_01 {
	static Scanner sc = new Scanner(System.in);
	static File file = new File("C:\\Temp\\green\\phone.txt");
	static FileWriter writer = null;
	static FileReader reader = null;
	static BufferedReader br = null;
	static StringBuffer lines = null;

	public static String readFile(String src) {
		try {
			// 파일의 내용을 읽어서 출력하기 - FileReader 사용.
			if (src != null)
				file = new File(src);
			reader = new FileReader(file);
			br = new BufferedReader(reader);
			String data = null;
			lines = new StringBuffer();
			while ((data = br.readLine()) != null) {
				lines.append(data);
				lines.append('\n');
			}
		} catch (FileNotFoundException e) {
			System.out.println("지정한 파일이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return lines.toString();
	}

	// ex01
	public static void writeFile(String src) {
		try {
			writer = new FileWriter(file);
			StringBuffer sb = new StringBuffer();
			System.out.println("전화 번호 입력 프로그램입니다.(그만 입력은 종료)");
			while (true) {
				System.out.print("이름 전화번호 >> ");
				String line = sc.nextLine();
				if ("그만".equals(line)) {
					break;
				}
				sb.append(line);
				sb.append('\n');
			}
			writer.write(sb.toString());
			System.out.println(file.getPath() + "에 저장하였습니다.");

		} catch (FileNotFoundException e) {
			System.out.println("지정한 파일이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public static void main01(String[] args) {
		writeFile(null);
		readFile(null);
	}
	public static void main(String[] args) {
		String data = readFile("C:\\windows\\system.ini");
		StringTokenizer stk = new StringTokenizer(data, "\n");
		int cnt =1;
		System.out.println(file.getPath()+"를 출력합니다.");
		while(stk.hasMoreTokens()) {
			System.out.print(cnt++ +": ");
			System.out.println(stk.nextElement().toString().toUpperCase());
		}
	}
}
