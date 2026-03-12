package statements;

import java.util.Scanner;

public class S002_SwitchCase {
	public static void main(String[] args) {
		
		int c = 1;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter choice : ");
		int choice = sc.nextInt();	
		switch(choice)
		{
		case 1 : 
			System.out.println("Gujarati");
			break;
		case 2 :
			System.out.println("Hindi");
			break;
		case 3 :
			System.out.println("English");
			break;
		default:
			System.out.println("Invalid choice");
		}
		
		System.out.println("Do you want to continue? press 1 for continuer and 0 for exit");
		c = sc.nextInt();
		}while(c!=0);
		
		
	}
}
