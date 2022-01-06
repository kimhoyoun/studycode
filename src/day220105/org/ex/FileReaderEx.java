package day220105.org.ex;

import java.io.*;

public class FileReaderEx {
	public static void main(String[] args) {
		FileReader fin = null;
		try {
			fin = new FileReader("C:\\Windows\\system.ini"); 
			int c;
			// read()는 정수를 읽는다.
			while ((c = fin.read()) != -1) { // 한 문자씩 파일 끝까지 읽기					
				// 형변환을 해야 글자로 출력
				System.out.print((char)c);
			}
			fin.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}

