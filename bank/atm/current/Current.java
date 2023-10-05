package com.vodafone.bank.atm.current;

import com.vodafone.bank.atm.account.Account;

public class Current extends Account {

	public Current(String name, double openingBalance) {
		super(name, openingBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Current [ID: " + getId() + ", Name: " + getName() + ", Balance: " + getBalance() + "]";
	}

}
