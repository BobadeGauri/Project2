package com.entity;

public class Bank {
	private int account_no;
	private String account_holder_name;
	private double balance;
	private String city;
	private String state;
	
	public Bank()
	{
		
	}

	public Bank(int account_no, String account_holder_name, double balance, String city, String state) {
		super();
		this.account_no = account_no;
		this.account_holder_name = account_holder_name;
		this.balance = balance;
		this.city = city;
		this.state = state;
	}

	public int getAccount_no() {
		return account_no;
	}

	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}

	public String getAccount_holder_name() {
		return account_holder_name;
	}

	public void setAccount_holder_name(String account_holder_name) {
		this.account_holder_name = account_holder_name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Bank [account_no=" + account_no + ", account_holder_name=" + account_holder_name + ", balance="
				+ balance + ", city=" + city + ", state=" + state + "]";
	}
	
	

}
