package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.entity.Bank;

public interface BankDao {
	public List<Bank>showAll() throws ClassNotFoundException, SQLException;
	public void insertBankDetails(Bank b) throws ClassNotFoundException, SQLException;
	public void deleteBankDetails(Bank b) throws ClassNotFoundException, SQLException;

}
