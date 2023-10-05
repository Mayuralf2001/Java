package com.vodafone.bank.atm;

import com.vodafone.bank.atm.account.Account;
import com.vodafone.bank.atm.current.Current;
import com.vodafone.bank.atm.savings.Savings;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Savings acc1 = new Savings("Dilip", 5000);
//		System.out.println("Account opened with ID: " + acc1.getId() + ", PIN: " + acc1.getPin());
//		System.out.println(acc1);
//		System.out.println();
		
		Account [] accounts = {
				new Savings("Dilip", 50000),
				new Current("Mahek", 45000),
				new Savings("Arya", 40000),
				new Current("Ritesh", 450000),
				new Savings("Sakshi", 30000),
		};
		
		for (Account account : accounts) {
			System.out.println("Account opened with ID: " + account.getId() + ", PIN: " + account.getPin());
			System.out.println(account);
			System.out.println();
		}
		
		System.out.println(accounts[2].deposit(500));
	}

}
