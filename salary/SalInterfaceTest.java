package com.vodafone.salary;

import java.util.Scanner;

public class SalInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("id? ");
		int id = input.nextInt();
		input.nextLine();		//takes the newline character from the keyboard buffer & throws it away
		
		System.out.println("Name? ");
		String name = input.nextLine();
		
		System.out.println("Designation? ");
		String designation = input.nextLine();
		
		System.out.println("Salary? ");
		double salary = input.nextDouble();
		
		SalaryCalculation calc = new SalaryCalculationImp();
		System.out.println("Salary Increment: " + calc.increment(salary));
		System.out.println("Bonus: " + calc.bonus("Trainer"));
		
/*		Inner Anonymous Class
		 It the SalaryCalaculationImp Class is not created we can directly call the methods using inner anonymous class
		SalaryCalculation calc = new SalaryCalculation() {
			
			@Override
			public double increment(double salary) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public double bonus(String designation) {
				// TODO Auto-generated method stub
				return 0;
			}
		};*/
		
	}

}
