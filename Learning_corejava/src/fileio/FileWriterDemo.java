package fileio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) {
		
		
		try {
			FileWriter f = new FileWriter("D:\\files\\abc.txt");
			f.write("hello python");
			f.flush();
			System.out.println("created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
