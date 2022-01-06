package day220106.org.traning.ex04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\windows\\system.ini");
		Scanner sc = new Scanner(new FileReader(file));
		
		int lineNumber = 1;
		while(sc.hasNext()) {
			String line = sc.nextLine();
			System.out.println(lineNumber++ +": "+line);
		}
		sc.close();
	}

}
