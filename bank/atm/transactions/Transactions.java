package com.vodafone.bank.atm.transactions;

public interface Transactions {
	public double deposit(double amount);
	public double withdraw(double amount);
	public boolean changePIN(int oldPin, int newPin);
}
