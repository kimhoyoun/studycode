package day220105.org.ex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Scanner;

public class Ch08Ex02 {
	// 객체를 파일에 저장하고 객체로 읽어온다.
	// 자바는 객체지향 언어이므로 객체 저장이 더 효과적이다.
	// 객체 직렬화 - 객체를 저장하고 읽을때 필요한 개념.
	// 만약 객체를 집에 비유한다면 ... 
	// 집을 분해해서 이동하고 다시 조립해서 집으로 만드는 것.
	// 저장할땐 문자나 바이트로 분해해서 저장 후
	// 사용할 땐 뜯어진 것의 역순으로 조립해서 객체로 만든다.
	// 자바는 자동으로 해줌 (오브젝트)
	// 직렬화 하는 인터페이스를 상속을 받아야 쓸 수 있다.
	
	public static void main(String[] args) throws IOException {
		// UTF로 기록하고
		File file = new File("C:\\temp\\green\\data2.txt");
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("저장할 문장을 입력하세요!");
		String ins = null;
		StringBuffer stringData = new StringBuffer();
		while((ins = br.readLine()) != null) {
			if(ins.equals("그만")) break;
			stringData.append(ins);
			stringData.append("\n");
			
		}
		
		dos.writeUTF(stringData.toString());
		
		dos.close();
		
		// UTF읽기 호출
		System.out.println("저장된 문자입니다.");
		test_dis(null);
	}	
	
	public static void test_dis(String[] args) throws IOException {
		// DataInputStream
		File file = new File("C:\\temp\\green\\data2.txt");
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(fis);
		
		String s = null;
		try {
			s = dis.readUTF(); // UTF로 기록된 데이터를 읽어온다.
			System.out.println(s);
		}catch(IOException e) {
			System.out.println("UTF 읽기 오류 발생");
		}finally {
			dis.close();
		}
		

	}
	
	
	public static void test09(String[] args) throws IOException {
		File file = new File("C:\\temp\\green\\data2.txt");
		FileReader fr = new FileReader(file);
		
		char[] cbuf = new char[255];
		fr.read(cbuf);
		System.out.println(new String(cbuf).trim());
		
		fr.close();
	}
	
	public static void test08(String[] args) throws IOException {
		File file = new File("C:\\temp\\green\\data2.txt");
		FileWriter fw = new FileWriter(file);
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		fw.write(s);
		
		fw.close();
	}
	
	public static void test07(String[] args) throws IOException {
		File file = new File("C:\\temp\\green\\data2.txt");
		FileWriter fw = new FileWriter(file);
		
		// 키보드로 데이터를 입력 받아서 fw를 이용해서 data2.txt파일에 기록하기
		String s = "hello world! 안녕하세요.";
		fw.write(s);

		fw.close();
	}
	
	public static void tset06(String[] args) throws IOException {
		File file = new File("C:\\temp\\green\\hangul.txt");
		FileReader fr = new FileReader(file);
		
		// fr.read()가 InputStreamReader에 있기때문에 
		// BufferedReader로 감싸서 쓸 수 있다.
		BufferedReader br = new BufferedReader(fr);
		
		String s = null;
		while((s = br.readLine())!=null) {
			System.out.println(s);
		}
	}
	
	public static void test05(String[] args) throws FileNotFoundException {
		// Scanner로도 읽어올 수 있다.
		File file = new File("C:\\temp\\green\\hangul.txt");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}
	
	public static void test04(String[] args) throws IOException {
		// File
		File file = new File("C:\\temp\\green\\test_myfile.txt");
		if (file.exists()) {
			System.out.println(">>>> 있다.");
			if (file.isDirectory()) {

				String[] fileList = file.list();
				for (String fileName : fileList) {
					System.out.println(fileName);
				}
			} else {
				if (file.delete()) {
					System.out.println(">>>> 파일이 삭제됨!");
				}
			}
		} else {
			System.out.println(">>>> 없다.");
			if (file.createNewFile()) {
				System.out.println("파일이 생성 되었습니다.");
			}
		}
	}

	public static void test03(String[] args) throws IOException {
		// 파일에서 데이터 읽어오기
//		InputStream is = System.in;
		File file = new File("C:\\temp\\green\\hangul.txt");
		FileInputStream is = new FileInputStream(file);
		int data = 0;

		while ((data = is.read()) != -1) {
			System.out.write(data);
		}

		is.close();
		System.out.println("파일읽기 완료");
	}

	public static void test02(String[] args) throws IOException {
//		OutputStream os = System.out;
		FileOutputStream os = new FileOutputStream("C:\\temp\\green\\hangul.txt");
		InputStream is = System.in;

//		int data = is.read();  // 바이트 코드(ASCII Code)를 받음
//		System.out.println(data);

		System.out.println("데이터를 입력 해 보세요. (끝내려면 Ctrl + z) : ");
		int data = 0;

		// EOF(End Of File)일때 까지 (Ctrl + z)
		while ((data = is.read()) != -1) {
			os.write(data);
		}

		os.close();
	}

	public static void test01(String[] args) throws IOException {
		OutputStream os = System.out;
		byte[] by = new byte[255];
		int b = 0;
		System.out.print("문자 입력 >> ");
		System.in.read(by);

		String s = new String(by).trim();
		os.write(by);
	}

}
