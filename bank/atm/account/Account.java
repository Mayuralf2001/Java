package com.vodafone.bank.atm.account;

import com.vodafone.bank.atm.transactions.Transactions;

public abstract class Account implements Transactions {
	private static long lastId;
	private long id;
	private String name;
	private double balance;
	private int pin;
	
	
	public Account(String name, double openingBalance) {
		super();
		id = ++lastId;
		this.name = name;
		this.balance = openingBalance;
		pin = generatePin();
	}
	
	private int generatePin() {
		return 
				(int) (1000 + Math.random() * 8999);
	}
	
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPin() {
		return pin;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public double deposit(double amount) {
		// TODO Auto-generated method stub
		balance += amount;
		return amount;
	}

	@Override
	public double withdraw(double amount) {
		// TODO Auto-generated method stub
		balance -= amount;
		return balance;
	}

	@Override
	public boolean changePIN(int oldPin, int newPin) {
		// TODO Auto-generated method stub
		boolean isPinChanged = false;
		if(new StringBuffer(newPin).reverse().equals(new StringBuffer(newPin))) {
			System.out.println("Given PIN is a Palindrome, cannot change PIN.");
		}else if (oldPin != newPin) {
			newPin = oldPin;
			isPinChanged = true;
		}
		return isPinChanged;
		
		
	}
	
}
