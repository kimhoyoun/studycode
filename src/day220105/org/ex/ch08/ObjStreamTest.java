package day220105.org.ex.ch08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class ObjStreamTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// ArrayList에 객체 5개 넣고 다시 가져와보기
		File file = new File("C:\\temp\\green\\arraylist.dat");
		FileOutputStream fos = new FileOutputStream(file);
		FileInputStream fis = new FileInputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ArrayList<Saram> sal = new ArrayList<>();
		
		sal.add(new Saram(1,"홍길동","hong@h.com"));
		sal.add(new Saram(2,"김길동","kim@h.com"));
		sal.add(new Saram(3,"박길동","park@h.com"));
		sal.add(new Saram(4,"이길동","lee@h.com"));
		sal.add(new Saram(5,"고길동","ko@h.com"));
		
		oos.writeObject(sal);
		System.out.println("저장 완료");
		
		ArrayList<Saram> list = (ArrayList<Saram>) ois.readObject();
		
		Iterator<Saram> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		oos.close();
		ois.close();
	}
	
	public static void test01(String[] args) throws IOException, ClassNotFoundException {
		// ObjectInputStraem 불러오기
		// ObjectOutputStream 저장
		File file = new File("C:\\temp\\green\\saram.dat");
		FileOutputStream fos = new FileOutputStream(file);
		FileInputStream fis = new FileInputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Saram data = new Saram(1,"홍길동","hong@h.com");
		
		// 저장
		oos.writeObject(data);
		System.out.println("객체 저장 완료");
		
		// 불러오기 (형변환해줘야함)
		Saram saram = (Saram)ois.readObject();
		System.out.println(saram);
		
		
		oos.close();
		ois.close();	
	}

}
