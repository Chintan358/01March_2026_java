package library;

import java.util.Scanner;

public class Admin {
	public static void main(String[] args) {
		
		
		String c = "y";
		
		
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice : ");
		System.out.println("1 : Add Book");
		System.out.println("2 : View Book");
		System.out.println("3 : Delete Book");
		System.out.println("4 : Issue Book");
		
		
		int choice = sc.nextInt();
		Oprations op = new Oprations();
		if(choice==1)
		{
			System.out.println("*****ADD BOOK*****");
			op.addBook();
		}
		else if(choice==2)
		{
			System.out.println("*****VIEW BOOK*****");
			op.viewBook();
		}
		else if(choice==3)
		{
			System.out.println("*****DELETE BOOK*****");
			op.deleteBook();
		}
		else if(choice==4)
		{
			System.out.println("*****ISSUE BOOK*****");
			op.issueBook();
		}
		else {
			System.out.println("Invalid Choice");
		}
		
		System.out.println("Do you want to continue ? press y or n");
		c = sc.next();
		}while(c.equalsIgnoreCase("y"));
		
	}
}
