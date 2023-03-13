package com.dao.implement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.BankDao;
import com.entity.Bank;

public class BankDaoImplement implements BankDao{

	@Override
	public List<Bank> showAll() throws ClassNotFoundException, SQLException {
		ArrayList<Bank>list=new ArrayList<Bank>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/8657capgemini","root","Gauri@123");
		
		PreparedStatement statement=con.prepareStatement("select * from Bank");
		ResultSet rs=statement.executeQuery();
		while(rs.next())
		{
			Bank b=new Bank();
			b.setAccount_no(rs.getInt(1));
			b.setAccount_holder_name(rs.getString(2));
			b.setBalance(rs.getDouble(3));
			b.setCity(rs.getString(4));
			b.setState(rs.getString(5));
			list.add(b);
		}
		con.close();
		System.out.println("Bank details successfully added");
		return list;
	}

	@Override
	public void insertBankDetails(Bank b) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/8657capgemini","root","Gauri@123");
		PreparedStatement statement=con.prepareStatement("insert into Bank values(?,?,?,?,?)");
		statement.setInt(1, b.getAccount_no());
		statement.setString(2, b.getAccount_holder_name());
		statement.setDouble(3, b.getBalance());
		statement.setString(4, b.getCity());
		statement.setString(5, b.getState());
		statement.executeUpdate();
		con.close();
		System.out.println("Bank details successfully inserted");
		
	}

	@Override
	public void deleteBankDetails(Bank b) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/8657capgemini","root","Gauri@123");
		PreparedStatement statement=con.prepareStatement("delete from Bank where Account_no=?");
		statement.setInt(1, b.getAccount_no());
		statement.executeUpdate();
		con.close();
		System.out.println("Bank details are deleted successfully");
		
	}

}
