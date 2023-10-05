package com.vodafone.salary;

public class SalaryCalculationImp implements SalaryCalculation {

	@Override
	public double increment(double salary) {
		// TODO Auto-generated method stub
		return salary >= 25000 ? salary * salary : salary * .05;
	}

	@Override
	public double bonus(String designation) {
		// TODO Auto-generated method stub
		return designation.equalsIgnoreCase("trainer") ? 500 : 250;
	}

}
