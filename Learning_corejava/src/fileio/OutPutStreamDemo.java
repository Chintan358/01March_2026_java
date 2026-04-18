package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutPutStreamDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name : ");
		String name = sc.next();
		System.out.println("Enter email : ");
		String email = sc.next();
				
		FileOutputStream fos=null;
		try 
		{
			
			fos = new FileOutputStream("D:\\files\\"+name+".txt");
			
			byte b[] = email.getBytes();
			fos.write(b);
			System.out.println("created");
			
//			fos = new FileOutputStream("D:\\files\\test.txt");
//			String st = "Hello, this is my first io program !!!";
//			byte b[] = st.getBytes();
//			fos.write(b);
//			System.out.println("created");
			
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
