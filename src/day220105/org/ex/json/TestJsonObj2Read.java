package day220105.org.ex.json;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.json.JSONObject;
import org.json.JSONTokener;

public class TestJsonObj2Read {
	public TestJsonObj2Read() throws FileNotFoundException {
		// JSON의 저장이 프로젝트에 됐으니
		// 특별히 지정을 안해주면 저장된곳이 class path이다.
		// 저 클래스가 있는위치에서 불러오기위해
		// this.getClass()사용
		
		// InputStream 반환
		InputStream is = this.getClass().getResourceAsStream("members.json");
//		InputStream is = new FileInputStream("C:\\temp\\green\\members.json");
		// 저장되어있는것을 다시 객체로 만들기위해 JSONTokener를 사용함
		// 생성자에 Tokener를 넣어줘야함.
		JSONTokener tk = new JSONTokener(is);
		JSONObject jObj = new JSONObject(tk);
		
		System.out.println(jObj.toString(2));
	}
	public static void main(String[] args) throws FileNotFoundException {
		new TestJsonObj2Read();
	}

}
