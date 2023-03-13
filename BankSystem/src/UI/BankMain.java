package UI;

import java.sql.SQLException;
import java.util.Scanner;

import service.BankService;

public class BankMain {

	public static void main(String[] args) throws  SQLException, ClassNotFoundException {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Bank System");
		System.out.println("1.Show details of bank holders");
		System.out.println("2.Insert records in bank");
		System.out.println("4.Delete records in bank");
		
		BankService b=new BankService();
		do
		{
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				b.showAll();
				break;
				
			case 2:
				b.insertBankDetails();
				break;
				
			case 3:
				b.deleteBankDetails();
				break;
			}
			System.out.println("do you want to continue");
			s=sc.next();
			}
		while(s.equals("yes"));

	}

}
