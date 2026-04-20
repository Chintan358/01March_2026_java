package fileio;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
		
		
		File f = new File("D:\\files\\test.txt");
		
		f.setWritable(false);
//		f.mkdir();
		
//		System.out.println(f.isFile());
//		System.out.println(f.isDirectory());
		
//		if(f.exists())
//		{
//			System.out.println("availble");
//			f.delete();
//		}
//		else
//		{
//			System.out.println("Not available");
//			try {
//				f.createNewFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
	}
}
