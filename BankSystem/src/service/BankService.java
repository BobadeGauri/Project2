package service;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dao.implement.BankDaoImplement;
import com.entity.Bank;
public class BankService {
	Scanner sc=new Scanner(System.in);
	public void showAll() throws ClassNotFoundException, SQLException
	{
		List<Bank>list=new BankDaoImplement().showAll();
		for(Bank b:list)
		{
			System.out.println(b);
		}
	}

	public void insertBankDetails() throws ClassNotFoundException, SQLException {
		Bank b=new Bank();
		System.out.println("Enter the Account_no");
		int account_no=sc.nextInt();
		System.out.println("Enter the Account_holder_name");
		String account_holder_name=sc.next();
		System.out.println("Enter the Amount");
		Double balance=sc.nextDouble();
		System.out.println("Enter the City");
		String city=sc.next();
		System.out.println("Enter the State");
		String state=sc.next();
		b.setAccount_no(account_no);
		b.setAccount_holder_name(account_holder_name);
		b.setBalance(balance);
		b.setCity(city);
		b.setState(state);
		new BankDaoImplement().insertBankDetails(b);
		
	}

	public void deleteBankDetails() throws ClassNotFoundException, SQLException {
		Bank b=new Bank();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Account_no");
		int Account_no=sc.nextInt();
		b.setAccount_no(Account_no);
		
		new BankDaoImplement().deleteBankDetails(b);
		
	}

}
