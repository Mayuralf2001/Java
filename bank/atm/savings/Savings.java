package com.vodafone.bank.atm.savings;

import com.vodafone.bank.atm.account.Account;

public class Savings extends Account {

	public Savings(String name, double openingBalance) {
		super(name, openingBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Savings [ID: " + getId() + ", Name: " + getName() + ", Balance: " + getBalance() + "]";
	}
	
}
